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
    public Customer(String firstName, String lastName, String email, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.company = company;
    }

    /**
     * Gibt den Vornamen des Angestellten zurück
     * @return Vorname des Angestellten
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gibt den Nachnamen des Angestellten zurück
     * @return Nachname des Angestellten
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gibt die Email-Adresse des Angestellten zurück
     * @return Email-Adresse des Angestellten
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gibt den Namen der Firma für die der Kunde arbeitet zurück
     * @return Name der Firma
     */
    public String getCompany() {
        return company;
    }
}
