package de.ddi.ticketsystem.logic;

public class OrderTicket extends Ticket {
    private String vendor;
    private String article;
    private String address;
    private int quantity;

    /**
     * Erzeugt ein neues Bestellticket, welches beim Erzeugen den momentanen Zeitstempel als Erstelldatum zugewiesen bekommt.
     * @param description Beschreibung des Tickets
     * @param status Status als Enum Status
     * @param employee Referenz eines Objekts vom Typ Emloyee
     * @param customer Referenz eines Objekts vom Typ Customer
     * @param priority Wichtigkeit des Tickets
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

    public String getVendor() {
        return vendor;
    }

    public String getArticle() {
        return article;
    }

    public String getAddress() {
        return address;
    }

    public int getQuantity() {
        return quantity;
    }
}
