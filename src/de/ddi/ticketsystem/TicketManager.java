package de.ddi.ticketsystem;

/**
 * Der TicketManager ist für die Verwaltung von Tickets zuständig
 */
public class TicketManager {
    /**
     * Gespeicherte Tickets
     */
    private TicketList tickets;

    /**
     * Erstellt ein Objekt vom Typ TicketManager. Dabei wird eine neue Instanz von TicketList erzeugt.
     */
    public TicketManager() {
        tickets = new TicketList();
    }

    /**
     * Fügt am Ende der verwalteten Tickets das Übergebene an. Wenn kein Platz vorhanden ist, wird eine Fehlermeldung
     * ausgegeben.
     * @param ticket das hinzugefügt werden soll
     * @see TicketList#add(Ticket)
     */
    public void add(Ticket ticket) {
        // Ticket der Liste hinzufügen
        tickets.add(ticket);
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
     * Gibt alle Tickets zurück, die den Suchbegriff beinhalten
     * @param search Suchbegriff
     * @return TicketList Liste von Tickets, die den Suchbegriff beinhalten
     */
    public TicketList search(String search) {
        return tickets.search(search);
    }


    /**
     * Gibt alle Tickets aus der Datenstruktur zurück. Sind keine Tickets vorhanden wird eine leere Liste zurückgeben.
     * @return TicketListe aller Tickets
     */
    public TicketList getAll() {
        // Flache Kopie der Ticket Liste anlegen, um das Entfernen und Hinzufügen, welches nicht vom TicketManager
        // ausgeht zu vermeiden.
        TicketList tickets = new TicketList();
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
}
