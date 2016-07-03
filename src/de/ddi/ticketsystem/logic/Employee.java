package de.ddi.ticketsystem.logic;

public class Employee extends User {
    private String department;

    public Employee(String firstName, String lastName, String email, String department) {
        super(firstName, lastName, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String saveToText() {
        String text = "EMPLOYEE;";
        text += super.saveToText();
        text += this.department + ";";
        return text;
    }
}
