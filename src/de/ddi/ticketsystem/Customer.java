package de.ddi.ticketsystem;

/**
 * Customer dient zum Bündeln von Informationen über einen Kunden
 */
public class Customer {
    /**
     * Vorname des Kunden
     */
    private String firstName;
    /**
     * Nachname des Kunden
     */
    private String lastName;
    /**
     * Email-Adresse des Kunden
     */
    private String email;
    /**
     * Name der Firma für die der Kunde arbeitet
     */
    private String company;

    /**
     * Erstellt ein Objekt vom Type Customer
     * @param firstName Vorname des Kunden
     * @param lastName Nachname des Kunden
     * @param company Firma des Kunden
     */
    public Customer(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
