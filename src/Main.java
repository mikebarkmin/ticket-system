import de.ddi.ticketsystem.logic.*;
import de.ddi.ticketsystem.presentation.ViewManager;


public class Main {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();
        UserManager userManager = new UserManager();
        ViewManager viewManager = new ViewManager(userManager, ticketManager);

        DataGenerator.fillManager(ticketManager, userManager);
        
        viewManager.run();
    }
}
