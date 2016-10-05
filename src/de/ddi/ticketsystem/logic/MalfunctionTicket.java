package de.ddi.ticketsystem.logic;

/**
 * Diese Art von Tickets soll für Störungsfälle verwendet werden.
 */
public class MalfunctionTicket extends Ticket {
	// Das Gerät, welches eine Service benötigt
    private String deviceService;

    /**
     * Erzeugt ein neues Störungsticket, welches beim Erzeugen den momentanen Zeitstempel als Erstelldatum zugewiesen bekommt.
     * @param description Beschreibung des Tickets
     * @param status Status als Enum Status
     * @param employee Referenz eines Objekts vom Typ Emloyee
     * @param customer Referenz eines Objekts vom Typ Customer
     * @param priority Wichtigkeit des Tickets
     * @param deviceService Gerät, bei dem die Störung vorliegt
     */
    public MalfunctionTicket(String description, Status status, Employee employee, Customer customer, int priority, String deviceService) {
        super(description, status, employee, customer, priority);
        this.deviceService = deviceService;
    }

    /**
     * Gibt das Gerät zurück, welches eine Störung hat
     * @return Gerät mit Störung
     */
    public String getDeviceService() {
        return deviceService;
    }
}
