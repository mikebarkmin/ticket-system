package util;

public class ListNode<E> {

    private E value;

    private ListNode<E> next;

    public E getValue() {
        return value;
    }

    public void setValue(E v) {
        value = v;
    }

    public ListNode<E> getNext() {
        return next;
    }

    public void setNext(ListNode<E> n) {
        next = n;
    }

    public String toString() // gibt ListNode-Object aus zusammen mit value
    {
        return "[ " + value + " ] ->";
    }
}


