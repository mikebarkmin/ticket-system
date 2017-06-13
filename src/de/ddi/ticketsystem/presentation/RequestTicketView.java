package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.RequestTicket;
import de.ddi.ticketsystem.logic.Status;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RequestTicketView extends TicketView {

    private JTextField serviceField;
    private JFormattedTextField dateField;

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

        JLabel dateLabel = new JLabel("Date");
        labels.add(dateLabel);
        return labels;
    }

    protected List<Component> getAdditionalFields() {
        List<Component> fields = new ArrayList<>();
        JLabel serviceLabel = new JLabel(((RequestTicket) this.ticket).getService());
        fields.add(serviceLabel);

        JLabel dateLabel = new JLabel(((RequestTicket) this.ticket).getDate().toString());
        fields.add(dateLabel);
        return fields;
    }

    protected List<Component> getAdditionalEditableFields() {
        List<Component> editableFields = new ArrayList<>();
        serviceField = new JTextField();
        editableFields.add(serviceField);

        dateField = new JFormattedTextField(new Date());
        editableFields.add(dateField);
        return editableFields;
    }

    protected RequestTicket createTicketFromFields() {
        String description = this.getDescription();
        Status status = this.getStatus();
        Employee employee = this.getEmployee();
        Customer customer = this.getCustomer();
        int priority = this.getPriority();
        Date date = (Date) dateField.getValue();
        String service = serviceField.getText();
        RequestTicket requestTicket = new RequestTicket(description, status, employee, customer, priority, date, service);
        return requestTicket;
    }
}
