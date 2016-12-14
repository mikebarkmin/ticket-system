/**
 * Customer dient zum Buendeln von Informationen ueber einen Kunden
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
     * Name der Firma fuer die der Kunde arbeitet
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
     * Gibt den Vornamen des Angestellten zurueck
     * @return Vorname des Angestellten
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Einen neuen Vorname fuer den Angestellten setzten
     * @param firstName Vorname des Angestellten
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gibt den Nachnamen des Angestellten zurueck
     * @return Nachname des Angestellten
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gibt die Email-Adresse des Angestellten zurueck
     * @return Email-Adresse des Angestellten
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gibt den Namen der Firma fuer die der Kunde arbeitet zurueck
     * @return Name der Firma
     */
    public String getCompany() {
        return company;
    }
}
