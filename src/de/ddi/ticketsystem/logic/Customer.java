package de.ddi.ticketsystem.logic;

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
}
