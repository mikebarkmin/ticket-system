import de.ddi.ticketsystem.*;
import util.List;

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
        List<Ticket> tickets = new List<>();
        do {
            System.out.println("[T]ickets, [A]nzeigen, [S]tatus ändern, [H]inzufügen, [E]ntfernen, [N]ächtes, [Ä]ltestes, [B]eenden");
            input = scanner.next();
            input = input.toUpperCase();
            if(input.equals("T")) {
                tickets = ticketManager.getAll();
                for(int i = 0; i < tickets.size(); i++) {
                    Ticket current = tickets.get(i);
                    if(current != null) {
                        System.out.println(i + ") " + current.getStatus() + "\t " + current.getDescription() + "\t " +
                                           current.getPriority() + "\t " + current.getCreationDate());
                    }
                }
            } else if(input.equals("H")) {
                System.out.println("[T]icket, [N]otiz");
                input = scanner.next().toUpperCase();
                if(input.equals("T")) {
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
                } else if(input.equals("N")) {
                    System.out.print("Ticketnummer: ");
                    int ticketId = scanner.nextInt();
                    Ticket ticket = ticketManager.getAll().get(ticketId);
                    System.out.print("Titel: ");
                    String title = scanner.next();
                    System.out.print("Inhalt: ");
                    String content = scanner.next();
                    Note note = new Note(title, content, employee);
                    ticket.addNote(note);
                }
            } else if(input.equals("E")) {
                System.out.println("[T]icket, [N]otiz");
                input = scanner.next().toUpperCase();
                System.out.print("Ticketnummer: ");
                int ticketId = scanner.nextInt();
                Ticket ticket = ticketManager.getAll().get(ticketId);
                if(input.equals("T")) {
                    ticketManager.remove(ticket);
                } else if(input.equals("N")) {
                    List<Note> notes = ticket.getNotes();
                    for(int i = 0; i < notes.size(); i++) {
                        Note note = notes.get(i);
                        System.out.println(i + ") " + note.getEmployee().getLastName() + ", " + note.getEmployee().getFirstName()
                                + "(" + note.getCreationDate() + ")");
                        System.out.println("\t" + note.getTitle());
                        System.out.println("\t" + note.getContent());
                    }
                    System.out.print("Notiznummer: ");
                    int noteId = scanner.nextInt();
                    Note toRemove = notes.get(noteId);
                    ticket.removeNote(toRemove);
                }
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
            } else if(input.equals("A")) {
                System.out.print("Ticketnummer: ");
                int ticketId = scanner.nextInt();
                Ticket ticket = tickets.get(ticketId);
                System.out.println("Angesteller: ");
                System.out.println("\t" + ticket.getEmployee().getFirstName() + " " + ticket.getEmployee().getLastName());
                System.out.println("Customer: ");
                System.out.println("\t" + ticket.getCustomer().getFirstName() + " " + ticket.getCustomer().getLastName());
                System.out.println("Beschreibung: ");
                System.out.println("\t" + ticket.getDescription());
                List<Note> notes = ticket.getNotes();
                for(int i = 0; i < notes.size(); i++) {
                    Note note = notes.get(i);
                    System.out.println(i + ") " + note.getEmployee().getLastName() + ", " + note.getEmployee().getFirstName()
                            + "(" + note.getCreationDate() + ")");
                    System.out.println("\t" + note.getTitle());
                    System.out.println("\t" + note.getContent());
                }
            }
        } while (!input.equals("B"));
        scanner.close();
    }
}
