import de.ddi.ticketsystem.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();

        DataGenerator.fillTicketManager(ticketManager);

        Employee employee = DataGenerator.employee;
        Customer customer = DataGenerator.customer;

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input;
        TicketList tickets = new TicketList();
        do {
            System.out.println("[T]ickets, [S]tatus ändern, [F]inden, [H]inzufügen, [E]ntfernen, [N]ächtes, [Ä]ltestes, [B]eenden");
            input = scanner.next();
            input = input.toUpperCase();
            if(input.equals("T")) {
                tickets = ticketManager.getAll();
                showTicketList(tickets);
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
                Ticket ticket = ticketManager.getAll().get(ticketId);
                System.out.println("Aktueller Status: " + ticket.getStatus());
                Status status;
                System.out.print("Neuer Status: ");
                System.out.println("(" + Status.RECORDED + ", " + Status.PROCESSED + ", " +
                        Status.WAITING_FOR_FEEDBACK + ", " + Status.SOLVED + ", " + Status.CLOSED + ")");
                String sStatus = scanner.next();
                status = Status.valueOf(sStatus);
                ticket.setStatus(status);
            } else if(input.equals("F")) {
                System.out.println("Suchbegriff: ");
                String search = scanner.next();
                tickets = ticketManager.search(search);
                showTicketList(tickets);
            }
        } while (!input.equals("B"));
        scanner.close();
    }

    public static void showTicketList(TicketList tickets) {
        for(int i = 0; i < tickets.size(); i++) {
            Ticket current = tickets.get(i);
            if(current != null) {
                System.out.println(i + ") " + current.getStatus() + "\t " + current.getDescription() + "\t " +
                                   current.getPriority() + "\t " + current.getCreationDate());
            }
        }
    }
}
