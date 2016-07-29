package de.ddi.ticketsystem;

import java.util.Date;

public class Ticket {
    /**
     * Beschreibung des Tickets
     */
    private String description;
    /**
     * Bearbeitungsstatus kann sein RECORDED (Aufgenommen), PROCESSED (Bearbeitet), WAITING_FOR_FEEDBACK (Auf Rückmeldung
     * warten), SOLVED (Erledigt) und CLOSED (abgeschlossen)
     */
    private String status;
    /**
     * zugewiesener Angestellte
     */
    private Employee employee;
    /**
     * Kunden für den das Ticket bearbeitet wird
     */
    private Customer customer;
    /**
     * Priorität des Tickets
     */
    private int priority;
    private Date creationDate;

    /**
     * Erzeugt ein neues Ticket, welches beim Erzeugen den momentanen Zeitstempel als Erstelldatum zugewiesen bekommen.
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

    /**
     * Gibt die Beschreibung des Tickets zurück
     * @return Beschreibung
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setzten einer neuen Beschreibung
     * @param description Beschreibung
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gibt den Status des Tickets zurück
     * @return Status des Tickets
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setzten eines neuen Status
     * @param status Status des Tickets
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gibt den zugewiesenen Angestellten zurück
     * @return zugewiesener Angestellte
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Dem Ticket einen neuen Angestellten zuweisen
     * @param employee Angestellter
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * Gibt den Kunden zurück für den das Ticket bearbeitet wird
     * @return Kunde
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Dem Ticket einen neuen Kunden zuweisen
     * @param customer Kunde
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Gibt die Priorität des Tickets zurück
     * @return Priorität des Tickets
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Setzten einer neunen Priorität. Es werden nur Prioritäten größer als 0 erlaubt. Wenn ein Wert kleiner 0 gesetzt
     * werden soll, passiert nichts.
     * @param priority Priorität des Tickets
     */
    public void setPriority(int priority) {
        // Überprüfung, ob die Priorität größer als 0 ist
        if (priority > 0) {
            this.priority = priority;
        }
    }

    public Date getCreationDate() {
        return creationDate;
    }
}