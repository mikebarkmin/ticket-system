package de.ddi.ticketsystem;

import java.util.Date;

public class Ticket {
    private String description;
    private String status;
    private Employee employee;
    private Customer customer;
    private int priority;
    private Date creationDate;

    /**
     * Erzeugt ein neues Ticket
     * @param description Beschreibung des Tickets
     * @param status Status aus (RECORDED, PROCESSED, WAITING_FOR_FEEDBACK, SOLVED, CLOSED)
     * @param employee Referenz eines Objekts vom Typ Emloyee
     * @param customer Referenz eines Objekts vom Typ Customer
     * @param priority Wichtigkeit des Tickets
     */
    public Ticket(String description, String status, Employee employee, Customer customer, int priority) {
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority > 0) {
            this.priority = priority;
        }
    }

    public Date getCreationDate() {
        return creationDate;
    }
}