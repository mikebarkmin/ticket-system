package util;

public class BinaryTreeNode<K, V> {

    private K key;
    private V value;
    private BinaryTreeNode<K, V> smaller;
    private BinaryTreeNode<K, V> larger;

    public BinaryTreeNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public BinaryTreeNode<K, V> getSmaller() {
        return smaller;
    }

    public void setSmaller(BinaryTreeNode<K, V> smaller) {
        this.smaller = smaller;
    }

    public BinaryTreeNode<K, V> getLarger() {
        return larger;
    }

    public void setLarger(BinaryTreeNode<K, V> larger) {
        this.larger = larger;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
