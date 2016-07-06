package util;

public class Stack<E> {
    private List<E> stack;

    public Stack() {
        stack = new List<>();
    }

    public void push(E entry) {
        stack.add(entry);
    }

    public E pop() {
        int lastIndex = stack.size() - 1;
        E entry = stack.get(lastIndex);
        stack.remove(lastIndex);
        return entry;
    }

    public E peek() {
        return stack.get(stack.size() - 1);
    }

}
