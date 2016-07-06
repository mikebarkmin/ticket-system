package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;
import util.List;

public class TicketsView extends View {

    private List<Ticket> tickets;

    public TicketsView(ViewManager viewManager) {
        super(viewManager);
        this.name = "Tickets";
        this.tickets = this.viewManager.getTicketManager().getTickets();

        this.options = new String[]{
                "[A]uswählen"
        };
    }

    @Override
    public void show() {
        String text = "";
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            text += i + ") " + ticket.getDescription() + "\t" + ticket.getPriority() + "\n";
        }
        this.text = text;
        super.show();
    }

    @Override
    public void evaluate(String input) {
        switch (input) {
            case "A":
                this.selectTicket();
                break;
            default:
                break;
        }
    }

    private void selectTicket() {
        System.out.println("Ticketnummer: ");
        int ticketId = this.scanner.nextInt();
        Ticket ticket = this.tickets.get(ticketId);
        this.viewManager.setNextView(new TicketView(this.viewManager, ticket));
    }
}
