package de.ddi.ticketsystem;

/**
 * Employee dient zum Bündeln von Informationen über einen Angestellten
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
     * Erstellt ein Objekt vom Typ Employee
     * @param firstName Vorname des Angestellten
     * @param lastName Nachname des Angestellten
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
