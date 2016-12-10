public class Ticket {
    /**
     * Beschreibung des Tickets
     */
    private String description;
    /**
     * Bearbeitungsstatus kann sein RECORDED (Aufgenommen), PROCESSED (Bearbeitet), WAITING_FOR_FEEDBACK (Auf Rueckmeldung
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
     * Prioritaet des Tickets
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
     * Gibt die Beschreibung des Tickets zurueck
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
     * Gibt den Status des Tickets zurueck
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
     * Gibt den Namen des zugewiesenen Angestellten zurueck
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
     * Gibt den Namen des Kunden zurueck fuer den das Ticket bearbeitet wird
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
     * Gibt die Prioritaet des Tickets zurueck
     * @return Prioritaet des Tickets
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Setzten einer neunen Prioritaet. Es werden nur Prioritaeten groesser als 0 erlaubt. Wenn ein Wert kleiner 0 gesetzt
     * werden soll, passiert nichts.
     * @param priority Prioritaet des Tickets
     */
    public void setPriority(int priority) {
        // Ueberpruefung, ob die Prioritaet groesser als 0 ist
        if (priority > 0) {
            this.priority = priority;
        }
    }
}
