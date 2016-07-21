package de.ddi.ticketsystem.logic;

import util.List;

import java.util.Date;

public abstract class Ticket implements Saveable{
    private String description;
    private Status status;
    private Employee employee;
    private Customer customer;
    private int priority;
    private Date creationDate;
    private List<Note> notes;

    /**
     * Erzeugt ein neues Ticket, welches beim Erzeugen den momentanen Zeitstempel als Erstelldatum zugewiesen bekommen.
     * @param description Beschreibung des Tickets
     * @param status Status als Enum Status
     * @param employee Referenz eines Objekts vom Typ Emloyee
     * @param customer Referenz eines Objekts vom Typ Customer
     * @param priority Wichtigkeit des Tickets
     */
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

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Erstellt eine ";"-getrennte Zeichenkette mit den Daten des Tickets in der Reihenfolge
     * Beschreibung;Status;Priorität;Erstellugnsdatum;
     * @return Ein ";"-getrennter String mit den Daten des Tickets
     */
    @Override
    public String saveToText() {
        String text = description + ";" + status + ";" + priority + ";" + creationDate + ";";
        return text;
    }
}
