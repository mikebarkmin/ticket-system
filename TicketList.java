package de.ddi.ticketsystem;

/**
 * Datenstruktur zum Speichern von Tickets in einer Liste.
 */
public class TicketList {

    /**
     * Listenkopf. Anfang der Liste.
     */
    TicketNode head;

    /**
     * Leert die Liste
     */
    public void clear() {
    }

    /**
     * Überprüft ob die Liste leer ist und gibt
     * @return true, wenn die Liste leer ist, false anderenfalls.
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * Gibt Anzahl der gespeicherten Tickets zurück.
     * @return Anzahl der gespeicherten Tickets
     */
    public int size() {
        return 0;
    }

    /**
     * Gibt die TicketNode an der Stelle index zurück. Wenn keine TicketNode an diesem Index existiert wird null
     * zurückgegeben.
     * @param index Index
     * @return TicketNode an der Stelle index
     */
    private TicketNode getNodeAt(int index) {
        if (index < 0) {
            return null;
        } // falls negativer index => es gibt kein Element, das diese Bedingung erfuellt

        int currPos = 0;  // Hilfszaehler fuer das Mitzaehlen der Position beim Durchlaufen
        TicketNode ticketNode = head; // Intialisierung des Durchlaufs der Liste
        while (currPos < index  // noch in der Liste aber noch nicht an der richtigen Stelle
                &&
                ticketNode != null // sind ausserhalb der Liste angekommen
                ) {
            ticketNode = ticketNode.getNext();
            currPos = currPos + 1;
        }

        return ticketNode;
    }

    /**
     * Gibt das Ticket an der angebenden Position zurück.
     * @param index des Tickets, welches zurückgeben werden soll
     * @return Ticket an der angebenden Position
     */
    public Ticket get(int index) {
        return null;
    }

    /**
     * Fügt das übergebende Ticket der Datenstruktur am Ende hinzu. Ist die Datenstruktur leer, ist das hinzugefügte
     * Ticket anschließend zudem das erste Ticket.
     * @param value zu speichernde Ticket
     */
    public void add(Ticket value) {
    }

    /**
     * Löscht ein Ticket anhand des Index aus der Datenstruktur. Ist kein Ticket an diesem Index vorhanden passiert
     * nichts.
     * @param index des Tickets, welches gelöscht werden soll
     */
    public void remove(int index) {
    }
}

