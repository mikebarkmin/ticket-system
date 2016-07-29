package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.User;
import util.List;

public class UsersView extends View {

    /**
     * List der Benutzer
     */
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
        // Liste der Benutzer durchlaufen
        for(int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            // Ausgabestring generieren. Bsp: 1) Heiko Topf Angestellter
            text += i + ") " + user.getFirstName() + " " + user.getLastName() + " ";
            if (user instanceof Employee) {
                text += "Angsteller";
            } else {
                text += "Kunde";
            }
            text += "\n";
        }
        this.text = text;
        // die show Methode von der Oberklasse View aufrufen
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
                // einen Benutzer auswählen und dann anzeigen
                showUser(selectUser());
                break;
            case "H":
                // einen neuen Benutzer anlegen
                createUser();
                break;
        }
    }

    /**
     * Den übergebenen Benutzer anzeigen
     * @param user Benutzer
     */
    private void showUser(User user) {
        // Überprüfen, ob ein Employee oder ein Customer angezeigt werden soll
        if (user instanceof Employee) {
            // user auf den Typ Employee casten, einen EmployeeView erstellen und als nächsten View setzten
            viewManager.setNextView(new EmployeeView(viewManager, (Employee) user));
        } else {
            // user auf den Typ Customer casten, einen CustomerView erstellen und als nächsten View setzten
            viewManager.setNextView(new CustomerView(viewManager, (Customer) user));
        }
    }

    /**
     * Auf die Usernummer horchen und dann den passenden Benutzer zurückgeben
     * @return User
     */
    private User selectUser() {
        // auf die Usernummer horchen
        System.out.print("Usernummer: ");
        int userId = scanner.nextInt();
        return users.get(userId);
    }

    /**
     * Einen neuen Kunden oder Angestellten anlegen
     */
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
