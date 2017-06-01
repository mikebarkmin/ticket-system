package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;

import javax.swing.*;

public class CustomerView extends View {

    private Customer customer;

    /**
     * Erstellt eine Anzeige, die die Daten zu einem Kunden anzeigt
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param customer Kunde, dessen Daten angezeigt werden sollen
     */
    public CustomerView(ViewManager viewManager, Customer customer) {
        super(viewManager);
        this.customer = customer;
    }

    @Override
    protected String getName() {
        return "Customer";
    }

    @Override
    public JPanel getBody() {
        String text = "Name\n";
        text += "\t" + customer.getFirstName() + " " + customer.getLastName() + "\n";
        text += "Email\n";
        text += "\t" + customer.getEmail() + "\n";
        text += "Firma\n";
        text += "\t" + customer.getCompany() + "\n";

        JTextArea textArea = new JTextArea();
        textArea.setText(text);
        JPanel body = new JPanel();
        body.add(textArea);
        return body;
    }
}
