package util;

public class Stack<E> {
    /**
     * Stack als Spezialform der Liste implementieren
     */
    private List<E> stack;

    public Stack() {
        stack = new List<>();
    }

    /**
     * Ein neuen Eintrag auf den Stack legen
     * @param entry Eintrag
     */
    public void push(E entry) {
        stack.add(entry);
    }

    /**
     * Den obersten Eintrag vom Stack nehmen und zurückgeben
     * @return Eintrag
     */
    public E pop() {
        int lastIndex = stack.size() - 1;
        E entry = stack.get(lastIndex);
        stack.remove(lastIndex);
        return entry;
    }

    /**
     * Den obersten Eintrag vom Stack zurückgeben
     * @return Eintrag
     */
    public E peek() {
        return stack.get(stack.size() - 1);
    }

}
