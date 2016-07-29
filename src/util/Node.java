package util;

public class Node<E> {

    /**
     * Gespeichertes Element
     */
    private E value;

    /**
     * Nachfolgende Node
     */
    private Node<E> next;

    /**
     * Gibt das gespeicherte Element zurück
     * @return Element
     */
    public E getValue() {
        return value;
    }

    /**
     * Setzt ein neues Element
     * @param v element
     */
    public void setValue(E v) {
        value = v;
    }

    /**
     * Gibt die nachfolgende Node zurück
     * @return nachfolgende Node
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Setzt die nachfolgende Node
     * @param n Node
     */
    public void setNext(Node<E> n) {
        next = n;
    }

}


