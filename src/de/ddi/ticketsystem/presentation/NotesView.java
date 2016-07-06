package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Note;
import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.UserManager;
import util.List;

public class NotesView extends View {

    private Ticket ticket;
    private List<Note> notes;

    public NotesView(ViewManager viewManager, Ticket ticket) {
        super(viewManager);
        this.ticket = ticket;
        this.name = "Notizen";
        this.notes = this.ticket.getNotes();

        this.options = new String[]{
                "[L]öschen",
                "[N]eu",
                "[B]eenden"
        };
    }

    @Override
    public void show() {
        String text = "";
        for(int i = 0; i < this.notes.size(); i++) {
            Note note = this.notes.get(i);
            text += note.getEmployee().getFirstName() + " " + note.getEmployee().getLastName() + " - "
                    + note.getTitle() + " (" + note.getCreationDate() + ")\n";
            text += "\t" + note.getContent() + "\n\n";
        }
        this.text = text;
        super.show();
    }

    @Override
    public void evaluate(String input) {

    }
}
