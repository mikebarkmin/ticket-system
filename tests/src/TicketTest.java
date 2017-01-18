import de.ddi.ticketsystem.Status;
import de.ddi.ticketsystem.Ticket;

import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class TicketTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="ticket")
    public void ticket() {
        Ticket ticket = new Ticket(null, Status.PROCESSED, null, null, 0);
        Status status = (Status) StaticMethods.getValueFromField(ticket, "status");
        if (status == Status.PROCESSED) {
            punkte += 4;
        } else {
            TracingFramework.printError("Der Status wurde im Konstruktor von Ticket nicht richtig gesetzt.");
        }

        ticket.setStatus(Status.SOLVED);
        status = (Status) StaticMethods.getValueFromField(ticket, "status");
        if (status == Status.SOLVED) {
            punkte += 4;
        } else {
            TracingFramework.printError("Die Methode setStatus setzt den Status eines Tickets nicht korrekt.");
        }
        StaticMethods.setValueToField(ticket, "status", Status.CLOSED);
        status = ticket.getStatus();
        if (status == Status.CLOSED) {
            punkte += 4;
        } else {
            TracingFramework.printError("Die Methode getStatus gibt einen falschen Status zurück.");
        }
    }
}
