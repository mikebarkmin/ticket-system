import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.*;
import de.ddi.ticketsystem.presentation.ViewManager;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();
        UserManager userManager = new UserManager();
        ViewManager viewManager = new ViewManager(userManager, ticketManager);


        Employee employee = new Employee("Mike", "Barkmin", "m@b.de", "DDI");
        userManager.add(employee);

        Customer customer = new Customer("Gero", "Behler", "g@b.de", "Uni Due");
        userManager.add(customer);

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

        viewManager.run();
    }
}
