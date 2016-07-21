package de.ddi.ticketsystem.logic;

import java.util.Date;

public class RequestTicket extends Ticket {
    private Date date;
    private String service;

    /**
     * Erzeugt ein neues Anforderungsticket, welches beim Erzeugen den momentanen Zeitstempel als Erstelldatum zugewiesen bekommt.
     * @param description Beschreibung des Tickets
     * @param status Status als Enum Status
     * @param employee Referenz eines Objekts vom Typ Emloyee
     * @param customer Referenz eines Objekts vom Typ Customer
     * @param priority Wichtigkeit des Tickets
     */
    public RequestTicket(String description, Status status, Employee employee, Customer customer, int priority,
                         Date date, String service) {
        super(description, status, employee, customer, priority);
        this.date = date;
        this.service = service;
    }

    public Date getDate() {
        return date;
    }

    public String getService() {
        return service;
    }

    /**
     * Erstellt eine ";"-getrennte Zeichenkette mit den Daten des Anforderungstickets in der Reihenfolge
     * Tickettyp;Datum;Dienst;Beschreibung;Status;Priorität;Erstellugnsdatum;
     * @return Ein ";"-getrennter String mit den Daten des Tickets
     */
    @Override
    public String saveToText() {
        String text = "REQUEST;";
        text += super.saveToText();
        text += date + ";" + service + ";";
        return text;
    }
}
