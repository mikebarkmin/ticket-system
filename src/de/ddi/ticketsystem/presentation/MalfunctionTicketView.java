package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.MalfunctionTicket;
import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MalfunctionTicketView extends TicketView {

    private JTextField deviceServiceField;

    public MalfunctionTicketView(ViewManager viewManager, MalfunctionTicket requestTicket) {
        super(viewManager, requestTicket);
    }

    public MalfunctionTicketView(ViewManager viewManager) {
        super(viewManager);
    }
    protected List<Component> getAdditionalLabels() {
        List<Component> labels = new ArrayList<>();
        JLabel deviceServiceLabel = new JLabel("Device Service");
        labels.add(deviceServiceLabel);
        return labels;
    }

    protected List<Component> getAdditionalFields() {
        List<Component> fields = new ArrayList<>();
        JLabel deviceServiceField = new JLabel(((MalfunctionTicket) ticket).getDeviceService());
        fields.add(deviceServiceField);
        return fields;
    }

    protected List<Component> getAdditionalEditableFields() {
        List<Component> fields = new ArrayList<>();
        deviceServiceField = new JTextField();
        fields.add(deviceServiceField);
        return fields;
    }

    protected MalfunctionTicket createTicketFromFields() {
        String description = this.getDescription();
        Status status = this.getStatus();
        Employee employee = this.getEmployee();
        Customer customer = this.getCustomer();
        int priority = this.getPriority();
        String deviceService = deviceServiceField.getText();
        MalfunctionTicket ticket = new MalfunctionTicket(description, status, employee, customer, priority, deviceService);
        return ticket;
    }
}
