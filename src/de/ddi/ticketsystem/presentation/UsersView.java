package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Customer;
import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.User;
import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class UsersView extends View {

    /**
     * List der Benutzer
     */
    private List<User> users;
    private JPanel body;

    /**
     * Erstellt eine Anzeige zum Ausgeben einer Nutzerliste mit den Optionen, einen Nutzer auszuwählen oder einen neuen
     * hinzuzufügen.
     * @param viewManager
     */
    public UsersView(ViewManager viewManager) {
        super(viewManager);
        users = viewManager.getUserManager().getAll();
        body = new JPanel();
        body.setLayout(new GridLayout(0, 2, 10, 10));
    }

    @Override
    protected String getName() {
        return "Users";
    }

    @Override
    public Component getBody() {
        body.removeAll();
        users.forEach(user -> body.add(createUserPanel(user)));
        return body;
    }

    @Override
    public JPanel getMenu() {
        JPanel menu = new JPanel();
        JButton createUser = new JButton("Create User");
        createUser.addActionListener(e -> {
            String[] possibilities = {"Employee", "Customer"};
            String s = (String) JOptionPane.showInputDialog(
                body,
                "Select a role for the new user",
                "Create new user",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                possibilities[0]);
            switch(s) {
                case "Employee":
                    viewManager.setNextView(new EmployeeView(viewManager));
                    break;
                case "Customer":
                    viewManager.setNextView(new CustomerView(viewManager));
                    break;
            }
        });
        menu.add(createUser);
        return menu;
    }

    private JPanel createUserPanel(User user) {
        JPanel userPanel = new JPanel();
        userPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK, 5),
                BorderFactory.createEmptyBorder(5, 5, 10, 10)
            )
        );
        userPanel.setLayout(new BorderLayout());

        JLabel userHeader = new JLabel(
            "<html><h2>" + user.getFirstName() + " " + user.getLastName() + "</h2></html>"
        );
        JPanel userInfo = new JPanel();
        userInfo.setLayout(new BoxLayout(userInfo, BoxLayout.PAGE_AXIS));
        String role = user instanceof Employee ? "Employee" : "Customer";
        userInfo.add(new JLabel(
            "Email: " + user.getEmail()
        ));
        userInfo.add(new JLabel(
            "Role: " + role
        ));

        JButton show = new JButton("show");
        show.addActionListener(e -> {
            System.out.println(user);
            if (user instanceof Employee) {
                viewManager.setNextView(new EmployeeView(viewManager, (Employee) user));
            } else {
                viewManager.setNextView(new CustomerView(viewManager, (Customer) user));
            }
        });
        userPanel.add(userHeader, BorderLayout.NORTH);
        userPanel.add(userInfo, BorderLayout.CENTER);
        userPanel.add(show, BorderLayout.SOUTH);
        return userPanel;
    }

    /**
     * Einen neuen Kunden oder Angestellten anlegen
     *//*
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
    }*/
}
