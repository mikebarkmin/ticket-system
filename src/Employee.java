/**
 * Employee dient zum Buendeln von Informationen ueber einen Angestellten
 */
public class Employee {
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
     * Gibt den Vornamen des Angestellten zurueck
     * @return Vorname des Angestellten
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gibt den Nachnamen des Angestellten zurueck
     * @return Nachname des Angestellten
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gibt den Bereich in dem der Angestellte arbeitet zurueck
     * @return Bereich in dem der Angestellte arbeitet
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Gibt die Email-Adresse des Angestellten zurueck
     * @return Email-Adresse des Angestellten
     */
    public String getEmail() {
        return email;
    }
}
