package util;

public class BinaryTreeNode<K, V> {

    /**
     * Schlüssel
     */
    private K key;
    /**
     * Gespeichertes Element
     */
    private V value;
    /**
     * Kleinerer Nachfolgeknoten
     */
    private BinaryTreeNode<K, V> smaller;
    /**
     * Größerer Nachfolgeknoten
     */
    private BinaryTreeNode<K, V> larger;

    public BinaryTreeNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Gibt den kleineren Nachfolgeknoten zurück.
     * @return kleinerer Nachfolgeknoten
     */
    public BinaryTreeNode<K, V> getSmaller() {
        return smaller;
    }

    /**
     * Setzt den kleineren Nachfolgeknoten
     * @param smaller
     */
    public void setSmaller(BinaryTreeNode<K, V> smaller) {
        this.smaller = smaller;
    }

    /**
     * Gibt den größeren Nachfolgeknoten zurück
     * @return größerer Nachfolgeknoten
     */
    public BinaryTreeNode<K, V> getLarger() {
        return larger;
    }

    /**
     * Setzt den größeren Nachfolgeknoten
     * @param larger größerer Nachfolgeknoten
     */
    public void setLarger(BinaryTreeNode<K, V> larger) {
        this.larger = larger;
    }

    /**
     * Gib den Schlüssel zurück
     * @return Schlüssel
     */
    public K getKey() {
        return key;
    }

    /**
     * Gib das Element zurück
     * @return Element
     */
    public V getValue() {
        return value;
    }
}
