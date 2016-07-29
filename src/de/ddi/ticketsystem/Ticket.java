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
     * Referenz zum Objekt des zugewiesenen Angestellten
     */
    private Employee employee;
    /**
     * Referenz zum Objekt des Kunden
     */
    private Customer customer;
    /**
     * Priorität des Tickets
     */
    private int priority;

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
     * @return gibt die Referenz zum Objekt des zugewiesenen Angestellten zurück
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee Referenz zum Objekt des zugewiesenen Angestellten
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return gibt die Referenz zum Objekt des Kunden zurück
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer Referenz zum Objekt des Kunden
     */
    public void setCustomer(Customer customer) {
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