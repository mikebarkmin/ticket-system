package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Status;
import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.UserManager;

public class TicketView extends View {

    private Ticket ticket;

    public TicketView(ViewManager viewManager, Ticket ticket) {
        super(viewManager);
        name = "Ticket";
        this.ticket = ticket;
        options = new String[]{
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

    private void changeStatus() {
        String text = "Status (";
        text += Status.RECORDED + ", " + Status.PROCESSED + ", " + Status.WAITING_FOR_FEEDBACK + ", " + Status.SOLVED
                + " oder " + Status.CLOSED + "): ";
        System.out.print(text);
        String statusString = scanner.next();
        Status status = Status.valueOf(statusString);
        ticket.setStatus(status);
    }

    private void showNotes() {
        viewManager.setNextView(new NotesView(viewManager, ticket));
    }
}
