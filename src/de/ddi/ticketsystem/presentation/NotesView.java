package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.Note;
import de.ddi.ticketsystem.logic.Ticket;

import javax.swing.*;
import java.util.List;

public class NotesView extends View {

    private Ticket ticket;
    private List<Note> notes;

    /**
     * Erstellt eine Anzeige, die die Notizen zu einem Ticket ausgibt und dem Nutzer die Möglichkeit gibt, eine Notiz
     * zu löschen, oder eine neue anzulegen
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param ticket Das Ticket, zum dem die Notizen angezeigt werden sollen
     */
    public NotesView(ViewManager viewManager, Ticket ticket) {
        super(viewManager);
        this.ticket = ticket;
        notes = this.ticket.getNotes();
    }

    @Override
    protected String getName() {
        return "Notes";
    }

    @Override
    public JPanel getBody() {
        String text = "";
        for(int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            text += i + ") " + note.getEmployee().getFirstName() + " " + note.getEmployee().getLastName() + " - "
                    + note.getTitle() + " (" + note.getCreationDate() + ")\n";
            text += "\t" + note.getContent() + "\n\n";
        }

        JTextArea textArea = new JTextArea();
        textArea.setText(text);

        JPanel body = new JPanel();
        body.add(textArea);
        return body;
    }

    @Override
    public JPanel getMenu() {
        JPanel menu = new JPanel();
        menu.add(new JLabel("create, delete"));
        return menu;
    }
}
