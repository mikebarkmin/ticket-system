package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;

public class ViewManager {

    private UserManager userManager;
    private TicketManager ticketManager;
    private View current;

    public ViewManager(UserManager userManager, TicketManager ticketManager) {
        this.userManager = userManager;
        this.ticketManager = ticketManager;
        this.current = new LoginView(this.userManager);
    }

    public void run() {
        String state = "";
        while(state != "exit") {
            switch (state) {
                case "logged-in":
                    current = new TicketsView(userManager, ticketManager);
                    current.show();
                    state = current.getState();
                    break;
                case "failed-logged-in":
                    break;
                case "ticket-selected":
                    Ticket selected = ((TicketsView) current).getSelectedTicket();
                    current = new TicketView(userManager, selected);
                    break;
               default:
                    current.show();
                    state = current.getState();
                    break;
            }
        }
    }
}
