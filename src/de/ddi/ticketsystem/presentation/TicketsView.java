package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.TicketManager;
import de.ddi.ticketsystem.logic.UserManager;
import util.List;
import util.Lists;

import java.util.Comparator;

public class TicketsView extends View {

    private List<Ticket> tickets;
    private Ticket selectedTicket;

    public TicketsView(UserManager userManager, TicketManager ticketManager) {
        super(userManager);
        this.name = "Tickets";
        this.tickets = ticketManager.getTickets();

        this.options = new String[]{
                "[A]uswählen",
                "[S]ortieren",
                "[B]eenden"
        };
    }

    @Override
    public void show() {
        String text = "";
        for(int i = 0; i < this.tickets.size(); i++) {
            Ticket ticket = this.tickets.get(i);
            text += i + ") " + ticket.getDescription() + "\t" + ticket.getPriority() + "\n";
        }
        this.text = text;
        super.show();
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
            case "S":
                this.selectSort();
                break;
        }
    }

    private void selectTicket() {
        System.out.println("Ticketnummer: ");
        int ticketId = this.scanner.nextInt();
        this.selectedTicket = this.tickets.get(ticketId);
        this.state = "ticket-selected";
    }

    private void selectSort() {
        String[] sortOptions = {
                "Nach [B]eschreibung",
                "Nach [P]riorität",
        };
        String out = "";
        for (String option : sortOptions) {
            out += "\n" + option;
        }

        System.out.println(out);

        String input = this.scanner.next();
        input = input.toUpperCase();

        switch (input) {
            case "B":
                Lists.sort(this.tickets, new Comparator<Ticket>() {
                    @Override
                    public int compare(Ticket ticket, Ticket t1) {
                        return ticket.getDescription().compareTo(t1.getDescription());
                    }
                });
                break;
            case "P":
                Lists.sort(this.tickets, new Comparator<Ticket>() {
                    @Override
                    public int compare(Ticket ticket, Ticket t1) {
                        if(ticket.getPriority() > t1.getPriority()) {
                            return 1;
                        } else if(ticket.getPriority() < t1.getPriority()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                });
                break;
        }
        this.show();
    }

    public Ticket getSelectedTicket() {
        return selectedTicket;
    }
}
