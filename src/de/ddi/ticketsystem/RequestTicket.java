package de.ddi.ticketsystem;

import java.util.Date;

public class RequestTicket extends Ticket {
    private Date date;
    private String service;

    public RequestTicket(String description, String status, Employee employee, Customer customer, int priority,
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
}
