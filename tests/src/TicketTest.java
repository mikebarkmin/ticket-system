import de.ddi.ticketsystem.Ticket;
import de.ddi.ticketsystem.Note;
import util.ListNode;
import util.List;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class TicketTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name = "addNote")
    public void addNote() {
        Ticket ticket = new Ticket(null, null, null, null, 0);
        List<Note> notes = new List<>();
        Note note = new Note(null, null, null);
        StaticMethods.setValueToField(ticket, "notes", notes);

        ticket.addNote(note);
        ListNode<Note> head = (ListNode<Note>) StaticMethods.getValueFromField(notes, "head");
        if (StaticMethods.getValueFromField(head, "value") == note) {
            punkte += 6;
        } else {
            TracingFramework.printError("Die Methode addNote hat die Notiz nicht hinzugefügt.");
            return;
        }
    }

    @Test(name = "getNotes")
    public void getNotes() {
        Ticket ticket = new Ticket(null, null, null, null, 0);
        Note note1 = new Note(null, null, null);
        ListNode<Note> node1 = new ListNode<>();
        StaticMethods.setValueToField(node1, "value", note1);
        Note note2 = new Note(null, null, null);
        ListNode<Note> node2 = new ListNode<>();
        StaticMethods.setValueToField(node2, "value", note2);
        Note note3 = new Note(null, null, null);
        ListNode<Note> node3 = new ListNode<>();
        StaticMethods.setValueToField(node3, "value", note3);
        List<Note> notes = new List<>();
        StaticMethods.setValueToField(notes, "head", node1);
        StaticMethods.setValueToField(node1, "next", node2);
        StaticMethods.setValueToField(node2, "next", node3);

        StaticMethods.setValueToField(ticket, "notes", notes);

        List<Note> rNotes = ticket.getNotes();

        ListNode<Note> curr = (ListNode<Note>) StaticMethods.getValueFromField(notes, "head");
        ListNode<Note> rCurr = (ListNode<Note>) StaticMethods.getValueFromField(rNotes, "head");
        int notesSize = 0;
        int rNotesSize = 0;

        while (curr != null) {
            notesSize++;
        }

        while (rCurr != null) {
            rNotesSize++;
        }

        if (notesSize != rNotesSize) {
            TracingFramework
                    .printError("Die Methode getNotes gibt eine Liste mit einer falschen Anzahl an Notes zurück.");
        } else {
            punkte += 2;
        }

        punkte += 2;
        while (curr != null) {
            if (curr != rCurr) {
                punkte -= 2;
                TracingFramework.printError(
                        "Die Methode getNotes gibt eine Liste zurück, die Element enthält, welche nicht in der original Liste sind.");

            }
        }

    }

    @Test(name = "remove")
    public void remove() {
        Ticket ticket = new Ticket(null, null, null, null, 0);
        Note note1 = new Note(null, null, null);
        ListNode<Note> node1 = new ListNode<>();
        StaticMethods.setValueToField(node1, "value", note1);
        Note note2 = new Note(null, null, null);
        ListNode<Note> node2 = new ListNode<>();
        StaticMethods.setValueToField(node2, "value", note2);
        Note note3 = new Note(null, null, null);
        ListNode<Note> node3 = new ListNode<>();
        StaticMethods.setValueToField(node3, "value", note3);
        List<Note> notes = new List<>();
        StaticMethods.setValueToField(notes, "head", node1);
        StaticMethods.setValueToField(node1, "next", node2);
        StaticMethods.setValueToField(node2, "next", node3);

        StaticMethods.setValueToField(ticket, "notes", notes);

        ticket.removeNote(note2);

        ListNode<Note> curr = (ListNode<Note>) StaticMethods.getValueFromField(notes, "head");
        punkte += 6;
        while (curr != null) {
            if (StaticMethods.getValueFromField(curr, "value") == note2) {
                punkte -= 6;
                break;
            }
            curr = (ListNode<Note>) StaticMethods.getValueFromField(curr, "next");
        }
    }
}
