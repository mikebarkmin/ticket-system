package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;
import util.List;

import java.io.IOException;
import java.util.Date;

public class TicketManager extends Manager{
    private List<Ticket> tickets;
    private NoteManager noteManager;
    private UserManager userManager;

    public TicketManager(Access access, NoteManager noteManager, UserManager userManager) {
        super(access);
        this.tickets = new List<>();
        this.noteManager = noteManager;
        this.userManager = userManager;
        this.load();
    }

    @Override
    public void save() {
        List<String> data = new List<>();
        for(int i = 0; i < this.tickets.size(); i++) {
            Ticket ticket = this.tickets.get(i);
            int employeeId = this.userManager.indexOf(ticket.getEmployee());
            int customerId = this.userManager.indexOf(ticket.getCustomer());
            String sTicket = i + ";" + employeeId + ";" + customerId + ";" + ticket.saveToText();
            data.add(sTicket);
            this.noteManager.addToSave(i, ticket.getNotes());
        }
        try {
            this.access.save(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void load() {
        try {
            List<String> data = this.access.load();
            for(int i = 0; i < data.size(); i++) {
                String sTicket = data.get(i);
                String[] values = sTicket.split(";");
                Ticket ticket;
                Employee employee = (Employee) this.userManager.get(Integer.parseInt(values[1]));
                Customer customer = (Customer) this.userManager.get(Integer.parseInt(values[2]));
                int priority = Integer.parseInt(values[6]);
                switch (values[3]) {
                    case "REQUEST":
                        Date date = new Date(values[7]);
                        ticket = new RequestTicket(values[4], values[5], employee, customer, priority, date, values[8]);
                        this.tickets.add(ticket);
                        break;
                    case "ORDER":
                        int quantity = Integer.parseInt(values[10]);
                        ticket = new OrderTicket(values[4], values[5], employee, customer, priority, values[7],
                                values[8], values[9], quantity);
                        this.tickets.add(ticket);
                        break;
                    case "MALFUNCTION":
                        ticket = new MalfunctionTicket(values[4], values[5], employee, customer, priority, values[7]);
                        this.tickets.add(ticket);
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Ticket... tickets) {
        for(int i = 0; i < tickets.length; i++) {
            this.tickets.add(tickets[i]);
        }
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

    public List<Ticket> getTickets() {
        return tickets;
    }
}
