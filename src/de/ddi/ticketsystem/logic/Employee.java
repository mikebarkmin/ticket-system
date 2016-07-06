package de.ddi.ticketsystem.logic;

public class Employee extends User implements Comparable<Employee> {
    private String department;
    private String firstName;
    private String lastName;
    private String email;

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
        text += department + ";";
        return text;
    }

    public int compareTo(Employee employee) {
        return (firstName + lastName).compareTo(employee.firstName + employee.lastName);
    }
}
