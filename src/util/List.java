package util;

public class List<E> {

    /**
     * Listenkopf. Anfang der Liste.
     */
    Node<E> head;

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
     * Gibt Anzahl der gespeicherten Elemente zurück.
     * @return Anzahl der gespeicherten Elemente
     */
    public int size() {
        int size = 0; // lokale Variable zum mitzaehlen, wie viele Elemente in der List sind
        Node<E> node = head; // lokale Variable zum Durchlaufen der Listenelement
        while (node != null) {
            node = node.getNext(); // gehe zum naechsten Element
            // das kann(!) null sein, wenn node auf das
            // letzte Element gezeigt hat!
            size = size + 1;        // mitzaehlen, dass ein Element da war(!)
        }

        return size;
    }

    /**
     * Gibt die Node an der Stelle index zurück. Wenn keine Node an diesem Index existiert wird null
     * zurückgegeben.
     * @param index Index
     * @return Node an der Stelle index
     */
    private Node<E> getNodeAt(int index) {
        if (index < 0) {
            return null;
        } // falls negativer index => es gibt kein Element, das diese Bedingung erfuellt

        int currPos = 0;  // Hilfszaehler fuer das Mitzaehlen der Position beim Durchlaufen
        Node<E> node = head; // Intialisierung des Durchlaufs der Liste
        while (currPos < index  // noch in der Liste aber noch nicht an der richtigen Stelle
                &&
                node != null // sind ausserhalb der Liste angekommen
                ) {
            node = node.getNext();
            currPos = currPos + 1;
        }

        return node;
    }


    /**
     * Gibt das Element an der angebenden Position zurück.
     * @param index des Elements, welches zurückgeben werden soll
     * @return Element an der angebenden Position
     */
    public E get(int index) {
        Node<E> node = getNodeAt(index); // hole das Element (im Container Node) an der Stelle index

        if (isEmpty()) {
            // da gab es keins an der Stelle index
            return null;
        } else {
            return node.getValue();
        }
    }

    /**
     * Fügt das übergebende Element der Datenstruktur am Ende hinzu. Ist die Datenstruktur leer, ist das hinzugefügte
     * Element anschließend zudem das erste Element.
     * @param element zu speichernde Element
     */
    public void add(E element) {
        Node<E> node = new Node<>();
        node.setValue(element);
        if (!isEmpty()) {
            Node<E> prev = getNodeAt(size() - 1);
            prev.setNext(node);
        }
    }

    /**
     * Gibt den Index des übergebenen Elements zurück, wenn dieses in der Datenstruktur enthalten ist, sonst wird 0
     * zurückgegeben.
     * @param element dessen Index zurückgegeben werden soll
     * @return der Index des übergebenen Elements
     */
    public int indexOf(E element) {
        Node<E> node = head;
        int index = 0;
        while(node != null) {
            if(node.getValue().equals(element)) {
                break;
            } else {
                index++;
                node = node.getNext();
            }
        }
        return index;
    }

    /**
     * Löscht ein Element anhand des Index aus der Datenstruktur. Ist kein Element an diesem Index vorhanden passiert
     * nichts.
     * @param index des Element, welches gelöscht werden soll
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
                Node<E> node = getNodeAt(index);
                // nun noch das Vorgaengerelement, aber nur falls node!=null
                // d.h. node verweist auf ein Element in der Liste
                if (node != null) {
                    // jetzt kann der Vorgaenger besorgt werden
                    Node<E> prev = getNodeAt(index - 1);
                    // jetzt noch node aus der Liste ausketten
                    prev.setNext(node.getNext());
                }
            }
        }
    }

}

