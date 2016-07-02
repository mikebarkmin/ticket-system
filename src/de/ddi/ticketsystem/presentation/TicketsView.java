package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;
import util.List;

public class TicketsView extends View {

    private List<Ticket> tickets;
    private Ticket selectedTicket;

    public TicketsView(UserManager userManager, TicketManager ticketManager) {
        super(userManager);
        this.name = "Tickets";
        this.tickets = ticketManager.getTickets();

        String text = "";
        for(int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            text += i + ") " + ticket.getDescription() + "\t" + ticket.getPriority() + "\n";
        }
        this.text = text;
        this.options = new String[]{
                "[A]uswählen",
                "[B]eenden"
        };
    }

    @Override
    protected void evaluate(String input) {
        input = input.toUpperCase();
        switch (input) {
            case "B":
                this.state = "exit";
                break;
            case "A":
                this.selectTicket();
                break;
        }
    }

    private void selectTicket() {
        int ticketId = this.scanner.nextInt();
        this.selectedTicket = this.tickets.get(ticketId);
        this.state = "ticket-selected";
    }

    public Ticket getSelectedTicket() {
        return selectedTicket;
    }
}
