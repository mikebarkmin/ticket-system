package de.ddi.ticketsystem.logic;

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

    /**
     * Gibt eine ";"-getrennte Zeichenkette mit den Informationen des Angestellten zurück. Reihenfolge:
     * Nutzertyp;Firma;Vorname;Nachname;Emailadresse;
     * @return Ein ";"-getrennter String mit den Daten des Nutzers
     */
    @Override
    public String saveToText() {
        String text = "CUSTOMER;";
        text += super.saveToText();
        text += company + ";";
        return text;
    }

    /**
     * Eine neue Firma per Namen dem Kunden zuweisen
     * @param company Name der Firma
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Konvertiert das Objekt in einen String
     * @return String Eigenschaften des Objekts
     */
    public String toString() {
        return firstName + ";" + lastName + ";" + email + ";" + company;
    }
}

