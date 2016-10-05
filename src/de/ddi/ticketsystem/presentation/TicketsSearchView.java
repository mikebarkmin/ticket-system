package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.*;
import util.List;

public class TicketsSearchView extends TicketsView {
    public TicketsSearchView(ViewManager viewManager, List<Ticket> tickets) {
        super(viewManager);
        this.tickets = tickets;
        name = "Tickets-Suche";
    }
}
