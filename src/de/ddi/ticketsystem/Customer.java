package de.ddi.ticketsystem;

/**
 * Customer dient zum Bündeln von Informationen über einen Kunden. Dabei wird die Klasse User erweitert.
 * @see User
 */
public class Customer extends User {
    /**
     * Name der Firma des Kunden
     */
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

    /**
     * Gibt den Namen der Firma für die der Kunde arbeitet zurück
     * @return Name der Firma
     */
    public String getCompany() {
        return company;
    }
}

