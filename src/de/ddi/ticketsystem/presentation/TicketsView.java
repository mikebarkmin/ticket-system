package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.*;
import util.List;

import java.util.Comparator;
import java.util.Date;

public class TicketsView extends View {

    private List<Ticket> tickets;

    public TicketsView(ViewManager viewManager) {
        super(viewManager);
        name = "Tickets";
        tickets = this.viewManager.getTicketManager().getTickets();

        options = new String[]{
                "[A]uswählen",
                "[N]ächstes",
                "[Ä]ltestes",
                "[H]inzufügen",
                "[L]öschen",
                "[S]ortieren"
        };
    }

    @Override
    public void show() {
        String text = "";
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            text += i + ") " + ticket.getDescription() + "\t" + ticket.getPriority() + "\n";
        }
        this.text = text;
        super.show();
    }

    @Override
    public void evaluate(String input) {
        switch (input) {
            case "A":
                showTicket(selectTicket());
                break;
            case "N":
                showNext();
                break;
            case "Ä":
                showOldest();
                break;
            case "H":
                createTicket();
                break;
            case "L":
                deleteTicket(selectTicket());
                break;
            case "S":
                sort();
            default:
                break;
        }
    }

    private void createTicket() {
        System.out.println("[B]estellung, [S]törung, [A]nforderung");
        System.out.println("Kunden auswählen: ");
        List<Customer> customers = viewManager.getUserManager().getCustomers();
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(i + ") " + customer.getFirstName() + " " + customer.getLastName() + " "
                    + customer.getCompany() + " " + customer.getEmail());
        }
        int customerId = scanner.nextInt();
        Customer customer = customers.get(customerId);
        String input = scanner.next().toUpperCase();
        System.out.print("Beschreibung: ");
        String description = scanner.next();
        Status status = Status.RECORDED;
        System.out.print("Priorität: ");
        int priority = scanner.nextInt();
        System.out.println("Angestellen auswählen: ");
        List<Employee> employees = viewManager.getUserManager().getEmployees();
        for(int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(i + ") " + employee.getFirstName() + " " + employee.getLastName() + " "
                    + employee.getDepartment() + " " + employee.getEmail());
        }
        int employeeId = scanner.nextInt();
        Employee employee = employees.get(employeeId);
        switch (input) {
            case "S": {
                System.out.print("Gerätservice: ");
                String deviceService = scanner.next();
                Ticket ticket = new MalfunctionTicket(description, status, employee, customer, priority, deviceService);
                viewManager.getTicketManager().add(ticket);
                break;
            }
            case "A": {
                System.out.print("Datum: ");
                Date date = new Date();
                System.out.print("Service: ");
                String service = scanner.next();
                Ticket ticket = new RequestTicket(description, status, employee, customer, priority, date, service);
                viewManager.getTicketManager().add(ticket);
                break;
            }
            case "B": {
                System.out.print("Lieferant: ");
                String vendor = scanner.next();
                System.out.print("Artikel: ");
                String article = scanner.next();
                System.out.print("Adresse: ");
                String address = scanner.next();
                System.out.print("Anzahl: ");
                int quantity = scanner.nextInt();
                Ticket ticket = new OrderTicket(description, status, employee, customer, priority,
                        vendor, article, address, quantity);
                viewManager.getTicketManager().add(ticket);
                break;
            }
        }
    }

    private void deleteTicket(Ticket ticket) {
        viewManager.getTicketManager().remove(ticket);
    }

    private Ticket selectTicket() {
        System.out.println("Ticketnummer: ");
        int ticketId = scanner.nextInt();
        return tickets.get(ticketId);
    }

    private void showNext() {
        Ticket ticket = viewManager.getTicketManager().next();
        showTicket(ticket);
    }

    private void showOldest() {
        Ticket ticket = viewManager.getTicketManager().getOldest();
        showTicket(ticket);
    }

    private void showTicket(Ticket ticket) {
        viewManager.setNextView(new TicketView(viewManager, ticket));
    }

    private void sort() {
        System.out.println("[P]riorität, [D]atum, [A]ngestellter, [K]unde");
        String input = scanner.next();
        switch (input) {
            case "P":
                tickets.sort(new Comparator<Ticket>() {
                    @Override
                    public int compare(Ticket ticket, Ticket t1) {
                        return ticket.getPriority() - t1.getPriority();
                    }
                });
                break;
            case "D":
                tickets.sort(new Comparator<Ticket>() {
                    @Override
                    public int compare(Ticket ticket, Ticket t1) {
                        return ticket.getCreationDate().compareTo(t1.getCreationDate());
                    }
                });
                break;
            case "A":
                tickets.sort(new Comparator<Ticket>() {
                    @Override
                    public int compare(Ticket ticket, Ticket t1) {
                        return ticket.getEmployee().compareTo(t1.getEmployee());
                    }
                });
                break;
            case "K":
                tickets.sort(new Comparator<Ticket>() {
                    @Override
                    public int compare(Ticket ticket, Ticket t1) {
                        return ticket.getCustomer().compareTo(t1.getCustomer());
                    }
                });
                break;
        }
    }
}
