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
                "Fehler im System",
                Status.RECORDED,
                employee,
                customer,
                2,
                new Date(),
                "repair");

        ticketManager.add(ticket);

        ticket = new RequestTicket(
                "CD-Laufwerk beschädigt",
                Status.RECORDED,
                employee,
                customer,
                2,
                new Date(),
                "repair");

        ticketManager.add(ticket);

        ticket = new MalfunctionTicket(
                "Bug korrigieren",
                Status.RECORDED,
                employee,
                customer,
                1,
                "reboot");

        ticketManager.add(ticket);

        ticket = new MalfunctionTicket(
                "Netzwerk nicht gefunden",
                Status.RECORDED,
                employee,
                customer,
                1,
                "reboot");

        ticketManager.add(ticket);

        ticket = new OrderTicket(
                "System aufräumen",
                Status.RECORDED,
                employee,
                customer,
                3,
                "dingssoft",
                "doors",
                "Plastic Valley",
                19);

        ticketManager.add(ticket);

        ticket = new OrderTicket(
                "System kaufen",
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
