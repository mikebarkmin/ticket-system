package de.ddi.ticketsystem.presentation;

import java.util.Date;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.MalfunctionTicket;
import de.ddi.ticketsystem.logic.OrderTicket;
import de.ddi.ticketsystem.logic.RequestTicket;
import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.Ticket;
import util.List;

public class TicketsView extends View {

    private List<Ticket> tickets;

    /**
     * Erstellt eine Anzeige, die alle Tickets ausgibt und Optionen zur Auswahl eines Tickets,
     * zum Anzeigen des nächsten Tickets, zum Anzeigen des ältesten Tickets, zum Erstellen eines Tickets,
     * zum Löschen eines Tickets anzeigt
     * @param viewManager
     */
    public TicketsView(ViewManager viewManager) {
        super(viewManager);
        name = "Tickets";
        tickets = this.viewManager.getTicketManager().getAll();

        options = new String[]{
                "[A]uswählen",
                "[Ä]ltestes"
        };
        employeeOptions = new String[]{
                "[N]ächstes",
                "[H]inzufügen",
                "[L]öschen"
        };
    }

    /**
     * Gibt alle Tickets mit Beschreibung und Priorität aus und zeigt die Anzeige an
     */
    @Override
    public void show() {
        String text = "";
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            text += i + ") " + abbreviate(ticket.getDescription(), 20) + "\t"
            		+ ticket.getPriority() + "\t" 
            		+ ticket.getCustomer().getFirstName() + " " + ticket.getCustomer().getLastName() + "\t" 
            		+ ticket.getEmployee().getFirstName() + " " + ticket.getEmployee().getLastName()+ "\n";
        }
        this.text = text;
        super.show();
    }
    
    private String abbreviate(String string, int length) {
    	String abbrev = string;
    	if (string.length() > length) {
    		abbrev = string.substring(0, length - 3) + "...";
    	} else {
    		abbrev = String.format("%-" + length + "s", "bar");
    	}
    	return abbrev;
    }

    /**
     * Auswertung der Anzeige.
     * Wurde "A" eingegeben, wird eine Möglichkeit zur Auswahl eines Tickets ausgegeben und anschließend das Ticket
     * angezeigt.
     * Wurde "N" eingegeben, wird das nächste Ticket angezeigt.
     * Wurde "Ä" eingegeben, wird das älteste Ticket angezeigt.
     * Wurde "H" eingegeben, wird eine Möglichkeit zum Erstellen eines Tickets angezeigt.
     * Wurde "L" eingegeben, wird eine Möglichkeit zur Auswahl eines Tickets ausgegeben und anschließend das Ticket
     * gelöscht.
     * @param input Die Eingabe des Nutzers
     */
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
            default:
                break;
        }
    }

    private void createTicket() {
        System.out.println("[B]estellung, [S]törung, [A]nforderung");
        String input = scanner.next().toUpperCase();
        System.out.println("Kunden auswählen: ");
        List<Customer> customers = viewManager.getUserManager().getCustomers();
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(i + ") " + customer.getFirstName() + " " + customer.getLastName() + " "
                    + customer.getCompany() + " " + customer.getEmail());
        }
        int customerId = scanner.nextInt();
        Customer customer = customers.get(customerId);
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
}
