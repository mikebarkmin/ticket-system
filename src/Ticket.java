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
     * zugewiesener Angestellte
     */
    private Employee employee;
    /**
     * Kunden fuer den das Ticket bearbeitet wird
     */
    private Customer customer;
    /**
     * Prioritaet des Tickets
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
     * Gibt den zugewiesenen Angestellten zurueck
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
     * Gibt den Kunden zurueck fuer den das Ticket bearbeitet wird
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
    //public void setPriority(int priority) {
    //    // Ueberpruefung, ob die Prioritaet groesser als 0 ist
    //    if (priority > 0) {
    //        this.priority = priority;
    //    }
    //}
}
