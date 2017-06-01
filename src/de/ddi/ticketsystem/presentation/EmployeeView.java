package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;

import javax.swing.*;

public class EmployeeView extends View {

    private Employee employee;

    /**
     * Erstellt eine Anzeige, die die Daten zu einem Mitarbeiter anzeigt
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param employee Mitarbeiter, dessen Daten angezeigt werden sollen
     */
    public EmployeeView(ViewManager viewManager, Employee employee) {
        super(viewManager);
        this.employee = employee;
    }

    @Override
    protected String getName() {
        return "Employee";
    }

    @Override
    public JPanel getBody() {
        String text = "Name\n";
        text += "\t" + employee.getFirstName() + " " + employee.getLastName() + "\n";
        text += "Email\n";
        text += "\t" + employee.getEmail() + "\n";
        text += "Abteilung\n";
        text += "\t" + employee.getDepartment() + "\n";

        JTextArea textArea = new JTextArea();
        textArea.setText(text);
        JPanel body = new JPanel();
        body.add(textArea);
        return body;
    }
}
