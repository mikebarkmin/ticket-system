package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.*;
import util.List;

import java.util.Date;

public class TicketsView extends View {

    protected List<Ticket> tickets;

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
            text += i + ") " + ticket.getStatus() + "\t " + ticket.getDescription() + "\t "
                    + ticket.getPriority() + "\t " + ticket.getCreationDate() + System.lineSeparator();
        }
        this.text = text;
        super.show();
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

    /**
     * Methode zum Erstellen eines neuen Tickets
     */
    private void createTicket() {
    	// Art
        System.out.println("[B]estellung, [S]törung, [A]nforderung");
        String input = scanner.next().toUpperCase();
        
        // Kunde
        System.out.println("Kunden auswählen: ");
        List<Customer> customers = viewManager.getUserManager().getCustomers();
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(i + ") " + customer.getFirstName() + " " + customer.getLastName() + " "
                    + customer.getCompany() + " " + customer.getEmail());
        }
        int customerId = scanner.nextInt();
        Customer customer = customers.get(customerId);
        
        // Beschreibung
        System.out.print("Beschreibung: ");
        String description = scanner.next();
        
        // Status wird automatisch gesetzt
        Status status = Status.RECORDED;
        
        // Priorität
        System.out.print("Priorität: ");
        int priority = scanner.nextInt();
        
        // Angestellten auswählen
        System.out.println("Angestellen auswählen: ");
        List<Employee> employees = viewManager.getUserManager().getEmployees();
        for(int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(i + ") " + employee.getFirstName() + " " + employee.getLastName() + " "
                    + employee.getDepartment() + " " + employee.getEmail());
        }
        int employeeId = scanner.nextInt();
        Employee employee = employees.get(employeeId);
        
        // Art spezifische Eigenschaften abfragen
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

    /**
     * Weist den TicketManager an ein Ticket zu löschen
     * @param ticket das zulöschende Ticket
     */
    private void deleteTicket(Ticket ticket) {
        viewManager.getTicketManager().remove(ticket);
    }

    /**
     * Wählt ein Ticket aus einer Liste aus.
     * @return das ausgewählte Ticket
     */
    private Ticket selectTicket() {
        System.out.println("Ticketnummer: ");
        int ticketId = scanner.nextInt();
        return tickets.get(ticketId);
    }

    /**
     * Zeige das als nächstes zu bearbeitende Ticket an
     */
    private void showNext() {
        Ticket ticket = viewManager.getTicketManager().next();
        showTicket(ticket);
    }

    /**
     * Zeige das älteste Ticket an
     */
    private void showOldest() {
        Ticket ticket = viewManager.getTicketManager().getOldest();
        showTicket(ticket);
    }

    /**
     * Zeige ein Ticket an.
     * @param ticket das anzuzeigende Ticket
     */
    private void showTicket(Ticket ticket) {
        viewManager.setNextView(new TicketView(viewManager, ticket));
    }
}
