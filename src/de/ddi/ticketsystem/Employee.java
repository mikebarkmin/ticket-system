package de.ddi.ticketsystem;

/**
 * Employee dient zum Bündeln von Informationen über einen Angestellten
 */
public class Employee implements Comparable<Employee> {
    /**
     * Vorname des Angestellten
     */
    private String firstName;
    /**
     * Nachname des Angestellten
     */
    private String lastName;
    /**
     * Email-Adresse des Angestellten
     */
    private String email;

    /**
     * Erstellt ein Objekt vom Typ Employee
     * @param firstName Vorname des Angestellten
     * @param lastName Nachname des Angestellten
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gibt den Vornamen des Angestellten zurück
     * @return Vorname des Angestellten
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Einen neuen Vorname für den Angestellten setzten
     * @param firstName Vorname des Angestellten
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gibt den Nachnamen des Angestellten zurück
     * @return Nachname des Angestellten
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Einen neuen Nachnamen für den Angestellten setzten
     * @param lastName Nachname des Angestellten
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gibt die Email-Adresse des Angestellten zurück
     * @return Email-Adresse des Angestellten
     */
    public String getEmail() {
        return email;
    }

    /**
     * Eine neue Email-Adresse für den Angestellten setzten
     * @param email Email-Adresse des Angestellten
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Employee employee) {
        return (firstName + lastName).compareTo(employee.firstName + employee.lastName);
    }
}
