import de.ddi.ticketsystem.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();

        Employee employee = new Employee("Mike", "Barkmin", "mb@company.de", "IT");
        Customer customer = new Customer("Gero", "Behler", "gb@uni.de", "Uni Due");

        Ticket ticket = new Ticket(
                "Beschreibung",
                Status.RECORDED,
                employee,
                customer,
                2);

        ticketManager.add(ticket);

        ticket = new Ticket(
                "Beschreibung",
                Status.RECORDED,
                employee,
                customer,
                1);

        ticketManager.add(ticket);

        ticket = new Ticket(
                "Beschreibung",
                Status.RECORDED,
                employee,
                customer,
                3);

        ticketManager.add(ticket);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input;
        do {
            System.out.println("[T]ickets, [S]tatus ändern, [H]inzufügen, [E]ntfernen, [N]ächtes, [Ä]ltestes, [B]eenden");
            input = scanner.next();
            input = input.toUpperCase();
            if(input.equals("T")) {
                TicketList tickets = ticketManager.getAll();
                // for(Ticket ticket : tickets) {
                for(int i = 0; i < tickets.size(); i++) {
                    Ticket current = tickets.get(i);
                    if(current != null) {
                        System.out.println(i + ") " + current.getStatus() + "\t " + current.getDescription() + "\t "
                                + current.getPriority() + "\t " + current.getCreationDate());
                    }
                }
            } else if(input.equals("H")) {
                System.out.print("Beschreibung: ");
                String description = scanner.next();
                System.out.print("Status: ");
                Status status;
                System.out.println("(" + Status.RECORDED + ", " + Status.PROCESSED + ", " +
                        Status.WAITING_FOR_FEEDBACK + ", " + Status.SOLVED + ", " + Status.CLOSED + ")");
                String sStatus = scanner.next();
                status = Status.valueOf(sStatus);
                System.out.print("Priorität: ");
                int priority = scanner.nextInt();
                Ticket toAdd = new Ticket(description, status, employee, customer, priority);
                ticketManager.add(toAdd);
            } else if(input.equals("E")) {
                System.out.print("Ticketnummer: ");
                int ticketId = scanner.nextInt();
                Ticket toRemove = ticketManager.getAll().get(ticketId);
                ticketManager.remove(toRemove);
            } else if(input.equals("N")) {
            	Ticket next = ticketManager.next();
            	if(next != null) {
                    System.out.println(next.getStatus() + "\t " + next.getDescription() + "\t " + next.getPriority() + "\t " + next.getCreationDate());
                }
            } else if(input.equals("Ä")) {
            	Ticket oldest = ticketManager.getOldest();
            	if(oldest != null) {
                    System.out.println(oldest.getStatus() + "\t " + oldest.getDescription() + "\t " + oldest.getPriority() + "\t " + oldest.getCreationDate());
                }
            } else if(input.equals("S")) {
                System.out.print("Ticketnummer: ");
                int ticketId = scanner.nextInt();
                ticket = ticketManager.getAll().get(ticketId);
                System.out.println("Aktueller Status: " + ticket.getStatus());
                Status status;
                System.out.print("Neuer Status: ");
                System.out.println("(" + Status.RECORDED + ", " + Status.PROCESSED + ", " +
                        Status.WAITING_FOR_FEEDBACK + ", " + Status.SOLVED + ", " + Status.CLOSED + ")");
                String sStatus = scanner.next();
                status = Status.valueOf(sStatus);
                ticket.setStatus(status);
            }
        } while (!input.equals("B"));
        scanner.close();
    }
}
