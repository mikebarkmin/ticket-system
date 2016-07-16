package de.ddi.ticketsystem;

public class Customer extends User {
    private String company;

    /**
     * Erstellt ein Objekt vom Type Customer
     * @param firstName Vorname des Kunden
     * @param lastName Nachname des Kunden
     * @param email Emailadresse des Kunden
     * @param company Firma des Kunden
     */
    public Customer(String firstName, String lastName, String email, String company) {
        super(firstName, lastName, email);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }
}
