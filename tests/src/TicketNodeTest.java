import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.TicketNode;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class TicketNodeTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="Getter")
    public void getter() {
        TicketNode ticketNode = new TicketNode();
        Ticket ticket = new Ticket(null, null, null, null, 0);

        StaticMethods.setValueToField(ticketNode, "value", ticket);

        if (ticketNode.getValue() == ticket) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getValue gibt einen falschen Wert zurück.");
        }

        TicketNode ticketNode2 = new TicketNode();

        StaticMethods.setValueToField(ticketNode, "next", ticketNode2);

        if (ticketNode.getNext() == ticketNode2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getNext gibt einen falschen Wert zurück.");
        }
    }

    @Test(name="Setter")
    public void setter() {
        TicketNode ticketNode = new TicketNode();
        Ticket ticket = new Ticket(null, null, null, null, 0);
        ticketNode.setValue(ticket);
        if (StaticMethods.getValueFromField(ticketNode, "value") == ticket) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut value wurde durch die Methode setValue nicht geändert");
        }

        TicketNode ticketNode2 = new TicketNode();
        ticketNode.setNext(ticketNode2);
        if (StaticMethods.getValueFromField(ticketNode, "next") == ticketNode2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Das Attribut next wurde durch die Methode setNext nicht geändert");
        }
    }
}
