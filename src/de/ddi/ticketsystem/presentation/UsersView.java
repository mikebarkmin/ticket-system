package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.User;
import util.List;

public class UsersView extends View {

    private List<User> users;

    /**
     * Erstellt eine Anzeige zum Ausgeben einer Nutzerliste mit den Optionen, einen Nutzer auszuwählen oder einen neuen
     * hinzuzufügen.
     * @param viewManager
     */
    public UsersView(ViewManager viewManager) {
        super(viewManager);
        name = "Users";
        users = viewManager.getUserManager().getAll();

        options = new String[]{
                "[A]uswählen",
        };
        employeeOptions = new String[]{
                "[H]inzufügen",
        };
    }

    @Override
    public void show() {
        String text = "";
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            text += i + ") " + user.getFirstName() + " " + user.getLastName() + " ";
            if (user instanceof Employee) {
                text += "Angsteller";
            } else {
                text += "Kunde";
            }
            text += "\n";
        }
        this.text = text;
        super.show();
    }

    /**
     * Wertet die Anzeige aus.
     * Wurde "A" eingegeben, wird eine Möglichkeit zur Auswahl eines Nutzers ausgegeben und der ViewManager angewiesen,
     * als nächstes den Nutzer anzuzeigen.
     * Wurde "H" eingegeben, wird eine Möglichkeit zum Anlegen eines neuen Benutzers angezeigt.
     * @param input Die Eingabe des Nutzers
     */
    @Override
    public void evaluate(String input) {
        switch (input) {
            case "A":
                showUser(selectUser());
                break;
            case "H":
                createUser();
                break;
        }
    }

    private void showUser(User user) {
        if (user instanceof Employee) {
            viewManager.setNextView(new EmployeeView(viewManager, (Employee) user));
        } else {
            viewManager.setNextView(new CustomerView(viewManager, (Customer) user));
        }
    }

    private User selectUser() {
        System.out.print("Usernummer: ");
        int userId = scanner.nextInt();
        return users.get(userId);
    }

    private void createUser() {
        System.out.println("[A]ngestellter, [K]unde");
        String input = scanner.next().toUpperCase();
        System.out.print("Vorname: ");
        String firstName = scanner.next();
        System.out.print("Nachname: ");
        String lastName = scanner.next();
        System.out.print("E-Mail: ");
        String email = scanner.next();
        User user;
        switch (input) {
            case "A":
                System.out.print("Abteilung: ");
                String department = scanner.next();
                user = new Employee(firstName, lastName, email, department);
                viewManager.getUserManager().add(user);
                break;
            case "K":
                System.out.print("Firma: ");
                String company = scanner.next();
                user = new Customer(firstName, lastName, email, company);
                viewManager.getUserManager().add(user);
                break;
        }
    }
}
