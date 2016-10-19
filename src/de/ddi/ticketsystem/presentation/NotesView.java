package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.Note;
import de.ddi.ticketsystem.logic.Ticket;
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
        // TODO
    }

    /**
     * Gibt die Notizen zu dem Ticket aus und zeigt die Anzeige an
     */
    @Override
    public void show() {
        String text = "";
        // TODO
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
        // TODO
    }

    /**
     * Anhand der Notiznummer eine Notiz löschen
     */
    private void deleteNote() {
        // TODO
    }

    /**
     * Eine neue Notiz anlegen
     */
    private void createNote() {
        // TODO
    }
}
