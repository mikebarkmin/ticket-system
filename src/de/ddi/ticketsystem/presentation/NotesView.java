package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Note;
import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.UserManager;
import util.List;

public class NotesView extends View {

    private Ticket ticket;
    private List<Note> notes;

    public NotesView(UserManager userManager, Ticket ticket) {
        super(userManager);
        this.ticket = ticket;
        this.name = "Notizen";
        this.notes = this.ticket.getNotes();

        String text = "";
        for(int i = 0; i < this.notes.size(); i++) {
            Note note = this.notes.get(i);
            text += note.getEmployee().getFirstName() + " " + note.getEmployee().getLastName() + " - "
                    + note.getTitle() + " (" + note.getCreationDate() + ")\n";
            text += "\t" + note.getContent() + "\n\n";
        }
        this.text = "Bevor Sie das Programm benutzen können müssen Sie sich anmelden.";
        this.options = new String[]{
                "[L]öschen",
                "[N]eu",
                "[B]eenden"
        };
    }

    @Override
    protected void evaluate(String input) {
        input = input.toUpperCase();
        switch (input) {
            case "L":
                this.showDelete();
                break;
            case "N":
                this.showCreate();
                break;
            case "B":
                this.state = "exit";
                break;
        }

    }

    private void showDelete() {

    }

    private void showCreate() {

    }
}
