package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;

public class EmployeeView extends View {

    private Employee employee;

    public EmployeeView(ViewManager viewManager, Employee employee) {
        super(viewManager);
        name = "Angestellter";
        this.employee = employee;
    }

    @Override
    public void show() {
        String text = "Name\n";
        text += "\t" + employee.getFirstName() + " " + employee.getLastName() + "\n";
        text += "Email\n";
        text += "\t" + employee.getEmail() + "\n";
        text += "Abteilung\n";
        text += "\t" + employee.getDepartment() + "\n";
        this.text = text;
        super.show();
    }

    @Override
    public void evaluate(String input) {

    }
}
