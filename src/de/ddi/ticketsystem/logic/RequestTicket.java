package de.ddi.ticketsystem.logic;

import java.util.Date;

public class RequestTicket extends Ticket {
    private Date date;
    private String service;

    public RequestTicket(String description, Status status, Employee employee, Customer customer, int priority,
                         Date date, String service) {
        super(description, status, employee, customer, priority);
        this.date = date;
        this.service = service;
    }

    public Date getDate() {
        return date;
    }

    public String getService() {
        return service;
    }

    @Override
    public String saveToText() {
        String text = "REQUEST;";
        text += super.saveToText();
        text += this.date + ";" + this.service + ";";
        return text;
    }
}
