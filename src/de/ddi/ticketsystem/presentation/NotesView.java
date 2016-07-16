package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.Note;
import de.ddi.ticketsystem.logic.Ticket;
import de.ddi.ticketsystem.logic.UserManager;
import util.List;

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
        name = "Notizen";
        notes = this.ticket.getNotes();

        options = new String[]{
                "[L]öschen",
                "[N]eu",
        };
    }

    /**
     * Gibt die Notizen zu dem Ticket aus und zeigt die Anzeige an
     */
    @Override
    public void show() {
        String text = "";
        for(int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            text += i + ") " + note.getEmployee().getFirstName() + " " + note.getEmployee().getLastName() + " - "
                    + note.getTitle() + " (" + note.getCreationDate() + ")\n";
            text += "\t" + note.getContent() + "\n\n";
        }
        this.text = text;
        super.show();
    }

    /**
     * Auswertung der Notes-Anzeige.
     * Wurde "L" eingegeben, wird eine Möglichkeit zur Löschung einer Notizen ausgegeben
     * Wurde "N" eingegeben, wird eine Möglichkeit zum Erstellen einer Notiz angezeigt
     * @param input Die Eingabe des Nutzers
     */
    @Override
    public void evaluate(String input) {
        switch (input) {
            case "L":
                deleteNote();
                break;
            case "N":
                createNote();
                break;
        }
    }

    private void deleteNote() {
        System.out.print("Notiznummer: ");
        int noteId = scanner.nextInt();
        Note note = notes.get(noteId);
        ticket.removeNote(note);
    }

    private void createNote() {
        System.out.print("Titel: ");
        String title = scanner.next();
        System.out.print("Inhalt: ");
        String content = scanner.next();
        Note note = new Note(title, content, (Employee) currentUser);
        ticket.addNote(note);
    }
}
