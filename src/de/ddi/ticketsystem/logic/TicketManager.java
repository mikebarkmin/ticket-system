package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;
import util.BinaryTree;
import util.List;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TicketManager extends Manager{
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
        load();
    }

    /**
     * Lädt alle Tickets ";"-getrennt in eine Liste und weist einen Zugriff vom Typ Access an, diese zu speichern.
     * Zusätzlich werden dem Notizenmanager eine ID zu jedem Ticket mit den zugehörigen Tickets übergeben.n
     */
    @Override
    public void save() {
        List<String> data = new List<>();
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            int employeeId = userManager.indexOf(ticket.getEmployee());
            int customerId = userManager.indexOf(ticket.getCustomer());
            String sTicket = i + ";" + employeeId + ";" + customerId + ";" + ticket.saveToText();
            data.add(sTicket);
            noteManager.addToSave(i, ticket.getNotes());
        }
        try {
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
    protected void load() {
        try {
            List<String> data = access.load();
            for(int i = 0; i < data.size(); i++) {
                String sTicket = data.get(i);
                String[] values = sTicket.split(";");
                Ticket ticket;
                Employee employee = (Employee) userManager.get(Integer.parseInt(values[1]));
                Customer customer = (Customer) userManager.get(Integer.parseInt(values[2]));
                Status status = Status.valueOf(values[5]);
                int priority = Integer.parseInt(values[6]);
                DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.GERMANY);
                Date creationDate;
                try {
                    creationDate = formatter.parse(values[7]);
                } catch (ParseException e) {
                    creationDate = new Date();
                    e.printStackTrace();
                }
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
     */
    public void add(Ticket ticket) {
        tickets.add(ticket);
        List<Ticket> userTickets = ticketsByEmployee.get(ticket.getEmployee());
        if (userTickets == null) {
            userTickets = new List<>();
            ticketsByEmployee.insert(ticket.getEmployee(), userTickets);
        }
        userTickets.add(ticket);
    }

    /**
     * Entfernt das übergebene Ticket aus der Datenstruktur.
     * @param ticket das entfernt werden soll
     */
    public void remove(Ticket ticket) {
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
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
        List<Ticket> tickets = new List<>();
        for(int i = 0; i < this.tickets.size(); i++) {
            tickets.add(this.tickets.get(i));
        }
        return tickets;
    }

    /**
     * Die Methode gibt das älteste Ticket zurück oder eine Null-Referenz, wenn kein Ticket in der Datenstruktur
     * existiert.
     * @return das älteste Ticket
     */
    public Ticket getOldest() {
        Ticket oldest = null;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current.getStatus() == Status.CLOSED) {
                continue;
            }
            if(oldest == null) {
                oldest = current;
            } else if(current.getCreationDate().compareTo(oldest.getCreationDate()) < 0) {
                oldest = current;
            }
        }
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
        Ticket next = null;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current.getStatus() == Status.CLOSED) {
                continue;
            }
            // TODO: Erst Statusabfrage, dann null-Abfrage. Können Fehler auftreten?
            if(current != null) {
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
        }
        return next;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
