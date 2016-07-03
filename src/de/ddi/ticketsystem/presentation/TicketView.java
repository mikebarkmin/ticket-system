package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.UserManager;

public class TicketView extends View {

    private Ticket ticket;

    public TicketView(UserManager userManager, Ticket ticket) {
        super(userManager);
        this.name = "Ticket";
        this.ticket = ticket;
        String text = "";
        text += "Beschreibung\n\t" + ticket.getDescription() + "\n";
        text += "Kunde\n\t" + ticket.getCustomer().getCompany() + " (" + ticket.getCustomer().getFirstName() + " " + ticket.getCustomer().getLastName() + ")\n";
        text += "Angestellter\n\t" + ticket.getEmployee().getFirstName() + " " + ticket.getEmployee().getLastName() + "\n";
        text += "Aufgenommen\n\t" + ticket.getCreationDate() + "\n";
        text += "Status\n\t" + ticket.getStatus() + "\n";
        text += "Priorität\n\t" + ticket.getPriority() + "\n";
        this.text = text;
        this.options = new String[]{
                "[S]tatus ändern",
                "[N]otizen (" + ticket.getNotes().size() + ")",
                "[B]eenden"
        };
    }

    @Override
    protected void evaluate(String input) {
        input = input.toUpperCase();
        switch (input) {
            case "B":
                this.state = "exit";
                break;
            case "N":
                this.showNotes();
                break;
            case "S":
                this.showEdit();
                break;
        }
    }

    private void showEdit() {
    }

    private void showNotes() {
        NotesView notesView = new NotesView(userManager, this.ticket);
    }
}
