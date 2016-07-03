package de.ddi.ticketsystem.logic;

import util.List;

import java.util.Date;

public abstract class Ticket implements Saveable{
    private String description;
    private String status;
    private Employee employee;
    private Customer customer;
    private int priority;
    private Date creationDate;
    private List<Note> notes;

    protected Ticket(String description, String status, Employee employee, Customer customer, int priority) {
        this.description = description;
        this.status = status;
        this.employee = employee;
        this.customer = customer;
        this.priority = priority;
        this.creationDate = new Date();
        this.notes = new List<>();
    }

    public String getDescription() {
        return description;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority > 0) {
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

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public String saveToText() {
        String text = this.description + ";" + this.status + ";" + this.priority + ";" + this.creationDate + ";";
        return text;
    }
}