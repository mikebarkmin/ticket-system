package de.ddi.ticketsystem;

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
     * Name des Angestellten, der das Ticket bearbeiten soll
     */
    private String employee;
    /**
     * Name des Kunden, der das Ticket in Auftrag gegeben hat
     */
    private String customer;
    /**
     * Priorität des Tickets
     */
    private int priority;

    /**
     * Erzeugt ein neues Ticket
     * @param description Beschreibung des Tickets
     * @param status Status aus (RECORDED, PROCESSED, WAITING_FOR_FEEDBACK, SOLVED, CLOSED)
     * @param employee Name des Angestellten
     * @param customer Name des Kunden
     * @param priority Wichtigkeit des Tickets
     */
    public Ticket(String description, String status, String employee, String customer, int priority) {
        this.description = description;
        this.status = status;
        this.employee = employee;
        this.customer = customer;
        this.priority = priority;
    }

    /**
     * @return gibt die Beschreibung des Tickets zurück
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description Beschreibung des Tickets
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return gibt den Status des Tickets zurück
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status Status des Tickets
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return gibt den Namen des zugewiesenen Angestellten
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * @param employee Name des Angestellten, welcher dem Ticket zugewiesen wird
     */
    public void setEmployee(String employee) {
        this.employee = employee;
    }

    /**
     * @return gibt den Namen des Kunden zurück für den das Ticket bearbeitet wird
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer Name des Kunden, für den das Ticket bearbeitet wird
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return gibt die Priorität des Tickets zurück
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Es werden nur Prioritäten größer als 0 erlaubt. Wenn ein Wert kleiner 0 gesetzt werden soll, passiert nichts.
     * @param priority Priorität des Tickets
     */
    public void setPriority(int priority) {
        // Überprüfung, ob die Priorität größer als 0 ist
        if (priority > 0) {
            this.priority = priority;
        }
    }
}