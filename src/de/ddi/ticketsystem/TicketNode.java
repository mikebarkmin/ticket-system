package de.ddi.ticketsystem;

/**
 * TicketNode ist für die Datenstruktur {@link TicketList} wichtig. Die Klasse verbindet den Inhalt, also ein Ticket
 * mit der nachfolgenden TicketNode.
 */
public class TicketNode {

    /**
     * Ticket
     */
    private Ticket value;

    /**
     * Nachfolgende TicketNode
     */
    private TicketNode next;

    /**
     * Gibt das gespeicherte Ticket zurück
     * @return Ticket
     */
    public Ticket getValue() {
        return value;
    }

    /**
     * Setzt ein neues Ticket
     * @param v Ticket
     */
    public void setValue(Ticket v) {
        value = v;
    }

    /**
     * Gibt die nachfolgende TicketNode zurück
     * @return nachfolgende TichetNode
     */
    public TicketNode getNext() {
        return next;
    }

    /**
     * Setzt die nachfolgende TicketNode
     * @param n TicketNode
     */
    public void setNext(TicketNode n) {
        next = n;
    }

}


