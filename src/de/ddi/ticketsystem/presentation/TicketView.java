package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.Ticket;

public class TicketView extends View {

    private Ticket ticket;

    /**
     * Erstellt eine Anzeige zum ausgeben der Daten zu einem Ticket mit den Optionen, den Status zu ändern
     * und die Notizen zu dem Ticket anzeigen zu lassen
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param ticket Das Ticket, welches angezeigt werden soll
     */
    public TicketView(ViewManager viewManager, Ticket ticket) {
        super(viewManager);
        name = "Ticket";
        this.ticket = ticket;
        employeeOptions = new String[]{
                "[S]tatus ändern",
                "[N]otizen (" + ticket.getNotes().size() + ")"
        };
    }

    @Override
    public void show() {
        String text = "";
        text += "Beschreibung\n\t" + ticket.getDescription() + "\n";
        text += "Kunde\n\t" + ticket.getCustomer().getCompany() + " (" + ticket.getCustomer().getFirstName() + " " + ticket.getCustomer().getLastName() + ")\n";
        text += "Angestellter\n\t" + ticket.getEmployee().getFirstName() + " " + ticket.getEmployee().getLastName() + "\n";
        text += "Aufgenommen\n\t" + ticket.getCreationDate() + "\n";
        text += "Status\n\t" + ticket.getStatus() + "\n";
        text += "Priorität\n\t" + ticket.getPriority() + "\n";
        this.text = text;
        super.show();
    }

    /**
     * Wertet die Anzeige aus.
     * Wurde "S" eingegeben, wird eine Option zum wechseln des Ticketstatus angezeigt.
     * Wurde "N" eingegeben, wird der viewManager angewiesen, als nächstes die Notizen zu dem Ticket anzuzeigen
     * @param input Die Eingabe des Nutzers
     */
    @Override
    public void evaluate(String input) {
        switch (input) {
            case "S":
                changeStatus();
                break;
            case "N":
                showNotes();
                break;
        }
    }

    /**
     * Den Status des Tickets ändern
     */
    private void changeStatus() {
        String text = "Status (";
        text += Status.RECORDED + ", " + Status.PROCESSED + ", " + Status.WAITING_FOR_FEEDBACK + ", " + Status.SOLVED
                + " oder " + Status.CLOSED + "): ";
        System.out.print(text);
        String statusString = scanner.next();
        Status status = Status.valueOf(statusString);
        ticket.setStatus(status);
    }

    /**
     * Die Notizen des Tickets anzeigen
     */
    private void showNotes() {
        viewManager.setNextView(new NotesView(viewManager, ticket));
    }
}
