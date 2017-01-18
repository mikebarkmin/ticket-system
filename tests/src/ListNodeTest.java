import de.ddi.ticketsystem.Ticket;
import util.ListNode;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class ListNodeTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="Getter")
    public void getter() {
        ListNode<Ticket> ticketNode = new ListNode<Ticket>();
        Ticket ticket = new Ticket(null, null, null, null, 0);

        StaticMethods.setValueToField(ticketNode, "value", ticket);

        if (ticketNode.getValue() == ticket) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getValue gibt einen falschen Wert zurück.");
        }

        ListNode<Ticket> ticketNode2 = new ListNode<Ticket>();

        StaticMethods.setValueToField(ticketNode, "next", ticketNode2);

        if (ticketNode.getNext() == ticketNode2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getNext gibt einen falschen Wert zurück.");
        }
    }

    @Test(name="Setter")
    public void setter() {
        ListNode<Ticket> ticketNode = new ListNode<Ticket>();
        Ticket ticket = new Ticket(null, null, null, null, 0);
        ticketNode.setValue(ticket);
        if (StaticMethods.getValueFromField(ticketNode, "value") == ticket) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut value wurde durch die Methode setValue nicht geändert");
        }

        ListNode<Ticket> ticketNode2 = new ListNode<Ticket>();
        ticketNode.setNext(ticketNode2);
        if (StaticMethods.getValueFromField(ticketNode, "next") == ticketNode2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut next wurde durch die Methode setNext nicht geändert");
        }
    }
}
