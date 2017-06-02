package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;

import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class EmployeeView extends View {

    private Employee employee;
    private JPanel body;

    /**
     * Erstellt eine Anzeige, die die Daten zu einem Mitarbeiter anzeigt
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param employee Mitarbeiter, dessen Daten angezeigt werden sollen
     */
    public EmployeeView(ViewManager viewManager, Employee employee) {
        super(viewManager);
        this.employee = employee;
        body = new JPanel();
        body.add(new JLabel(employee.toString()));
    }

    public EmployeeView(ViewManager viewManager) {
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
        JLabel departmentLabel = new JLabel("Department");
        body.add(departmentLabel, c);
        c.gridx += 1;
        JTextField departmentField = new JTextField(20);
        body.add(departmentField, c);

        JButton create = new JButton("Create");
        create.addActionListener(e -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String email = emailField.getText();
            String department = departmentField.getText();
            Employee employee = new Employee(
                firstName, lastName, email, department
            );
            viewManager.getUserManager().add(employee);
            viewManager.goBackwards();
        });
        c.gridy += 1;
        c.gridx = 0;
        c.gridwidth = 2;
        body.add(create, c);
    }

    @Override
    protected String getName() {
        return "Employee";
    }

    @Override
    public JPanel getBody() {
        return body;
    }
}
