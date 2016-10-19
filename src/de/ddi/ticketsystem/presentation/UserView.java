package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.User;

public class UserView extends View {

    private User user;

    /**
     * Erstellt eine Anzeige, die die Daten zu einem Mitarbeiter anzeigt
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param user Mitarbeiter, dessen Daten angezeigt werden sollen
     */
    public UserView(ViewManager viewManager, User user) {
        super(viewManager);
        name = "Nutzer";
        this.user = user;
    }

    /**
     * Gibt die Daten des eines Mitarbeiters aus
     */
    @Override
    public void show() {
        String text = "Name\n";
        text += "\t" + user.getFirstName() + " " + user.getLastName() + "\n";
        text += "Email\n";
        text += "\t" + user.getEmail() + "\n";
        text += this.getSpecificInfo(user);
        this.text = text;
        super.show();
    }

    private String getSpecificInfo(User user) {
        String result = "";
        if (user instanceof Employee) {
            Employee employee = (Employee)user;
            result = "Rolle\n"
                + "\tAngestellter\n"
                + "Abteilung\n"
                + "\t" + employee.getDepartment() + "\n";
        } else if (user instanceof Customer) {
            Customer customer = (Customer)user;
            result = "Rolle\n"
                + "\tKunde\n"
                + "Firma\n"
                + "\t" + customer.getCompany() + "\n";
        }
        return result;
    }

    /**
     * Es muss nichts ausgewertet werden
     */
    @Override
    public void evaluate(String input) {

    }
}