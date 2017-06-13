package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.RequestTicket;
import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RequestTicketView extends TicketView {

    private JTextField serviceField;

    public RequestTicketView(ViewManager viewManager, RequestTicket requestTicket) {
        super(viewManager, requestTicket);
    }

    public RequestTicketView(ViewManager viewManager) {
        super(viewManager);
    }

    protected List<Component> getAdditionalLabels() {
        List<Component> labels = new ArrayList<>();
        JLabel serviceLabel = new JLabel("Service");
        labels.add(serviceLabel);
        return labels;
    }

    protected List<Component> getAdditionalFields() {
        List<Component> fields = new ArrayList<>();
        JLabel serviceLabel = new JLabel(((RequestTicket) this.ticket).getService());
        fields.add(serviceLabel);
        return fields;
    }

    protected List<Component> getAdditionalEditableFields() {
        List<Component> editableFields = new ArrayList<>();
        serviceField = new JTextField(20);
        editableFields.add(serviceField);
        return editableFields;
    }

    protected RequestTicket createTicketFromFields() {
        String description = this.getDescription();
        Status status = this.getStatus();
        Employee employee = this.getEmployee();
        Customer customer = this.getCustomer();
        int priority = this.getPriority();
        Date date = new Date();
        String service = serviceField.getText();
        RequestTicket requestTicket = new RequestTicket(description, status, employee, customer, priority, date, service);
        return requestTicket;
    }
}
