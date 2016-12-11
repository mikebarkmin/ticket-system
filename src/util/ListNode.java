package util;

public class ListNode<E> {

    /**
     * Gespeichertes Element
     */
    private E value;

    /**
     * Nachfolgende Node
     */
    private ListNode<E> next;

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
    public ListNode<E> getNext() {
        return next;
    }

    /**
     * Setzt die nachfolgende Node
     * @param n Node
     */
    public void setNext(ListNode<E> n) {
        next = n;
    }

}


