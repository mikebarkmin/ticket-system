package de.ddi.ticketsystem.logic;

import util.BinaryTree;
import util.List;

public class TicketManager {
    private List<Ticket> tickets;
    private BinaryTree<Employee, List<Ticket>> ticketsByEmployee;

    public TicketManager() {
        this.tickets = new List<>();
        this.ticketsByEmployee = new BinaryTree<>();
    }

    public void add(Ticket... tickets) {
        for(int i = 0; i < tickets.length; i++) {
            Ticket ticket = tickets[i];
            this.tickets.add(ticket);
            List<Ticket> userTickets = this.ticketsByEmployee.get(ticket.getEmployee());
            if(userTickets == null) {
                userTickets = new List<>();
                this.ticketsByEmployee.insert(ticket.getEmployee(), userTickets);
            }
            userTickets.add(ticket);
        }
    }

    public void remove(Ticket ticket) {
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current.equals(ticket)) {
                current.setStatus(Status.CLOSED);
                break;
            }
        }
    }

    public List<Ticket> getAll() {
        return tickets;
    }

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

    public List<Ticket> getFromEmployee(Employee employee) {
        return this.ticketsByEmployee.get(employee);
    }

    public Ticket next() {
        Ticket next = null;
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current.getStatus() == Status.CLOSED) {
                continue;
            }
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
