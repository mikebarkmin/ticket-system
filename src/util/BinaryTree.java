package util;

public class BinaryTree<K extends Comparable<K>, V> {

    /**
     * Wurzel des Binärbaums
     */
    private BinaryTreeNode<K, V> root;

    public BinaryTree() {
        root = null;
    }

    /**
     * Fügt ein Element anhand eines Schlüssels in den Binärbaum ein.
     * @param key Schlüssel
     * @param value Element
     */
    public void insert(K key, V value) {
        // neuen Knoden erstellen
        BinaryTreeNode<K, V> binaryTreeNode = new BinaryTreeNode<>(key, value);
        // Überprüfen, ob der Binärbaum leer ist
        if(root == null) {
            // Den neuen Knoten als Wurzel setzten.
            root = binaryTreeNode;
        } else {
            // Den neuen Knoten in den Binärbaum einfügen. Ausgehend von der Wurzel.
            insert(binaryTreeNode, root);
        }
    }

    /**
     * Rekursive Funktion die eine BinaryTreeNode in den Binärbaum einfügt.
     * @param newBTN einzufügende Node
     * @param currentBTN momentane Node
     */
    private void insert(BinaryTreeNode<K, V> newBTN, BinaryTreeNode<K, V> currentBTN) {
        // Überprüfen, ob momentane Knoten den gleichen Schlüssel hat wie der Einzufügende. Wenn dies nicht der Fall ist
        // die beiden Knoten mittels vergleichen.
        if (currentBTN.getKey().compareTo(newBTN.getKey()) == 0) {
            return;
        } else if(currentBTN.getKey().compareTo(newBTN.getKey()) < 0) {
            // Wenn ein größerer Nachfolgeknoten existiert, dann führe diese Methode rekursiv wieder auf. Sonst setzte
            // den neuen Knoten als größerer Nachfolgeknoten.
            if(currentBTN.getLarger() != null) {
                insert(newBTN, currentBTN.getLarger());
            } else {
                currentBTN.setLarger(newBTN);
            }
        } else if(currentBTN.getKey().compareTo(newBTN.getKey()) > 0) {
            // Wenn ein kleinerer Nachfolgeknoten existiert, dann führe diese Methode rekursiv wieder auf. Sonst setzte
            // den neuen Knoten als kleinerer Nachfolgeknoten.
            if(currentBTN.getSmaller() != null) {
                insert(newBTN, currentBTN.getSmaller());
            } else {
                currentBTN.setSmaller(newBTN);
            }
        }
    }

    /**
     * Gibt das Element zurück, welches den Schlüssel key hat. Ist das Element nicht im Baum, wird null zurückgegeben
     * @param key Schlüssel, des Elements, welches zurückgegeben werden soll
     * @return Das Element mit dem Schlüssel key. Ist dieses nicht vorhanden, wird null zurückgegeben.
     */
    public V get(K key) {
        // Wenn keine Wurzel existiert, ist der Baum leer und es wird null zurückgebenden. Anderenfalls wird das Element
        // über eine weitere Methode ermittelt und dann zurückgegeben.
        if(root == null) {
            return null;
        } else {
            return get(key, root);
        }
    }

    /**
     * Rekursive Funktionen die ein Element zu dem passenden Schlüssel zurückgibt.
     * @param key Schlüssel
     * @param currentBTN momentane Node
     * @return Element zum Schlüssel
     */
    private V get(K key, BinaryTreeNode<K, V> currentBTN) {
        // Abbruchbedingung, wenn der momentane Knote null ist.
        if(currentBTN != null) {
            // Wenn der Schlüssel des momentanen Knoten gleich dem Gesuchten ist, dann gebe das passende Element zurück.
            // Anderenfalls schaue ob der Schlüssel kleiner oder größerer ist und bestimme damit den nächsten Knoten
            if (currentBTN.getKey().compareTo(key) == 0) {
                return currentBTN.getValue();
            } else if (currentBTN.getKey().compareTo(key) < 0) {
                return get(key, currentBTN.getLarger());
            } else if (currentBTN.getKey().compareTo(key) > 0) {
                return get(key, currentBTN.getSmaller());
            }
        }
        // Der Schlüssel wurde nicht gefunden, daher wird null zurückgegeben.
        return null;
    }
}
