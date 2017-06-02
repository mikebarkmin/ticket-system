package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CustomerView extends View {

    private Customer customer;
    private JPanel body;

    /**
     * Erstellt eine Anzeige, die die Daten zu einem Kunden anzeigt
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param customer Kunde, dessen Daten angezeigt werden sollen
     */
    public CustomerView(ViewManager viewManager, Customer customer) {
        super(viewManager);
        this.customer = customer;
        body = new JPanel();
        body.add(new JLabel(customer.toString()));
    }

    public CustomerView(ViewManager viewManager) {
        super(viewManager);
        body = new JPanel();
        body.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.ipadx = 5;
        c.ipady = 5;
        c.gridy = 0;
        c.gridx = 0;
        JLabel firstNameLabel = new JLabel("First Name");
        body.add(firstNameLabel, c);
        c.gridx += 1;
        JTextField firstNameField = new JTextField(20);
        body.add(firstNameField, c);

        c.gridy += 1;
        c.gridx = 0;
        JLabel lastNameLabel = new JLabel("Last Name");
        body.add(lastNameLabel, c);
        c.gridx += 1;
        JTextField lastNameField = new JTextField(20);
        body.add(lastNameField, c);

        c.gridy += 1;
        c.gridx = 0;
        JLabel emailLabel = new JLabel("Email");
        body.add(emailLabel, c);
        c.gridx += 1;
        JTextField emailField = new JTextField(20);
        body.add(emailField, c);

        c.gridy += 1;
        c.gridx = 0;
        JLabel companyLabel = new JLabel("Company");
        body.add(companyLabel, c);
        c.gridx += 1;
        JTextField companyField = new JTextField(20);
        body.add(companyField, c);

        JButton create = new JButton("Create");
        create.addActionListener(e -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String email = emailField.getText();
            String company = companyField.getText();
            Customer customer = new Customer(
                firstName, lastName, email, company
            );
            viewManager.getUserManager().add(customer);
            viewManager.goBackwards();
        });
        c.gridy += 1;
        c.gridx = 0;
        c.gridwidth = 2;
        body.add(create, c);
    }

    @Override
    protected String getName() {
        return "Customer";
    }

    @Override
    public JPanel getBody() {
        return body;
    }
}
