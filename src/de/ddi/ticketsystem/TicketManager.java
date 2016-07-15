package de.ddi.ticketsystem;

public class TicketManager {
    private Ticket[] tickets;
    private int count = 0;

    /**
     * Erzeugt ein Objekt vom Typ TicketManager
     * @param size maximale Anzahl der Tickets, die der TickerManager verwalten kann
     */
    public TicketManager(int size) {
        tickets = new Ticket[size];
    }

    /**
     * Fügt am Ende der verwalteten Tickets das Übergebene an. Wenn kein Platz vorhanden ist, wird eine Fehlermeldung
     * ausgegeben.
     * @param ticket das hinzugefügt werden soll
     */
    public void add(Ticket ticket) {
        if (count < tickets.length - 1) {
            tickets[count++] = ticket;
        } else {
            System.out.println("Der TicketManager ist voll!");
        }
    }

    /**
     * Entfernt das Übergebene Ticket aus der Datenstruktur.
     * @param ticket das entfernt werden soll
     */
    public void remove(Ticket ticket) {
        for(int i = 0; i < tickets.length; i++) {
            Ticket current = tickets[i];
            if(current.equals(ticket)) {
                tickets[i] = null;
                break;
            }
        }
    }

    /**
     * Gibt alle Tickets aus der Datenstruktur zurück. Sind keine Tickets vorhanden wird ein leeres Array zurückgeben,
     * dessen Länge der Länge entspricht, die im Konstruktor angegeben wurde.
     * @return alle Tickets in einem Array
     */
    public Ticket[] getAll() {
        return tickets;
    }

    /**
     * Die Methode gibt das älteste Ticket zurück oder eine Null-Referenz, wenn kein Ticket in der Datenstruktur
     * existiert.
     * @return das älteste Ticket
     */
    public Ticket getOldest() {
        Ticket oldest = null;
        for(int i = 0; i < tickets.length; i++) {
           if(tickets[i] != null) {
               if(oldest == null) {
                   oldest = tickets[i];
               } else if(tickets[i].getCreationDate().compareTo(oldest.getCreationDate()) < 0) {
                   oldest = tickets[i];
               }
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
        for(int i = 0; i < tickets.length; i++) {
            if(tickets[i] != null) {
                if(next != null) {
                    next = tickets[i];
                } else if(next.getPriority() < tickets[i].getPriority()) {
                    next = tickets[i];
                } else if(next.getPriority() == tickets[i].getPriority()) {
                    if(tickets[i].getCreationDate().compareTo(next.getCreationDate()) < 0) {
                        next = tickets[i];
                    }
                }
            }
        }
        return next;
    }
}
