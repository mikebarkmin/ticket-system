package de.ddi.ticketsystem;

import util.List;

import java.util.Date;

public class Ticket {
    private String description;
    private Status status;
    private Employee employee;
    private Customer customer;
    private int priority;
    private Date creationDate;
    private List<Note> notes;

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

    public void addNote(Note note) {
        this.notes.add(note);
    }

    public void removeNote(Note note) {
        this.notes.remove(this.notes.indexOf(note));
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
