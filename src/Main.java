public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                "Beschreibung",
                "In Bearbeitung",
                "Mike Barkmin",
                "Paluno",
                1);
        
        System.out.println(ticket.getCustomer());

        // Der Default-Konstuktor exisitert nur, wenn kein anderer deklariert ist oder
        // wenn er expliziert deklariert wurde.
        //Ticket ticket2 = new Ticket();
    }
}
