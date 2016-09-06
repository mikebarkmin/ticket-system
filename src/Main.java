import de.ddi.ticketsystem.*;
import util.List;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();

        Employee employee = new Employee("Mike", "Barkmin", "m@b.de", "ddi");
        Customer customer = new Customer("Gero", "Behler", "g@b.de", "Uni Due");

        Ticket ticket = new RequestTicket(
                "Beschreibung",
                Status.RECORDED,
                employee,
                customer,
                2,
                new Date(),
                "repair");

        ticketManager.add(ticket);

        ticket = new MalfunctionTicket(
                "Beschreibung",
                Status.RECORDED,
                employee,
                customer,
                1,
                "reboot");

        ticketManager.add(ticket);

        ticket = new OrderTicket(
                "Beschreibung",
                Status.RECORDED,
                employee,
                customer,
                3,
                "dingssoft",
                "doors",
                "Plastic Valley",
                19);

        ticketManager.add(ticket);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input;
        do {
            System.out.println("[T]ickets, [A]nzeigen, [S]tatus ändern, [H]inzufügen, [E]ntfernen, [N]ächtes, [Ä]ltestes, [B]eenden");
            input = scanner.next();
            input = input.toUpperCase();
            if(input.equals("T")) {
                System.out.println("[A]lle, [M]eine");
                input = scanner.next().toUpperCase();
                List<Ticket> tickets = new List<>();
                if(input.equals("A")) {
                    tickets = ticketManager.getAll();
                    // for(Ticket ticket : tickets) {
                } else if(input.equals("M")) {
                    tickets = ticketManager.getFromEmployee(employee);
                }
                for(int i = 0; i < tickets.size(); i++) {
                    Ticket current = tickets.get(i);
                    if(current != null) {
                        System.out.println(i + ") " + current.getStatus() + "\t " + current.getDescription() + "\t "
                                + current.getPriority() + "\t " + current.getCreationDate());
                    }
                }
            } else if(input.equals("H")) {
                System.out.println("[T]icket, [N]otiz");
                input = scanner.next().toUpperCase();
                if(input.equals("T")) {
                    System.out.println("[B]estellung, [S]törung, [A]nforderung");
                    String ticketType = scanner.next().toUpperCase();
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
                    if(ticketType.equals("S")) {
                        System.out.print("Gerätservice: ");
                        String deviceService = scanner.next();
                        Ticket toAdd = new MalfunctionTicket(description, status, employee, customer, priority, deviceService);
                        ticketManager.add(toAdd);
                    } else if(ticketType.equals("A")) {
                        System.out.print("Datum: ");
                        Date date = new Date();
                        System.out.print("Service: ");
                        String service = scanner.next();
                        Ticket toAdd = new RequestTicket(description, status, employee, customer, priority, date, service);
                        ticketManager.add(toAdd);
                    } else if(ticketType.equals("B")) {
                        System.out.print("Lieferant: ");
                        String vendor = scanner.next();
                        System.out.print("Artikel: ");
                        String article = scanner.next();
                        System.out.print("Adresse: ");
                        String address = scanner.next();
                        System.out.print("Anzahl: ");
                        int quantity = scanner.nextInt();
                        Ticket toAdd = new OrderTicket(description, status, employee, customer, priority,
                                vendor, article, address, quantity);
                        ticketManager.add(toAdd);
                    }
                } else if(input.equals("N")) {
                    System.out.print("Ticketnummer: ");
                    int ticketId = scanner.nextInt();
                    ticket = ticketManager.getAll().get(ticketId);
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
                ticket = ticketManager.getAll().get(ticketId);
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
                ticket = ticketManager.getAll().get(ticketId);
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
                ticket = ticketManager.getAll().get(ticketId);
                System.out.println("Angesteller: ");
                System.out.println("\t" + ticket.getEmployee().getFirstName() + " " + ticket.getEmployee().getLastName());
                System.out.println("Customer: ");
                System.out.println("\t" + ticket.getCustomer().getFirstName() + " " + ticket.getCustomer().getLastName());
                System.out.println("Beschreibung: ");
                System.out.println("\t" + ticket.getDescription());

                System.out.println(getSpecificInfo(ticket));

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

    private static String getSpecificInfo(Ticket ticket) {
        String result = "";
        if(ticket instanceof OrderTicket)
        {
            OrderTicket orderTicket = (OrderTicket)ticket;
            result = "Verkäufer: " + orderTicket.getVendor()
                    + "\nArtikel: " + orderTicket.getArticle()
                    + "\nAdresse: " + orderTicket.getAddress()
                    + "\nAnzahl: " + orderTicket.getQuantity();

        }
        else if(ticket instanceof RequestTicket) {
            RequestTicket requestTicket = (RequestTicket)ticket;
            result =  "Datum: " + requestTicket.getDate()
                    + "\nService: " + requestTicket.getService();
        }
        else if(ticket instanceof MalfunctionTicket) {
            result = "GeräteService: " + ((MalfunctionTicket)ticket).getDeviceService();
        }
        return result;
    }
}
