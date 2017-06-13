package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.OrderTicket;
import java.awt.Component;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OrderTicketView extends TicketView {

    private JTextField vendorField;
    private JTextField articleField;
    private JTextField addressField;
    private JFormattedTextField quantityField;

    public OrderTicketView(ViewManager viewManager, OrderTicket requestTicket) {
        super(viewManager, requestTicket);
    }

    public OrderTicketView(ViewManager viewManager) {
        super(viewManager);
    }

    protected List<Component> getAdditionalLabels() {
        List<Component> labels = new ArrayList<>();
        JLabel vendorLabel = new JLabel("Vendor");
        labels.add(vendorLabel);
        JLabel articleLabel = new JLabel("Article");
        labels.add(articleLabel);
        JLabel addressLabel = new JLabel("Address");
        labels.add(addressLabel);
        JLabel quantityLabel = new JLabel("Quantity");
        labels.add(quantityLabel);
        return labels;
    }

    protected List<Component> getAdditionalFields() {
        List<Component> fields = new ArrayList<>();
        OrderTicket orderTicket = (OrderTicket) this.ticket;
        JLabel vendorField = new JLabel(orderTicket.getVendor());
        fields.add(vendorField);
        JLabel articleField = new JLabel(orderTicket.getArticle());
        fields.add(articleField);
        JLabel addressField = new JLabel(orderTicket.getAddress());
        fields.add(addressField);
        JLabel quantityLabel = new JLabel(orderTicket.getQuantity() + "");
        fields.add(quantityLabel);
        return fields;
    }

    protected List<Component> getAdditionalEditableFields() {
        List<Component> fields = new ArrayList<>();
        OrderTicket orderTicket = (OrderTicket) this.ticket;
        vendorField = new JTextField();
        fields.add(vendorField);
        articleField = new JTextField();
        fields.add(articleField);
        addressField = new JTextField();
        fields.add(addressField);
        quantityField = new JFormattedTextField(NumberFormat.getIntegerInstance());
        fields.add(quantityField);
        return fields;
    }

    protected OrderTicket createTicketFromFields() {
        return null;
    }
}
