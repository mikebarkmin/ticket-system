package de.ddi.ticketsystem;

public class TicketManager {
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
     */
    public void add(Ticket ticket) {
        tickets.add(ticket);
    }

    /**
     * Entfernt das Übergebene Ticket aus der Datenstruktur.
     * @param ticket das entfernt werden soll
     */
    public void remove(Ticket ticket) {
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current.equals(ticket)) {
                tickets.remove(i);
                break;
            }
        }
    }


    /**
     * Gibt alle Tickets aus der Datenstruktur zurück. Sind keine Tickets vorhanden wird eine leere Liste zurückgeben.
     * @return TicketListe aller Tickets
     */
    public TicketList getAll() {
        TicketList tickets = new TicketList();
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
            if(oldest == null) {
                oldest = current;
            } else if(current.getCreationDate().compareTo(oldest.getCreationDate()) < 0) {
                oldest = current;
            }
        }
        return oldest;
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
}
