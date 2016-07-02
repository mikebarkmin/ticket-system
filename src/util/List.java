package util;

public class List<E> {

    // Der Listenkopf oder der Verweis/Referenz auf das erste Element der Liste
    Node<E> head;

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
        Node<E> node = head; // lokale Variable zum Durchlaufen der Listenelement
        while (node != null) {
            node = node.getNext(); // gehe zum naechsten Element
            // das kann(!) null sein, wenn node auf das
            // letzte Element gezeigt hat!
            size = size + 1;        // mitzaehlen, dass ein Element da war(!)
        }

        return size;
    }

    // Hilfsmethode fuer das Besorgen des Elementes an der Stell index 0 ..  size-1
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

    public E get(int index) {
        Node<E> node = getNodeAt(index); // hole das Element (im Container Node) an der Stelle index

        if (isEmpty()) {
            // da gab es keins an der Stelle index
            return null;
        } else {
            return node.getValue();
        }
    }

    public String toString() {
        String tempStr = "{"; // temporaere String-Variable zum Aufsammeln
        Node<E> node = head;   // node ist die temporaere Laufvariable zum Durchlaufen der Liste
        while (node != null)  // solange noch nicht am Ende
        {
            tempStr = tempStr + node; // erst Knoten verarbeiten
            node = node.getNext();    // auf zum naechsten Knoten in der Liste (falls vorhanden!)
        }

        return tempStr + "}";

    }

    public void add(E value) {
        Node<E> node = new Node<>();
        node.setValue(value);
        if (!isEmpty()) {
            Node<E> prev = getNodeAt(size() - 1);
            prev.setNext(node);
        } else {
            head = node;
        }
    }

    public int indexOf(E value) {
        Node<E> node = head;
        int index = 0;
        while(node != null) {
            if(node.getValue().equals(value)) {
                break;
            } else {
                index++;
                node = node.getNext();
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

