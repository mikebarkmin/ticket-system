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
    public int compareTo(Employee employee) {
        return (this.firstName + this.lastName).compareTo(employee.firstName + employee.lastName);
    }
}
