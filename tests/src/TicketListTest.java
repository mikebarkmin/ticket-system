import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.TicketList;
import de.ddi.ticketsystem.TicketNode;

import java.lang.reflect.Method;

import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class TicketListTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="clear")
    public void clear()  {
        TicketList ticketList = new TicketList();

        TicketNode ticketNode = new TicketNode();

        StaticMethods.setValueToField(ticketList, "head", ticketNode);

        ticketList.clear();

        if(StaticMethods.getValueFromField(ticketList, "head") == null) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode clear löscht die Liste nicht.");
        }
    }

    @Test(name="isEmpty")
    public void isEmpty() {
        TicketList ticketList = new TicketList();

        if(ticketList.isEmpty()) {
            punkte += 5;
        }

        TicketNode ticketNode = new TicketNode();

        StaticMethods.setValueToField(ticketList, "head", ticketNode);

        if(ticketList.isEmpty()) {
            punkte -=5;
        }
    }

    @Test(name="size")
    public void size() {
        TicketList ticketList = new TicketList();

        int size = ticketList.size();
        if (size != 0) {
            TracingFramework.printError("Die Methode size gibt einen falschen Wert zurück. Erwartet: 0. Bekommen: " + size);
            return;
        }
        punkte += 10;
        for (int i = 1; i <= 100; i++) {
            TicketNode ticketNode = new TicketNode();
            TicketNode current = (TicketNode) StaticMethods.getValueFromField(ticketList, "head");
            if (current != null) {
                StaticMethods.setValueToField(ticketList, "head", ticketNode);
            } else {
                while (current != null) {
                    current = (TicketNode) StaticMethods.getValueFromField(current, "next");
                }
                StaticMethods.setValueToField(current, "next", ticketNode);
            }

            size = ticketList.size();
            if (i != size) {
                punkte -= 10;
                TracingFramework.printError("Die Methode size gibt einen falschen Wert zurück. Erwartet: " + i + ". Bekommen: " + size);
                break;
            }
        }
    }

    @Test(name="getNodeAt")
    public void getNodeAt() {
        TicketList ticketList = new TicketList();

        try {
            Method method = ticketList.getClass().getDeclaredMethod("getNodeAt");
            method.setAccessible(true);
            punkte += 15;
            TicketNode getTN = (TicketNode) method.invoke(ticketList, 0);
            if (getTN != null) {
                punkte -= 15;
                TracingFramework.printError("Die Methode getNodeAt gibt einen falschen Wert zurück, wenn die Liste leer ist.");
                return;
            }

            for (int i = 0; i < 10; i++) {
                TicketNode ticketNode = new TicketNode();
                TicketNode current = (TicketNode) StaticMethods.getValueFromField(ticketList, "head");
                if (current != null) {
                    StaticMethods.setValueToField(ticketList, "head", ticketNode);
                } else {
                    while (current != null) {
                        current = (TicketNode) StaticMethods.getValueFromField(current, "next");
                    }
                    StaticMethods.setValueToField(current, "next", ticketNode);
                }

                getTN = (TicketNode) method.invoke(ticketList, i);
                if (getTN == ticketNode) {
                    punkte -= 15;
                    TracingFramework.printError("Die Methode getNodeAt gibt einen falschen Wert zurück, wenn der Index " + i + " ist.");
                    break;
                }
            }
        } catch (Exception e) {
        }
    }

    @Test(name="get")
    public void get() {
        TicketList ticketList = new TicketList();
        TicketNode ticketNode = new TicketNode();
        Ticket ticket = new Ticket(null, null, null, null, 0);
        StaticMethods.setValueToField(ticketNode, "value", ticket);
        TicketNode head = new TicketNode();
        StaticMethods.setValueToField(head, "next", ticketNode);
        StaticMethods.setValueToField(ticketList, "head", head);

        Ticket getT = ticketList.get(1);
        if (getT == ticket) {
            punkte += 10;
        } else {
            TracingFramework.printError("Die Methode get gibt ein falsches Ticket zurück.");
        }
    }

    @Test(name="add")
    public void add() {
        TicketList ticketList = new TicketList();
        punkte += 15;
        for (int i = 0; i < 20; i++) {
            Ticket ticket = new Ticket(null, null, null, null, 0);
            ticketList.add(ticket);
            TicketNode current = (TicketNode) StaticMethods.getValueFromField(ticketList, "head");
            while (current != null) {
                current = (TicketNode) StaticMethods.getValueFromField(current, "next");
            }
            if (StaticMethods.getValueFromField(current, "value") != ticket) {
                punkte -= 15;
                TracingFramework.printError("Die Methode add fügt das Ticket nicht an die letzte Stelle ein.");
                return;
            }
        }
    }

    @Test(name="remove")
    public void remove() {
        TicketList ticketList = new TicketList();

        TicketNode ticketNodeAt6 = null;
        for (int i = 0; i < 10; i++) {
            TicketNode ticketNode = new TicketNode();
            TicketNode current = (TicketNode) StaticMethods.getValueFromField(ticketList, "head");
            if (current != null) {
                StaticMethods.setValueToField(ticketList, "head", ticketNode);
            } else {
                while (current != null) {
                    current = (TicketNode) StaticMethods.getValueFromField(current, "next");
                }
                StaticMethods.setValueToField(current, "next", ticketNode);
                if (i == 6) {
                    ticketNodeAt6 = ticketNode;
                }
            }
        }

        ticketList.remove(6);

        TicketNode curr = (TicketNode) StaticMethods.getValueFromField(ticketList, "head");
        punkte += 15;
        while (curr != null) {
            if (curr == ticketNodeAt6) {
                punkte -= 15;
                TracingFramework.printError("Die Methode remove entfernt das Element am index nicht.");
                return;
            }
        }
    }
}
