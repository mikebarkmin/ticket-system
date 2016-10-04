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
     * Bereich in dem der Angestellte arbeitet
     */
    private String department;

    /**
     * Erstellt ein Objekt vom Typ Employee
     * @param firstName Vorname des Angestellten
     * @param lastName Nachname des Angestellten
     */
    public Employee(String firstName, String lastName, String email, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
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
     * Gibt den Bereich in dem der Angestellte arbeitet zurück
     * @return Bereich in dem der Angestellte arbeitet
     */
    public String getDepartment() {
        return department;
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

    /**
     * Vergleicht zwei Objekte vom Typ employee
     * @param employee Angestellter mit dem verglichen werden soll
     * @return 0 sie sind gleich, -1 employee ist größer als dieser, 1 dieser ist größer als employee
     * @see Comparable#compareTo(Object)
     */
    @Override
    public int compareTo(Employee employee) {
        return (firstName + lastName).compareTo(employee.firstName + employee.lastName);

    public String toString() {
        return firstName + ";" + lastName + ";" + email + ";" + department;
    }
}
