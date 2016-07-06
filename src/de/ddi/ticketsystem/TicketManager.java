package de.ddi.ticketsystem;

public class TicketManager {
    private TicketList tickets;

    public TicketManager() {
        this.tickets = new TicketList();
    }

    public void add(Ticket... tickets) {
        for(int i = 0; i < tickets.length; i++) {
            this.tickets.add(tickets[i]);
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

    public Ticket next() {
        Ticket next = null;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current != null) {
                if(next != null) {
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
