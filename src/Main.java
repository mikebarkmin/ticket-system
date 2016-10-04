import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialisierungen
        Ticket[] tickets = new Ticket[100];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input;

        // Zwei Beispieltickets
        tickets[count] = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                "Mike Barkmin",
                "Paluno",
                1);
        count++;

        tickets[count] = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                "Gero Behler",
                "Paluno",
                1);
        count++;

        // Schleife zur Nutzerinteraktion
        do {
            System.out.println("[T]ickets, [H]inzufügen, [B]eenden");
            input = scanner.next();
            input = input.toUpperCase();

            switch(input) {
                case "T":
                    for(Ticket ticket : tickets)
                    {
                        if (ticket != null) {
                            if(ticket != null) {
                                System.out.println(ticket.getStatus() + "\t " + ticket.getDescription() + "\t "
                                        + ticket.getPriority() + "\t " + ticket.getEmployee() + "\t"
                                        + ticket.getCustomer());
                            }
                        }
                    }
                    break;

                case "H":
                    // Dateneingabe zum Ticket
                    System.out.print("Beschreibung: ");
                    String description = scanner.next();
                    System.out.print("Status: ");
                    String status = scanner.next();
                    System.out.print("Priorität: ");
                    int priority = scanner.nextInt();
                    System.out.println("Angestellter: ");
                    String employee = scanner.next();
                    System.out.println("Kunde: ");
                    String customer = scanner.next();

                    // Ticket zum Array hinzufügen und Zähler inkrementieren
                    Ticket toAdd = new Ticket(description, status, employee, customer, priority);
                    tickets[count] = toAdd;
                    count++;
                    break;

                case "B":
                    System.out.println("Programm wird beendet.");
                    break;

                default:
                    System.out.println("Ungültige Eingabe.");
                    break;
            }

        } while(!input.equals("B"));
    }
}
