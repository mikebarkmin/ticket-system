package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class CustomerView extends UserView {

    private JTextField companyField;

    public CustomerView(ViewManager viewManager, Customer customer) {
        super(viewManager, customer);
    }

    public CustomerView(ViewManager viewManager) {
        super(viewManager);
    }

    @Override
    protected List<Component> getAdditionalLabels() {
        List<Component> labels = new ArrayList<>();

        JLabel companyLabel = new JLabel("Company");
        labels.add(companyLabel);

        return labels;
    }

    @Override
    protected List<Component> getAdditionalFields() {
        List<Component> fields = new ArrayList<>();

        JLabel companyField = new JLabel(((Customer) this.user).getCompany());
        fields.add(companyField);

        return fields;
    }

    @Override
    protected List<Component> getAdditionalEditableFields() {
        List<Component> editableFields = new ArrayList<>();

        this.companyField = new JTextField(20);
        editableFields.add(this.companyField);

        return editableFields;
    }

    @Override
    protected String getName() {
        return "Customer";
    }

    @Override
    protected Customer createUserFromFields() {
        String firstName = this.getFirstName();
        String lastName = this.getLastName();
        String email = this.getEmail();
        String company = this.companyField.getText();

        Customer customer = new Customer(firstName, lastName, email, company);
        return customer;
    }
}
