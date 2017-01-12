import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.TicketList;
import de.ddi.ticketsystem.TicketManager;
import de.ddi.ticketsystem.TicketNode;
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
        TicketList tickets = new TicketList();
        Ticket ticket1 = new Ticket(null, null, null, null, 3);
        StaticMethods.setValueToField(ticketManager, "tickets", tickets);

        tickets.add(ticket1);

        TicketNode head = (TicketNode) StaticMethods.getValueFromField(tickets, "head");
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
        TicketList tickets = new TicketList();

        Ticket ticket1 = new Ticket(null, null, null, null, 3);
        TicketNode ticketNode1 = new TicketNode();
        StaticMethods.setValueToField(ticketNode1, "value", ticket1);
        StaticMethods.setValueToField(tickets, "head", ticketNode1);

        Ticket ticket2 = new Ticket(null, null, null, null, 5);
        TicketNode ticketNode2 = new TicketNode();
        StaticMethods.setValueToField(ticketNode2, "value", ticket2);
        StaticMethods.setValueToField(ticketNode1, "next", ticketNode2);

        Ticket ticket3 = new Ticket(null, null, null, null, 0);
        TicketNode ticketNode3 = new TicketNode();
        StaticMethods.setValueToField(ticketNode3, "value", ticket3);
        StaticMethods.setValueToField(ticketNode2, "next", ticketNode3);

        StaticMethods.setValueToField(ticketManager, "tickets", tickets);

        punkte += 6;
        ticketManager.remove(ticket1);
        TicketNode curr = (TicketNode) StaticMethods.getValueFromField(tickets, "head");
        while (curr != null) {
            if (StaticMethods.getValueFromField(curr, "value") == ticket1) {
                punkte -= 6;
                TracingFramework.printError("Die Methode remove hat das Ticket nicht entfernt.");
                return;
            }
            curr = (TicketNode) StaticMethods.getValueFromField(curr, "next");
        }
    }

    @Test(name="getOldest")
    public void getOldest() {
        TicketManager ticketManager = new TicketManager();
        TicketList tickets = new TicketList();

        Ticket ticket1 = new Ticket(null, null, null, null, 3);
        StaticMethods.setValueToField(ticket1, "priority", 2);
        StaticMethods.setValueToField(ticket1, "creationDate", new Date(1));
        TicketNode ticketNode1 = new TicketNode();
        StaticMethods.setValueToField(ticketNode1, "value", ticket1);
        StaticMethods.setValueToField(tickets, "head", ticketNode1);

        Ticket ticket2 = new Ticket(null, null, null, null, 5);
        StaticMethods.setValueToField(ticket2, "priority", 0);
        StaticMethods.setValueToField(ticket2, "creationDate", new Date(0));
        TicketNode ticketNode2 = new TicketNode();
        StaticMethods.setValueToField(ticketNode2, "value", ticket2);
        StaticMethods.setValueToField(ticketNode1, "next", ticketNode2);

        Ticket ticket3 = new Ticket(null, null, null, null, 0);
        StaticMethods.setValueToField(ticket3, "priority", 3);
        StaticMethods.setValueToField(ticket3, "creationDate", new Date(10));
        TicketNode ticketNode3 = new TicketNode();
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
        TicketList tickets = new TicketList();

        Ticket ticket1 = new Ticket(null, null, null, null, 3);
        StaticMethods.setValueToField(ticket1, "priority", 2);
        StaticMethods.setValueToField(ticket1, "creationDate", new Date(1));
        TicketNode ticketNode1 = new TicketNode();
        StaticMethods.setValueToField(ticketNode1, "value", ticket1);
        StaticMethods.setValueToField(tickets, "head", ticketNode1);

        Ticket ticket2 = new Ticket(null, null, null, null, 5);
        StaticMethods.setValueToField(ticket2, "priority", 0);
        StaticMethods.setValueToField(ticket2, "creationDate", new Date(0));
        TicketNode ticketNode2 = new TicketNode();
        StaticMethods.setValueToField(ticketNode2, "value", ticket2);
        StaticMethods.setValueToField(ticketNode1, "next", ticketNode2);

        Ticket ticket3 = new Ticket(null, null, null, null, 0);
        StaticMethods.setValueToField(ticket3, "priority", 3);
        StaticMethods.setValueToField(ticket3, "creationDate", new Date(10));
        TicketNode ticketNode3 = new TicketNode();
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
