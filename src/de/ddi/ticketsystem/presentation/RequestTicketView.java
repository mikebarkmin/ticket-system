package de.ddi.ticketsystem.presentation;

import java.util.List;
import java.util.ArrayList;
import java.awt.Component;
import de.ddi.ticketsystem.logic.RequestTicket;

public class RequestTicketView extends TicketView {

    public RequestTicketView(ViewManager viewManager, RequestTicket requestTicket) {
        super(viewManager, requestTicket);
    }

    public RequestTicketView(ViewManager viewManager) {
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

    protected RequestTicket createTicketFromFields() {
        return null;
    }

    protected void modifyTicketFromFields() {

    }
}
