package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;

public class CustomerView extends View {

    private Customer customer;

    public CustomerView(ViewManager viewManager, Customer customer) {
        super(viewManager);
        name = "Kunde";
        this.customer = customer;
    }

    @Override
    public void show() {
        String text = "Name\n";
        text += "\t" + customer.getFirstName() + " " + customer.getLastName() + "\n";
        text += "Email\n";
        text += "\t" + customer.getEmail() + "\n";
        text += "Firma\n";
        text += "\t" + customer.getCompany() + "\n";
        this.text = text;
        super.show();
    }

    @Override
    public void evaluate(String input) {

    }
}
