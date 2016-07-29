package de.ddi.ticketsystem;

/**
 * Employee dient zum Bündeln von Informationen über einen Angestellten
 */
public class Employee extends User implements Comparable<Employee> {
    private String department;

    /**
     * Erstellt ein Objekt vom Typ Employee
     * @param firstName Vorname des Angestellten
     * @param lastName Nachname des Angestellten
     * @param email Emailadresse des Angestellten
     * @param department Fachbereich des Angestellten
     */
    public Employee(String firstName, String lastName, String email, String department) {
        super(firstName, lastName, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int compareTo(Employee employee) {
        return (firstName + lastName).compareTo(employee.firstName + employee.lastName);
    }
}
