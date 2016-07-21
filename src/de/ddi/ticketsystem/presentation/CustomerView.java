package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;

public class CustomerView extends View {

    private Customer customer;

    /**
     * Erstellt eine Anzeige, die die Daten zu einem Kunden anzeigt
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param customer Kunde, dessen Daten angezeigt werden sollen
     */
    public CustomerView(ViewManager viewManager, Customer customer) {
        super(viewManager);
        name = "Kunde";
        this.customer = customer;
    }

    /**
     * Gibt die Daten des eines Kunden aus
     */
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
