import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.TicketManager;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class TicketManagerTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }
    // bla
    @Test(name="Konstruktor")
    public void constructur() {
    	int size = 20;
    	TicketManager ticketManager = new TicketManager(size);
    	Ticket[] tickets = (Ticket[]) StaticMethods.getValueFromField(ticketManager, "tickets");
    	if(tickets.length == size) {
    		punkte += 1;
    	} else {
            TracingFramework.printError("Der Konstruktor initialisiert das interne Array nicht mit der übergebenen Größe.");
    	}
    }
    
    @Test(name="add")
    public void add() {
    	// Create TicketManager with size 11
    	TicketManager ticketManager = new TicketManager(11);
    	StaticMethods.setValueToField(ticketManager, "tickets", new Ticket[11]);
    	// add a Ticket to the TicketManager
    	Ticket ticket = new Ticket(null, null, null, null, 0);
    	StaticMethods.setValueToField(ticket, "description", "ticket-0");
    	ticketManager.add(ticket);
    	// check if the ticket has been added to the ticketManager's array
    	Ticket[] tickets = (Ticket[]) StaticMethods.getValueFromField(ticketManager, "tickets");
    	for(Ticket t : tickets) {
    		if (t != null) {
				String ticketDescription = (String) StaticMethods.getValueFromField(t, "description");
				if(ticketDescription.equals("ticket-0")) {
					punkte += 2;
				}
				else {
					TracingFramework.printError("Die Methode add fügt im TicketManager neue Tickets nicht korrekt hinzu");
					return;
				}
    		}
    	}
    	// add Tickets until the TicketManager should be filled
    	for(int i = 1; i < 11; i++) {
        	ticket = new Ticket(null, null, null, null, 0);
        	StaticMethods.setValueToField(ticket, "description", "ticket-" + i);
        	ticketManager.add(ticket);
    	}
    	// check if the tickets are now inside the ticketManager's array
    	tickets = (Ticket[]) StaticMethods.getValueFromField(ticketManager, "tickets");
    	boolean[] found = new boolean[11];
    	for(int i = 0; i < 11; i++) {
        	for(Ticket t : tickets) {
        		if (t != null) {
					String ticketDescription = (String) StaticMethods.getValueFromField(t, "description");
					if(ticketDescription.equals("ticket-" + i)) {
						punkte += 2;
						found[i] = true;
						break;
					}
        		}
        	}
    	}
    	int countFound = 0;
    	for(boolean b : found) {
    		if(b) {
    			countFound++;
    		}
    	}
    	if(countFound != 11) {
    		TracingFramework.printError("Fehler in der Methode add im TicketManager. Die Methode fügt einem"
    				+ "TicketManager der Größe 11 keine 11 Tickets korrekt hinzu!");
    	}
    }
    
    @Test(name="remove")
    public void remove() {
    	TicketManager ticketManager = new TicketManager(3);
    	Ticket ticket1 = new Ticket(null, null, null, null, 0);
    	Ticket ticket2 = new Ticket(null, null, null, null, 0);
    	Ticket ticket3 = new Ticket(null, null, null, null, 0);
    	Ticket[] tickets = {ticket1, ticket2, ticket3};
    	StaticMethods.setValueToField(ticketManager, "tickets", tickets);
    	int removePoints = 6;
    	ticketManager.remove(ticket1);
    	for (Ticket ticket : tickets) {
    		if(ticket == ticket1) {
    			removePoints -= 2;
    			TracingFramework.printError("Ein Ticket konnte nicht entfernt werden.");
    		}
    	}
    	ticketManager.remove(ticket2);
    	for (Ticket ticket : tickets) {
    		if(ticket == ticket2) {
    			removePoints -= 2;
    			TracingFramework.printError("Ein Ticket konnte nicht entfernt werden.");
    		}
    	}
    	ticketManager.remove(ticket3);
    	for (Ticket ticket : tickets) {
    		if(ticket == ticket3) {
    			removePoints -= 2;
    			TracingFramework.printError("Ein Ticket konnte nicht entfernt werden.");
    		}
    	}
    	punkte += removePoints;
    }
}
