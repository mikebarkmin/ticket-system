import de.ddi.ticketsystem.data.Access;
import de.ddi.ticketsystem.data.NoteAccessSQLite;
import de.ddi.ticketsystem.data.TicketAccessSQLite;
import de.ddi.ticketsystem.data.UserAccessSQLite;
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

        Access noteAccess = new NoteAccessSQLite();
        Access userAccess = new UserAccessSQLite();
        Access ticketAccess = new TicketAccessSQLite();

        UserManager userManager = new UserManager(userAccess);
        NoteManager noteManager = new NoteManager(noteAccess, userManager);
        TicketManager ticketManager = new TicketManager(ticketAccess, noteManager, userManager);

        ViewManager viewManager = new ViewManager(userManager, ticketManager, noteManager);
        viewManager.run();
    }
}
