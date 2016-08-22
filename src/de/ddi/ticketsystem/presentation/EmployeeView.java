package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;

public class EmployeeView extends View {

    private Employee employee;

    /**
     * Erstellt eine Anzeige, die die Daten zu einem Mitarbeiter anzeigt
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param employee Mitarbeiter, dessen Daten angezeigt werden sollen
     */
    public EmployeeView(ViewManager viewManager, Employee employee) {
        super(viewManager);
        name = "Angestellter";
        this.employee = employee;
    }

    /**
     * Gibt die Daten des eines Mitarbeiters aus
     */
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

    /**
     * Es muss nichts ausgewertet werden
     */
    @Override
    public void evaluate(String input) {

    }
}
