package de.ddi.ticketsystem.presentation;

import java.util.List;
import java.util.ArrayList;
import java.awt.Component;
import de.ddi.ticketsystem.logic.MalfunctionTicket;

public class MalfunctionTicketView extends TicketView {

    public MalfunctionTicketView(ViewManager viewManager, MalfunctionTicket requestTicket) {
        super(viewManager, requestTicket);
    }

    public MalfunctionTicketView(ViewManager viewManager) {
        super(viewManager);
    }
    protected List<Component> getAdditionalLabels() {
        return new ArrayList<>();
    }

    protected List<Component> getAdditionalFields() {
        return new ArrayList<>();
    }

    protected List<Component> getAdditionalEditableFields() {
        return new ArrayList<>();
    }

    protected MalfunctionTicket createTicketFromFields() {
        return null;
    }
}
