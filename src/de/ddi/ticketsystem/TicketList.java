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
    public void clear() {   // das head == null bedeutet es gibt kein Listenelement in der Liste
        head = null;
    }

    /**
     * Überprüft ob die Liste leer ist und gibt
     * @return true, wenn die Liste leer ist, false anderenfalls.
     */
    public boolean isEmpty() {
        // liefert true, falls head == null gilt, also die Liste kein Element enthaelt
        return head == null;
    }

    /**
     * Gibt Anzahl der gespeicherten Tickets zurück.
     * @return Anzahl der gespeicherten Tickets
     */
    public int size() {
        int size = 0; // lokale Variable zum mitzaehlen, wie viele Elemente in der List sind
        TicketNode ticketNode = head; // lokale Variable zum Durchlaufen der Listenelement
        while (ticketNode != null) {
            ticketNode = ticketNode.getNext(); // gehe zum naechsten Element
            // das kann(!) null sein, wenn ticketNode auf das
            // letzte Element gezeigt hat!
            size = size + 1;        // mitzaehlen, dass ein Element da war(!)
        }

        return size;
    }

    /**
     * Gibt eine Liste von Tickets zurück auf die der übergebene Suchbegriff zutrifft.
     * @param search der String nach dem gesucht werden soll
     * @return TicketList eine Liste von Tickets auf denen der Suchbegriff zutrifft
     */
    public TicketList search(String search) {
        return search(search, head);
    }

    private TicketList search(String search, TicketNode current) {
        if (current == null) {
            return new TicketList();
        } else {
            TicketList ticketList = search(search, current.getNext());
            if (current.getValue().toString().contains(search)) {
                ticketList.add(current.getValue()); 
            }    
            return ticketList;
        }
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
        TicketNode ticketNode = getNodeAt(index); // hole das Element (im Container Node) an der Stelle index

        if (ticketNode == null) {
            // da gab es keins an der Stelle index
            return null;
        } else {
            return ticketNode.getValue();
        }
    }

    /**
     * Fügt das übergebende Ticket der Datenstruktur am Ende hinzu. Ist die Datenstruktur leer, ist das hinzugefügte
     * Ticket anschließend zudem das erste Ticket.
     * @param value zu speichernde Ticket
     */
    public void add(Ticket value) {
        TicketNode ticketNode = new TicketNode();
        ticketNode.setValue(value);
        if (head != null) {
            TicketNode prev = getNodeAt(size() - 1);
            prev.setNext(ticketNode);
        } else {
            head = ticketNode;
        }
    }

    /**
     * Löscht ein Ticket anhand des Index aus der Datenstruktur. Ist kein Ticket an diesem Index vorhanden passiert
     * nichts.
     * @param index des Tickets, welches gelöscht werden soll
     */
    public void remove(int index) {
        if (index == 0) // das erste Element soll entfernt werden
        {
            // manipuliere den Verweis head!
            //head = (head == null) ? null : head.getNext();

            if (head == null) {
                // tue nix, da Liste eh leer ist
                // oder
                head = null;
            } else {
                // Liste nicht leer, d.h. head != null und dann soll head auf
                // Nachfolger des ersten Elementes zeigen
                head = head.getNext();
            }
        } else // index != 0
        {
            if (index > 0) // nur sinnvolle Werte fuer index betrachten
            {
                // besorge das Element, das zu entfernen ist
                TicketNode ticketNode = getNodeAt(index);
                // nun noch das Vorgaengerelement, aber nur falls ticketNode!=null
                // d.h. ticketNode verweist auf ein Element in der Liste
                if (ticketNode != null) {
                    // jetzt kann der Vorgaenger besorgt werden
                    TicketNode prev = getNodeAt(index - 1);
                    // jetzt noch ticketNode aus der Liste ausketten
                    prev.setNext(ticketNode.getNext());
                }
            }
        }
    }

}

