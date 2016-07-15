package de.ddi.ticketsystem;

import java.util.Date;

public class Ticket {
    private String description;
    private Status status;
    private Employee employee;
    private Customer customer;
    private int priority;
    private Date creationDate;

    /**
     * Erzeugt ein neues Ticket, welches beim Erzeugen den momentanen Zeitstempel als Erstelldatum zugewiesen bekommen.
     * @param description Beschreibung des Tickets
     * @param status Status als Enum Status
     * @param employee Referenz eines Objekts vom Typ Emloyee
     * @param customer Referenz eines Objekts vom Typ Customer
     * @param priority Wichtigkeit des Tickets
     */
    public Ticket(String description, Status status, Employee employee, Customer customer, int priority) {
        this.description = description;
        this.status = status;
        this.employee = employee;
        this.customer = customer;
        this.priority = priority;
        this.creationDate = new Date();
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if(this.status != Status.CLOSED) {
            this.status = status;
        }
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        if(this.status != Status.CLOSED) {
            this.employee = employee;
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (this.status != Status.CLOSED && priority > 0) {
            this.priority = priority;
        }
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
