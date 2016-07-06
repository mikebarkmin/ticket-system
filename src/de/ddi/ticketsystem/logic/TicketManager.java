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

    public TicketManager(Access access, NoteManager noteManager, UserManager userManager) {
        super(access);
        tickets = new List<>();
        ticketsByEmployee = new BinaryTree<>();
        this.noteManager = noteManager;
        this.userManager = userManager;
        load();
    }

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
                DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
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

    public void add(Ticket... tickets) {
        for(int i = 0; i < tickets.length; i++) {
            Ticket ticket = tickets[i];
            this.tickets.add(ticket);
            List<Ticket> userTickets = ticketsByEmployee.get(ticket.getEmployee());
            if(userTickets == null) {
                userTickets = new List<>();
                ticketsByEmployee.insert(ticket.getEmployee(), userTickets);
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
        return ticketsByEmployee.get(employee);
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
