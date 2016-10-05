package de.ddi.ticketsystem.logic;

/**
 * Diese Art von Tickets ist für Bestellungen vorgesehen.
 */
public class OrderTicket extends Ticket {
	// Der Verkäufer
    private String vendor;
    // Der Name des Artikels
    private String article;
    // Die Lieferadresse
    private String address;
    // Die Anzahl der Artikel
    private int quantity;

    /**
     * Erzeugt ein neues Bestellticket, welches beim Erzeugen den momentanen Zeitstempel als Erstelldatum zugewiesen bekommt.
     * @param description Beschreibung des Tickets
     * @param status Status als Enum Status
     * @param employee Referenz eines Objekts vom Typ Emloyee
     * @param customer Referenz eines Objekts vom Typ Customer
     * @param priority Wichtigkeit des Tickets
     * @param vendor Name des Herstellers
     * @param article Name des Artikels
     * @param address Lieferadresse
     * @param quantity Anzahl
     */
    public OrderTicket(String description, Status status, Employee employee, Customer customer, int priority,
                       String vendor, String article, String address, int quantity) {
        super(description, status, employee, customer, priority);
        this.vendor = vendor;
        this.article = article;
        this.address = address;
        this.quantity = quantity;
    }

    /**
     * Gibt den Namen des Herstellers zurück
     * @return Name des Herstellers
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Gibt den Namen des Artikels zurück
     * @return Name des Artikels
     */
    public String getArticle() {
        return article;
    }

    /**
     * Gibt die Lieferadresse zurück
     * @return Lieferadresse
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gibt die Anzahl der bestellten Artikel zurück
     * @return Anzahl der bestellten Artikel
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Erstellt eine ";"-getrennte Zeichenkette mit den Daten des Bestelltickets in der Reihenfolge
     * Tickettyp;Verkäufer;Artikel;Lieferadresse;Anzahl;Beschreibung;Status;Priorität;Erstellugnsdatum;
     * @return Ein ";"-getrennter String mit den Daten des Tickets
     */
    @Override
    public String saveToText() {
        String text = "ORDER;";
        text += super.saveToText();
        text += vendor + ";" + article + ";" + address + ";" + quantity + ";";
        return text;
    }
}
