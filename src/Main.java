import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialisierungen
        Ticket[] tickets = new Ticket[100];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        String input;

        // Ein Beispiel-Angestellter
        Employee employee = new Employee("Mike", "Barkmin", "mb@company.de", "IT");
        // Ein Beispiel-Kunde
        Customer customer = new Customer("Gero", "Behler", "gb@uni.de", "Uni Due");

        // Zwei Beispieltickets
        tickets[count] = new Ticket(
                "Beschreibung",
                "Aufgenommen",
                employee,
                customer,
                1);
        count++;

        tickets[count] = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                3);
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
                                        + ticket.getPriority() + "\t "
                                        + ticket.getEmployee().getFirstName() + " " + ticket.getEmployee().getLastName() + "\t"
                                        + ticket.getCustomer().getFirstName() + " " + ticket.getCustomer().getLastName());
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
