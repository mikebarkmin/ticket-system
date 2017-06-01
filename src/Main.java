import de.ddi.ticketsystem.data.Access;
import de.ddi.ticketsystem.data.NoteAccessText;
import de.ddi.ticketsystem.data.TicketAccessText;
import de.ddi.ticketsystem.data.UserAccessText;
import de.ddi.ticketsystem.logic.NoteManager;
import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;
import de.ddi.ticketsystem.presentation.ViewManager;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {

        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {

        }

        Access noteAccess = new NoteAccessText();
        Access userAccess = new UserAccessText();
        Access ticketAccess = new TicketAccessText();

        UserManager userManager = new UserManager(userAccess);
        NoteManager noteManager = new NoteManager(noteAccess, userManager);
        TicketManager ticketManager = new TicketManager(ticketAccess, noteManager, userManager);

        ViewManager viewManager = new ViewManager(userManager, ticketManager, noteManager);
        viewManager.run();
    }
}
