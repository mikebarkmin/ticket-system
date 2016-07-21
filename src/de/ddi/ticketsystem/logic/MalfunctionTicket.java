package de.ddi.ticketsystem.logic;

public class MalfunctionTicket extends Ticket {
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

    public String getDeviceService() {
        return deviceService;
    }

    /**
     * Erstellt eine ";"-getrennte Zeichenkette mit den Daten des Störungstickets in der Reihenfolge
     * Tickettyp;Gerät;Beschreibung;Status;Priorität;Erstellugnsdatum;
     * @return Ein ";"-getrennter String mit den Daten des Tickets
     */
    @Override
    public String saveToText() {
        String text = "MALFUNCTION;";
        text += super.saveToText();
        text += deviceService + ";";
        return text;
    }
}
