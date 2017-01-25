import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.Employee;
import util.BinaryTreeNode;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class BinaryTreeNodeTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="Getter")
    public void getter() {
        Ticket ticket = new Ticket(null, null, null, null, 0);
        Employee employee = new Employee(null, null, null, null);
        BinaryTreeNode<?,?> btNode = new BinaryTreeNode<>(employee, ticket);

        StaticMethods.setValueToField(btNode, "value", ticket);

        if (btNode.getValue() == ticket) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getValue gibt einen falschen Wert zurück.");
        }

        StaticMethods.setValueToField(btNode, "key", employee);

        if (btNode.getKey() == employee) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getKey gibt einen falschen Wert zurück.");
        }

        BinaryTreeNode<?,?> btNode2 = new BinaryTreeNode<>(employee, ticket);

        StaticMethods.setValueToField(btNode, "smaller", btNode2);

        if (btNode.getSmaller() == btNode2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getSmaller gibt einen falschen Wert zurück.");
        }

        BinaryTreeNode<?,?> btNode3 = new BinaryTreeNode<>(employee, ticket);

        StaticMethods.setValueToField(btNode, "larger", btNode3);

        if (btNode.getLarger() == btNode3) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getLarger gibt einen falschen Wert zurück.");
        }
    }

    @Test(name="Setter")
    public void setter() {
        BinaryTreeNode<Employee,Ticket> btNode = new BinaryTreeNode<>(null, null);
        BinaryTreeNode<Employee,Ticket> btNode2 = new BinaryTreeNode<>(null, null);
        btNode.setSmaller(btNode2);
        if (StaticMethods.getValueFromField(btNode, "smaller") == btNode2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut smaller wurde durch die Methode setSmaller nicht geändert");
        }

        BinaryTreeNode<Employee,Ticket> btNode3 = new BinaryTreeNode<>(null, null);
        btNode.setLarger(btNode3);
        if (StaticMethods.getValueFromField(btNode, "larger") == btNode3) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut larger wurde durch die Methode setLarger nicht geändert");
        }
    }
}
