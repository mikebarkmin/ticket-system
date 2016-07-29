package de.ddi.ticketsystem.logic;

import java.util.Date;

/**
 * Die Art von Ticket soll für neue Anforderungen verwendet werden.
 */
public class RequestTicket extends Ticket {
    /**
     * Datum an dem die Anforderung fertig gestellt sein soll
     */
    private Date date;
    /**
     * Anforderung, die zu tätigen ist
     */
    private String service;

    /**
     * Erzeugt ein neues Anforderungsticket, welches beim Erzeugen den momentanen Zeitstempel als Erstelldatum zugewiesen bekommt.
     * @param description Beschreibung des Tickets
     * @param status Status als Enum Status
     * @param employee Referenz eines Objekts vom Typ Emloyee
     * @param customer Referenz eines Objekts vom Typ Customer
     * @param priority Wichtigkeit des Tickets
     * @param date Fertigstellungsdatum der Anforderung
     * @param service Anforderung
     */
    public RequestTicket(String description, Status status, Employee employee, Customer customer, int priority,
                         Date date, String service) {
        super(description, status, employee, customer, priority);
        this.date = date;
        this.service = service;
    }

    /**
     * Gibt das Fertigstellungsdatum zurück
     * @return Fertigstellungsdatum
     */
    public Date getDate() {
        return date;
    }

    /**
     * Gibt die Anforderung zurück
     * @return Anforderung
     */
    public String getService() {
        return service;
    }
}
