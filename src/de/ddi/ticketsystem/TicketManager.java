package de.ddi.ticketsystem;

public class TicketManager {
    private Ticket[] tickets;
    private int count = 0;

    public TicketManager(int size) {
        this.tickets = new Ticket[size];
    }

    public void add(Ticket... tickets) {
        for(int i = 0; i < tickets.length; i++) {
            if (count < this.tickets.length - 1) {
                this.tickets[count++] = tickets[i];
            } else {
                System.out.println("Der TicketManager ist voll!");
            }
        }
    }

    public void remove(Ticket ticket) {
        for(int i = 0; i < tickets.length; i++) {
            Ticket current = tickets[i];
            if(current.equals(ticket)) {
                tickets[i] = null;
                break;
            }
        }
    }

    public Ticket[] getAll() {
        return tickets;
    }

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
