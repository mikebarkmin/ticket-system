import de.ddi.ticketsystem.logic.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();


        Employee employee = new Employee("Mike", "Barkmin", "m@b.de", "DDI");
        Customer customer = new Customer("Gero", "Behler", "g@b.de", "Uni Due");

        Ticket ticket = new MalfunctionTicket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                2,
                "test");

        ticketManager.add(ticket);

        ticket = new OrderTicket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                1,
                "Microsoft",
                "Windows 10",
                "Schützenbahn 10",
                20);

        ticketManager.add(ticket);

        ticket = new RequestTicket(
                "Beschreibung",
                "In Bearbeitung",
                employee,
                customer,
                3,
                new Date(),
                "repair");

        ticketManager.add(ticket);

        Ticket oldest = ticketManager.getOldest();
        System.out.println(oldest.getCreationDate());
    }
}
