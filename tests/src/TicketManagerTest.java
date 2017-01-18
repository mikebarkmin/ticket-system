import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.Status;
import util.List;
import de.ddi.ticketsystem.TicketManager;
import util.ListNode;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

import java.util.Date;

public class TicketManagerTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }
    // bla
    @Test(name="Konstruktor")
    public void constructur() {
        TicketManager ticketManager = new TicketManager();
        if (StaticMethods.getValueFromField(ticketManager, "tickets") != null) {
            punkte += 5;
        } else {
            TracingFramework.printError("Der Konstruktor initialisiert nicht das Attribut tickets");
        }
    }

    @Test(name="add")
    public void add() {
        TicketManager ticketManager = new TicketManager();
        List<Ticket> tickets = new List<Ticket>();
        Ticket ticket1 = new Ticket(null, null, null, null, 3);
        StaticMethods.setValueToField(ticketManager, "tickets", tickets);

        tickets.add(ticket1);

        ListNode<Ticket> head = (ListNode<Ticket>) StaticMethods.getValueFromField(tickets, "head");
        if (StaticMethods.getValueFromField(head, "value") == ticket1) {
            punkte += 6;
        } else {
            TracingFramework.printError("Die Methode add hat das Ticket nicht hinzugefügt.");
            return;
        }
    }

    @Test(name="remove")
    public void remove() {
        TicketManager ticketManager = new TicketManager();
        List<Ticket> tickets = new List<Ticket>();

        Ticket ticket1 = new Ticket(null, null, null, null, 3);
        ListNode<Ticket> ticketNode1 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode1, "value", ticket1);
        StaticMethods.setValueToField(tickets, "head", ticketNode1);

        Ticket ticket2 = new Ticket(null, null, null, null, 5);
        ListNode<Ticket> ticketNode2 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode2, "value", ticket2);
        StaticMethods.setValueToField(ticketNode1, "next", ticketNode2);

        Ticket ticket3 = new Ticket(null, null, null, null, 0);
        ListNode<Ticket> ticketNode3 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode3, "value", ticket3);
        StaticMethods.setValueToField(ticketNode2, "next", ticketNode3);

        StaticMethods.setValueToField(ticketManager, "tickets", tickets);

        punkte += 6;
        ticketManager.remove(ticket1);
        ListNode<Ticket> curr = (ListNode<Ticket>) StaticMethods.getValueFromField(tickets, "head");
        while (curr != null) {
            if (StaticMethods.getValueFromField(curr, "value") == ticket1 && StaticMethods.getValueFromField(ticket1, "status") != Status.CLOSED) {
                punkte -= 6;
                TracingFramework.printError("Die Methode remove hat das Ticket nicht entfernt.");
                return;
            }
            curr = (ListNode<Ticket>) StaticMethods.getValueFromField(curr, "next");
        }
    }

    @Test(name="getOldest")
    public void getOldest() {
        TicketManager ticketManager = new TicketManager();
        List<Ticket> tickets = new List<Ticket>();

        Ticket ticket1 = new Ticket(null, null, null, null, 3);
        StaticMethods.setValueToField(ticket1, "priority", 2);
        StaticMethods.setValueToField(ticket1, "creationDate", new Date(1));
        ListNode<Ticket> ticketNode1 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode1, "value", ticket1);
        StaticMethods.setValueToField(tickets, "head", ticketNode1);

        Ticket ticket2 = new Ticket(null, null, null, null, 5);
        StaticMethods.setValueToField(ticket2, "priority", 0);
        StaticMethods.setValueToField(ticket2, "creationDate", new Date(0));
        ListNode<Ticket> ticketNode2 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode2, "value", ticket2);
        StaticMethods.setValueToField(ticketNode1, "next", ticketNode2);

        Ticket ticket3 = new Ticket(null, null, null, null, 0);
        StaticMethods.setValueToField(ticket3, "priority", 3);
        StaticMethods.setValueToField(ticket3, "creationDate", new Date(10));
        ListNode<Ticket> ticketNode3 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode3, "value", ticket3);
        StaticMethods.setValueToField(ticketNode2, "next", ticketNode3);

        StaticMethods.setValueToField(ticketManager, "tickets", tickets);

        Ticket oldest = ticketManager.getOldest();
        if(oldest == ticket2) {
            punkte += 10;
        } else {
            TracingFramework.printError("Die Methode getOldest in der Klasse TicketManager gibt ein falsches Ticket zurück");
        }
    }

    @Test(name="next")
    public void next() {
        TicketManager ticketManager = new TicketManager();
        List<Ticket> tickets = new List<Ticket>();

        Ticket ticket1 = new Ticket(null, null, null, null, 3);
        StaticMethods.setValueToField(ticket1, "priority", 2);
        StaticMethods.setValueToField(ticket1, "creationDate", new Date(1));
        ListNode<Ticket> ticketNode1 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode1, "value", ticket1);
        StaticMethods.setValueToField(tickets, "head", ticketNode1);

        Ticket ticket2 = new Ticket(null, null, null, null, 5);
        StaticMethods.setValueToField(ticket2, "priority", 0);
        StaticMethods.setValueToField(ticket2, "creationDate", new Date(0));
        ListNode<Ticket> ticketNode2 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode2, "value", ticket2);
        StaticMethods.setValueToField(ticketNode1, "next", ticketNode2);

        Ticket ticket3 = new Ticket(null, null, null, null, 0);
        StaticMethods.setValueToField(ticket3, "priority", 3);
        StaticMethods.setValueToField(ticket3, "creationDate", new Date(10));
        ListNode<Ticket> ticketNode3 = new ListNode<Ticket>();
        StaticMethods.setValueToField(ticketNode3, "value", ticket3);
        StaticMethods.setValueToField(ticketNode2, "next", ticketNode3);

        StaticMethods.setValueToField(ticketManager, "tickets", tickets);

        Ticket oldest = ticketManager.next();
        if(oldest == ticket3) {
            punkte += 10;
        } else {
            TracingFramework.printError("Die Methode next in der Klasse TicketManager gibt ein falsches Ticket zurück");
        }
    }
}
