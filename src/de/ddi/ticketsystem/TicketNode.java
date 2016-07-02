package de.ddi.ticketsystem;


public class TicketNode {

    // Nutzinformation ist ein Document
    private Ticket value;

    // Verwaltungsinformation

    private TicketNode next;

    public Ticket getValue() {
        return value;
    }

    public void setValue(Ticket v) {
        value = v;
    }

    public TicketNode getNext() {
        return next;
    }

    public void setNext(TicketNode n) {
        next = n;
    }

    public String toString() // gibt Node-Object aus zusammen mit value
    {
        return "[ " + value + " ] ->";
    }
}


