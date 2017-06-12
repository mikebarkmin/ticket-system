
package de.ddi.ticketsystem.presentation;

import java.util.List;
import java.util.ArrayList;
import java.awt.Component;
import de.ddi.ticketsystem.logic.OrderTicket;

public class OrderTicketView extends TicketView {

    public OrderTicketView(ViewManager viewManager, OrderTicket requestTicket) {
        super(viewManager, requestTicket);
    }

    public OrderTicketView(ViewManager viewManager) {
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

    protected OrderTicket createTicketFromFields() {
        return null;
    }

    protected void modifyTicketFromFields() {

    }
}
