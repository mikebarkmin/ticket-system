package de.ddi.ticketsystem.logic;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import de.ddi.ticketsystem.data.Access;
import util.BinaryTree;
import util.List;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Der TicketManager ist für die Verwaltung von Tickets zuständig
 */
public class TicketManager extends Manager{
    /**
     * Gespeicherte Tickets
     */
    private List<Ticket> tickets;
    private NoteManager noteManager;
    private UserManager userManager;
    private BinaryTree<Employee, List<Ticket>> ticketsByEmployee;


    /**
     * Erstellt ein Objekt vom Typ TicketManager. Dabei werden je eine neue Instanz von List<> und BinaryTree<>
     * erzeugt
     */
    public TicketManager(Access access, NoteManager noteManager, UserManager userManager) {
        super(access);
        tickets = new List<>();
        ticketsByEmployee = new BinaryTree<>();
        this.noteManager = noteManager;
        this.userManager = userManager;
    }

    /**
     * Lädt alle Tickets ";"-getrennt in eine Liste und weist einen Zugriff vom Typ Access an, diese zu speichern.
     * Zusätzlich werden dem Notizenmanager eine ID zu jedem Ticket mit den zugehörigen Tickets übergeben.n
     */
    @Override
    public void save() throws IOException {
        List<String> data = new List<>();
        // Liste der Tickets durchlaufen
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            // ID des Angestellten ermitteln
            int employeeId = userManager.indexOf(ticket.getEmployee());
            // ID des Kunden ermitteln
            int customerId = userManager.indexOf(ticket.getCustomer());
            // den zu speichernden String erstellen
            String sTicket = i + ";" + employeeId + ";" + customerId + ";" + ticket.saveToText();
            data.add(sTicket);
            // die Notizen des Tickets für das Speichern vorbereiten
            noteManager.addToSave(i, ticket.getNotes());
        }
        try {
            // versuchen zu speichern
            access.save(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Weißt einen Zugriff vom Typ Access an, die Tickets in eine Liste aus ";"-getrennten Zeichenketten zu laden,
     * erstellt aus diesen Daten die entsprechenden Ticket-Objekte und fügt diese zur Verwaltung durch den TicketManager
     * hinzu.
     */
    @Override
    public void load() throws IOException {
        try {
            List<String> data = access.load();
            // Liste der geladenen Strings durchlaufen
            for(int i = 0; i < data.size(); i++) {
                String sTicket = data.get(i);
                // den String an den Semikolons aufteilen
                String[] values = sTicket.split(";");
                Ticket ticket;
                // den Angestellten anhand der ID ermitteln
                Employee employee = (Employee) userManager.get(Integer.parseInt(values[1]));
                // den Kunden anhand der der ID ermitteln
                Customer customer = (Customer) userManager.get(Integer.parseInt(values[2]));
                Status status = Status.valueOf(values[5]);
                int priority = Integer.parseInt(values[6]);
                // das Datumsformat festlegen
                DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
                Date creationDate;
                try {
                    // versuchen das Datum zu lesen
                    creationDate = formatter.parse(values[7]);
                } catch (ParseException e) {
                    creationDate = new Date();
                    e.printStackTrace();
                }
                // abhängig von der Art des Tickets das Objekt erstellen
                switch (values[3]) {
                    case "REQUEST":
                        Date date = null;
                        try {
                            date = formatter.parse(values[8]);
                        } catch (ParseException e) {
                            date = new Date();
                            e.printStackTrace();
                        }
                        ticket = new RequestTicket(values[4], status, employee, customer, priority, date, values[9]);
                        ticket.setCreationDate(creationDate);
                        tickets.add(ticket);
                        break;
                    case "ORDER":
                        int quantity = Integer.parseInt(values[11]);
                        ticket = new OrderTicket(values[4], status, employee, customer, priority, values[8],
                                values[9], values[10], quantity);
                        ticket.setCreationDate(creationDate);
                        tickets.add(ticket);
                        break;
                    case "MALFUNCTION":
                        ticket = new MalfunctionTicket(values[4], status, employee, customer, priority, values[8]);
                        ticket.setCreationDate(creationDate);
                        tickets.add(ticket);
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Fügt am Ende der verwalteten Tickets das Übergebene an. Zusätzlich  wird das Ticket in eienr Liste gespeichert,
     * die als Wert in einem Binärbaum gespeichert wird, in dem der Name des bearbeitenden Mitarbeiters als Key
     * verwendet wird.
     * @param ticket das hinzugefügt werden soll
     * @see List#add(Object)
     * @see BinaryTree#insert(Comparable, Object)
     */
    public void add(Ticket ticket) {
        // Ticket der Liste hinzufügen
        tickets.add(ticket);
        List<Ticket> userTickets = ticketsByEmployee.get(ticket.getEmployee());
        if (userTickets == null) {
            userTickets = new List<>();
            ticketsByEmployee.insert(ticket.getEmployee(), userTickets);
        }
        userTickets.add(ticket);
    }

    /**
     * Setzt den Status des übergebenen Tickets auf CLOSED, so dass es von der Bearbeitung ausgeschlossen ist.
     * @param ticket welches geschlossen werden soll
     */
    public void remove(Ticket ticket) {
        // Die Liste von Tickets durchlaufen
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            // Überprüfen, ob das momentane Ticket gleich dem zu löschenden ist.
            if(current.equals(ticket)) {
                current.setStatus(Status.CLOSED);
                break;
            }
        }
    }

    /**
     * Gibt alle Tickets aus der Datenstruktur zurück. Sind keine Tickets vorhanden, wird eine leere Liste zurückgeben.
     * @return List<Ticket> aller Tickets
     */
    public List<Ticket> getAll() {
        // Flache Kopie der Ticket Liste anlegen, um das Entfernen und Hinzufügen, welches nicht vom TicketManager
        // ausgeht zu vermeiden.
        List<Ticket> tickets = new List<>();
        for(int i = 0; i < this.tickets.size(); i++) {
            tickets.add(this.tickets.get(i));
        }
        return tickets;
    }

    /**
     * Die Methode gibt das älteste Ticket zurück oder eine Null-Referenz, wenn kein Ticket in der Datenstruktur
     * existiert.
     *
     * @return das älteste Ticket
     */
    public Ticket getOldest() {
        // initialisieren der Variablen oldest, in der das älteste Ticket gespeichert werden soll
        Ticket oldest = null;
        // Die Liste von Tickets durchlaufen
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            // Ist das momentane Ticket geschlossen, dann wird es übersprungen
            if(current.getStatus() == Status.CLOSED) {
                continue;
            }
            // Wenn noch kein Ältestes zwischengespeichert wurde, dann speichern wir das momentane Ticket als Ältestes.
            // Wenn dies nicht der Fall ist, werden die Erstellungsdaten des momentane Ältesten und es momentanen Tickets
            // verglichen. Ist das momentane Ticket älter, dann wird es als Ältestes zwischengespeichert.
            if(oldest == null) {
                oldest = current;
            } else if(current.getCreationDate().compareTo(oldest.getCreationDate()) < 0) {
                oldest = current;
            }
        }
        // das älteste Ticket wird zurückgeben, wenn eins gefunden wurde, sonst wird null zurückgegeben.
        return oldest;
    }

    /**
     * Gibt eine Liste von Tickets zurück, die dem Mitarbeiter zugewiesen sind.
     * @param employee Employee als Schlüssel
     * @return List<Ticket> mit den Tickets des Mitarbeiters
     */
    public List<Ticket> getFromEmployee(Employee employee) {
        return ticketsByEmployee.get(employee);
    }

    /**
     * Gibt das nächste zu bearbeitende Ticket zurück. Das erste Kriterium ist die Priorität, das zweite das
     * Erstellungsdatum und das dritte die Position in der Datenstruktur. Wenn keine Tickets vorhanden sind, wird eine
     * Null-Referenz zurückgeben.
     * @return das Ticket, welches als nächstes bearbeitet werden soll
     */
    public Ticket next() {
        // initialisieren der Variable next, in der das nächste Ticket gespeichert werden soll
        Ticket next = null;
        // Die Liste von Tickets durchlaufen
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            // Ist das momentane Ticket geschlossen, dann wird es übersprungen
            if(current.getStatus() == Status.CLOSED) {
                continue;
            }
            // Wenn noch kein Nächstes zwischengespeichert wurde, dann speichern wir das momentane Ticket als Nächstes.
            // Wenn dies nicht der Fall ist, werden die Prioritäten der beiden Tickets miteinander verglichen.
            // Ist die Priorität vom momentanen Ticket größere als vom Nächsten, dann wird diese Ticket
            // zwischengespeichert. Sind die Prioritäten gleich, dann werden die Erstellungsdaten verglichen. Hat
            // das momentane Ticket ein älteres Erstellungsdatum als das Nächste, wird es als Nächstes
            // zwischengespeichert.
            if(next == null) {
                next = current;
            } else if(next.getPriority() < current.getPriority()) {
                next = current;
            } else if(next.getPriority() == current.getPriority()) {
                if(current.getCreationDate().compareTo(next.getCreationDate()) < 0) {
                    next = current;
                }
            }
        }
        // das nächste Ticket wird zurückgeben, wenn eines gefunden wurde, sonst wird null zurückgegeben.
        return next;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
