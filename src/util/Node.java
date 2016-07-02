package util;

public class Node<E> {

    // Nutzinformation ist ein Document
    private E value;

    // Verwaltungsinformation

    private Node<E> next;

    public E getValue() {
        return value;
    }

    public void setValue(E v) {
        value = v;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> n) {
        next = n;
    }

    public String toString() // gibt Node-Object aus zusammen mit value
    {
        return "[ " + value + " ] ->";
    }
}


