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
     * Einen neuen Nachnamen fuer den Angestellten setzten
     * @param lastName Nachname des Angestellten
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gibt die Email-Adresse des Angestellten zurueck
     * @return Email-Adresse des Angestellten
     */
    public String getEmail() {
        return email;
    }

    /**
     * Eine neue Email-Adresse fuer den Angestellten setzten
     * @param email Email-Adresse des Angestellten
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gibt den Namen der Firma fuer die der Kunde arbeitet zurueck
     * @return Name der Firma
     */
    public String getCompany() {
        return company;
    }

    /**
     * Eine neue Firma per Namen dem Kunden zuweisen
     * @param company Name der Firma
     */
    public void setCompany(String company) {
        this.company = company;
    }
}
