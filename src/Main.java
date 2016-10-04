import de.ddi.ticketsystem.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();

        Employee employee = new Employee("Mike", "Barkmin", "mb@company.de", "IT");
        Customer customer = new Customer("Gero", "Behler", "gb@uni.de", "Uni Due");

        Ticket ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                2);

        ticketManager.add(ticket);

        ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                1);

        ticketManager.add(ticket);

        ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                3);

        ticketManager.add(ticket);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        String input;
        do {
            System.out.println("[T]ickets, [H]inzufügen, [E]ntfernen, [N]ächtes, [Ä]ltestes, [B]eenden");
            input = scanner.next();
            input = input.toUpperCase();
            if(input.equals("T")) {
                TicketList tickets = ticketManager.getAll();
                // for(Ticket ticket : tickets) {
                for(int i = 0; i < tickets.size(); i++) {
                    Ticket current = tickets.get(i);
                    if(current != null) {
                        System.out.println(i + ") " + current.getStatus() + "\t " + current.getDescription() + "\t " + current.getPriority() + "\t " + current.getCreationDate());
                    }
                }
            } else if(input.equals("H")) {
                System.out.print("Beschreibung: ");
                String description = scanner.next();
                System.out.print("Status: ");
                String status = scanner.next();
                System.out.print("Priorität: ");
                int priority = scanner.nextInt();
                Ticket toAdd = new Ticket(description, status, employee, customer, priority);
                ticketManager.add(toAdd);
            } else if(input.equals("E")) {
                System.out.println("Ticketnummer: ");
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
            }
        } while (!input.equals("B"));
        scanner.close();
    }
}
