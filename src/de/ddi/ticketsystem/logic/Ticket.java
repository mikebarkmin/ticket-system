package de.ddi.ticketsystem.logic;

import util.List;

import java.util.Date;

public abstract class Ticket {
    private String description;
    private Status status;
    private Employee employee;
    private Customer customer;
    private int priority;
    private Date creationDate;
    private List<Note> notes;

    protected Ticket(String description, Status status, Employee employee, Customer customer, int priority) {
        this.description = description;
        this.status = status;
        this.employee = employee;
        this.customer = customer;
        this.priority = priority;
        notes = new List<>();
        creationDate = new Date();
        notes = new List<>();
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
        if(status != Status.CLOSED) {
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
        if (status != Status.CLOSED && priority > 0) {
            this.priority = priority;
        }
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public void removeNote(Note note) {
        notes.remove(notes.indexOf(note));
    }

    public List<Note> getNotes() {
        return notes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}
