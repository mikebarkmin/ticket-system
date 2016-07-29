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
     * Gibt den Namen des zugewiesenen Angestellten zurück
     * @return Name des Angestellten
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * Dem Ticket einen neuen Angestellten per Namen zuweisen
     * @param employee Name des Angestellten
     */
    public void setEmployee(String employee) {
        this.employee = employee;
    }

    /**
     * Gibt den Namen des Kunden zurück für den das Ticket bearbeitet wird
     * @return Name des Kunden
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Dem Ticket einen neuen Kunden per Namen zuweisen
     * @param customer Name des Kunden
     */
    public void setCustomer(String customer) {
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
}