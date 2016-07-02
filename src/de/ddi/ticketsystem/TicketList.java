package de.ddi.ticketsystem;


public class TicketList {

    // Der Listenkopf oder der Verweis/Referenz auf das erste Element der Liste
    TicketNode head;

    // hier die Methode / Operation, die diese Liste leert.
    public void clear() {   // das head == null bedeutet es gibt kein Listenelement in der Liste
        head = null;
    }

    public boolean isEmpty() {
        // liefert true, falls head == null gilt, also die Liste kein Element enthaelt
        return head == null;
    }

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

    // Hilfsmethode fuer das Besorgen des Elementes an der Stell index 0 ..  size-1
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

    public Ticket get(int index) {
        TicketNode ticketNode = getNodeAt(index); // hole das Element (im Container Node) an der Stelle index

        if (ticketNode == null) {
            // da gab es keins an der Stelle index
            return null;
        } else {
            return ticketNode.getValue();
        }
    }

    public String toString() {
        String tempStr = "{"; // temporaere String-Variable zum Aufsammeln
        TicketNode ticketNode = head;   // ticketNode ist die temporaere Laufvariable zum Durchlaufen der Liste
        while (ticketNode != null)  // solange noch nicht am Ende
        {
            tempStr = tempStr + ticketNode; // erst Knoten verarbeiten
            ticketNode = ticketNode.getNext();    // auf zum naechsten Knoten in der Liste (falls vorhanden!)
        }

        return tempStr + "}";

    }

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

