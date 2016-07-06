package util;

public class List<E> {

    // Der Listenkopf oder der Verweis/Referenz auf das erste Element der Liste
    ListNode<E> head;

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
        ListNode<E> listNode = head; // lokale Variable zum Durchlaufen der Listenelement
        while (listNode != null) {
            listNode = listNode.getNext(); // gehe zum naechsten Element
            // das kann(!) null sein, wenn listNode auf das
            // letzte Element gezeigt hat!
            size = size + 1;        // mitzaehlen, dass ein Element da war(!)
        }

        return size;
    }

    // Hilfsmethode fuer das Besorgen des Elementes an der Stell index 0 ..  size-1
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

    public E get(int index) {
        ListNode<E> listNode = getNodeAt(index); // hole das Element (im Container ListNode) an der Stelle index

        if (isEmpty()) {
            // da gab es keins an der Stelle index
            return null;
        } else {
            return listNode.getValue();
        }
    }

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

    public void add(E value) {
        ListNode<E> listNode = new ListNode<>();
        listNode.setValue(value);
        if (!isEmpty()) {
            ListNode<E> prev = getNodeAt(size() - 1);
            prev.setNext(listNode);
        } else {
            head = listNode;
        }
    }

    public int indexOf(E value) {
        ListNode<E> listNode = head;
        int index = 0;
        while(listNode != null) {
            if(listNode.getValue().equals(value)) {
                break;
            } else {
                index++;
                listNode = listNode.getNext();
            }
        }
        return index;
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

