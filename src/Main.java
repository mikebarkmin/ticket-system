import de.ddi.ticketsystem.data.Access;
import de.ddi.ticketsystem.data.NoteAccessText;
import de.ddi.ticketsystem.data.TicketAccessText;
import de.ddi.ticketsystem.data.UserAccessText;
import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.*;
import de.ddi.ticketsystem.presentation.ViewManager;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Access noteAccess = new NoteAccessText();
        Access userAccess = new UserAccessText();
        Access ticketAccess = new TicketAccessText();

        UserManager userManager = new UserManager(userAccess);
        NoteManager noteManager = new NoteManager(noteAccess, userManager);
        TicketManager ticketManager = new TicketManager(ticketAccess, noteManager, userManager);

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

        ViewManager viewManager = new ViewManager(userManager, ticketManager, noteManager);
        viewManager.run();
    }
}
