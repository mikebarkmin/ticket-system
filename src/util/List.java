package util;

public class List<E> {

    /**
     * Listenkopf. Anfang der Liste.
     */
    ListNode<E> head;

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
        ListNode<E> listNode = head; // lokale Variable zum Durchlaufen der Listenelement
        while (listNode != null) {
            listNode = listNode.getNext(); // gehe zum naechsten Element
            // das kann(!) null sein, wenn listNode auf das
            // letzte Element gezeigt hat!
            size = size + 1;        // mitzaehlen, dass ein Element da war(!)
        }

        return size;
    }

    /**
     * Gibt eine Liste von Einträgen zurück auf die der übergebene Suchbegriff zutrifft.
     * @param search der String nach dem gesucht werden soll
     * @return List eine Liste von Einträgen auf denen der Suchbegriff zutrifft
     */
    public List<E> search(String search) {
        return search(search, head);
    }

    private List<E> search(String search, ListNode<E> current) {
        if (current == null) {
            return new List<>();
        } else if (current.getValue().toString().contains(search)) {
            List<E> list = search(search, current.getNext());
            list.add(current.getValue()); 
            return list;
        } else {
            return search(search, current.getNext());
        }
    }

    /**
     * Gibt die Node an der Stelle index zurück. Wenn keine Node an diesem Index existiert wird null
     * zurückgegeben.
     * @param index Index
     * @return Node an der Stelle index
     */
    private ListNode<E> getNodeAt(int index) {
        if (index < 0) {
            return null;
        } // falls negativer index => es gibt kein Element, das diese Bedingung erfuellt

        int currPos = 0;  // Hilfszaehler fuer das Mitzaehlen der Position beim Durchlaufen
        ListNode<E> listNode = head; // Intialisierung des Durchlaufs der Liste
        while (currPos < index  // noch in der Liste aber noch nicht an der richtigen Stelle
                &&
                listNode != null // sind ausserhalb der Liste angekommen
                ) {
            listNode = listNode.getNext();
            currPos = currPos + 1;
        }

        return listNode;
    }


    /**
     * Gibt das Element an der angebenden Position zurück.
     * @param index des Elements, welches zurückgeben werden soll
     * @return Element an der angebenden Position
     */
    public E get(int index) {
        ListNode<E> listNode = getNodeAt(index); // hole das Element (im Container ListNode) an der Stelle index

        if (isEmpty()) {
            // da gab es keins an der Stelle index
            return null;
        } else {
            return listNode.getValue();
        }
    }

    /**
     * Gibt die Liste als String repräsentation zurück
     * @return String, der die Liste darstellt in geschweiften Klammern
     */
    public String toString() {
        String tempStr = "{"; // temporaere String-Variable zum Aufsammeln
        ListNode<E> listNode = head;   // listNode ist die temporaere Laufvariable zum Durchlaufen der Liste
        while (listNode != null)  // solange noch nicht am Ende
        {
            tempStr = tempStr + listNode; // erst Knoten verarbeiten
            listNode = listNode.getNext();    // auf zum naechsten Knoten in der Liste (falls vorhanden!)
        }

        return tempStr + "}";

    }

    /**
     * Fügt das übergebende Element der Datenstruktur am Ende hinzu. Ist die Datenstruktur leer, ist das hinzugefügte
     * Element anschließend zudem das erste Element.
     * @param element zu speichernde Element
     */
    public void add(E element) {
        ListNode<E> listNode = new ListNode<>();
        listNode.setValue(element);
        if (!isEmpty()) {
            ListNode<E> prev = getNodeAt(size() - 1);
            prev.setNext(listNode);
        } else {
            head = listNode;
        }
    }

    /**
     * Gibt den Index des übergebenen Elements zurück, wenn dieses in der Datenstruktur enthalten ist, sonst wird 0
     * zurückgegeben.
     * @param element dessen Index zurückgegeben werden soll
     * @return der Index des übergebenen Elements
     */
    public int indexOf(E element) {
        ListNode<E> listNode = head;
        int index = 0;
        while (listNode != null) {
            if (listNode.getValue().equals(element)) {
                break;
            } else {
                index++;
                listNode = listNode.getNext();
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
                ListNode<E> listNode = getNodeAt(index);
                // nun noch das Vorgaengerelement, aber nur falls listNode!=null
                // d.h. listNode verweist auf ein Element in der Liste
                if (listNode != null) {
                    // jetzt kann der Vorgaenger besorgt werden
                    ListNode<E> prev = getNodeAt(index - 1);
                    // jetzt noch listNode aus der Liste ausketten
                    prev.setNext(listNode.getNext());
                }
            }
        }
    }

}

