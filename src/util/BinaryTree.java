package util;

public class BinaryTree<K extends Comparable<K>, V> {

    private BinaryTreeNode<K, V> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(K key, V value) {
        BinaryTreeNode<K, V> binaryTreeNode = new BinaryTreeNode<>(key, value);
        if(root == null) {
            root = binaryTreeNode;
        } else {
            this.insert(binaryTreeNode, root);
        }
    }

    private void insert(BinaryTreeNode<K, V> newBTN, BinaryTreeNode<K, V> currentBTN) {
        if (currentBTN.getKey().compareTo(newBTN.getKey()) == 0) {
            return;
        } else if(currentBTN.getKey().compareTo(newBTN.getKey()) < 0) {
            if(currentBTN.getLarger() != null) {
                insert(newBTN, currentBTN.getLarger());
            } else {
                currentBTN.setLarger(newBTN);
            }
        } else if(currentBTN.getKey().compareTo(newBTN.getKey()) > 0) {
            if(currentBTN.getSmaller() != null) {
                insert(newBTN, currentBTN.getSmaller());
            } else {
                currentBTN.setSmaller(newBTN);
            }
        }
    }

    public V get(K key) {
        if(root == null) {
            return null;
        } else {
            return get(key, root);
        }
    }

    private V get(K key, BinaryTreeNode<K, V> currentBTN) {
        if(currentBTN != null) {
            if (currentBTN.getKey().compareTo(key) == 0) {
                return currentBTN.getValue();
            } else if (currentBTN.getKey().compareTo(key) < 0) {
                return get(key, currentBTN.getLarger());
            } else if (currentBTN.getKey().compareTo(key) > 0) {
                return get(key, currentBTN.getSmaller());
            }
        }
        return null;
    }
}