package de.ddi.ticketsystem.logic;

public class OrderTicket extends Ticket {
    private String vendor;
    private String article;
    private String address;
    private int quantity;

    public OrderTicket(String description, Status status, Employee employee, Customer customer, int priority,
                       String vendor, String article, String addess, int quantity) {
        super(description, status, employee, customer, priority);
        this.vendor = vendor;
        this.article = article;
        address = addess;
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

    @Override
    public String saveToText() {
        String text = "ORDER;";
        text += super.saveToText();
        text += vendor + ";" + article + ";" + address + ";" + quantity + ";";
        return text;
    }
}
