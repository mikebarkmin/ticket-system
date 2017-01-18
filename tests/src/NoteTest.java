import de.ddi.ticketsystem.Employee;
import de.ddi.ticketsystem.Note;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class NoteTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="constructor")
    public void constructor() {
        Employee employee = new Employee(null, null, null, null);
        String title = "Title";
        String content = "Content";
        Note note = new Note(title, content, employee);

        Object title2 = StaticMethods.getValueFromField(note, "title");
        if (title2 == title) {
            punkte += 4;
        } else {
            TracingFramework.printError("Im Konstruktor von Note wurde das Attribut title nicht richtig gesetzt.");
        }
        Object content2 = StaticMethods.getValueFromField(note, "content");
        if (content2 == content) {
            punkte += 4;
        } else {
            TracingFramework.printError("Im Konstruktor von Note wurde das Attribut content nicht richtig gesetzt.");
        }
        Object employee2 = StaticMethods.getValueFromField(note, "employee");
        if (employee2 == employee) {
            punkte += 4;
        } else {
            TracingFramework.printError("Im Konstruktor von Note wurde das Attribut employee nicht richtig gesetzt.");
        }
    }

    @Test(name="Getter")
    public void getter() {
        Note note = new Note(null, null, null);

        Employee employee = new Employee(null, null, null, null);
        StaticMethods.setValueToField(note, "employee", employee);
        Employee employee2 = note.getEmployee();
        if (employee == employee2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getEmployee gibt ein falschen Wert zurück.");
        }

        String title = "Title";
        StaticMethods.setValueToField(note, "title", title);
        String title2 = note.getTitle();
        if (title == title2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getTitle gibt ein falschen Wert zurück.");
        }

        String content = "Content";
        StaticMethods.setValueToField(note, "content", content);
        String content2 = note.getContent();
        if (content == content2) {
            punkte += 5;
        } else {
            TracingFramework.printError("Die Methode getContent gibt ein falschen Wert zurück.");
        }

    }

}
