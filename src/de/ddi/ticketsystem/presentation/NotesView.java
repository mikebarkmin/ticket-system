package de.ddi.ticketsystem.presentation;

import de.ddi.ticketsystem.logic.Employee;
import de.ddi.ticketsystem.logic.Note;
import de.ddi.ticketsystem.logic.Ticket;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.List;

public class NotesView extends View {

    private Ticket ticket;
    private List<Note> notes;
    private JPanel body;

    /**
     * Erstellt eine Anzeige, die die Notizen zu einem Ticket ausgibt und dem Nutzer die Möglichkeit gibt, eine Notiz
     * zu löschen, oder eine neue anzulegen
     * @param viewManager ViewManager, der die Anzeige verwaltet
     * @param ticket Das Ticket, zum dem die Notizen angezeigt werden sollen
     */
    public NotesView(ViewManager viewManager, Ticket ticket) {
        super(viewManager);
        this.ticket = ticket;
        body = new JPanel(new GridBagLayout());
    }

    @Override
    protected String getName() {
        return "Notes";
    }

    private void updateBody() {
        body.removeAll();
        notes = this.ticket.getNotes();
        int i = 0;
        GridBagConstraints c = new GridBagConstraints();
        for (Note note : notes) {
            c.gridy = i++;
            c.weightx = 1;
            c.fill = GridBagConstraints.BOTH;
            body.add(getNotePanel(note), c);
        }
        c.gridy = i;
        body.add(newNotePanel(), c);
        body.repaint();
        body.revalidate();
    }

    @Override
    public JPanel getBody() {
        updateBody();
        return body;
    }

    private JPanel newNotePanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder head = BorderFactory.createTitledBorder(loweredetched, "New Note");
        head.setTitleJustification(TitledBorder.RIGHT);
        c.fill = GridBagConstraints.HORIZONTAL;
        JTextField titleField = new JTextField("Title");
        panel.add(titleField, c);
        c.gridy = 1;
        c.weightx = 1;
        JTextArea contentArea = new JTextArea("Content");
        contentArea.setRows(4);
        panel.add(contentArea, c);
        JButton addButton = new JButton("Add");
        addButton.addActionListener(e -> {
            Note note = new Note(titleField.getText(), contentArea.getText(),
                    (Employee) viewManager.getUserManager().getCurrent());
            ticket.addNote(note);
            updateBody();
        });
        c.gridy = 2;
        panel.add(addButton, c);
        panel.setBorder(head);
        return panel;
    }

    private JPanel getNotePanel(Note note) {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        String date = note.getCreationDate().toString();
        String title = "<html><h4>" + note.getTitle() + "</h4></html>";
        String content = note.getContent();
        String employee = note.getEmployee().getFirstName() + " " + note.getEmployee().getLastName();
        Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder head = BorderFactory.createTitledBorder(loweredetched, employee + " - " + date);
        head.setTitleJustification(TitledBorder.RIGHT);
        panel.add(new JLabel(title), c);
        c.gridy = 1;
        c.weightx = 1;
        panel.add(new JLabel(content), c);
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(e -> {
            ticket.removeNote(note);
            updateBody();
        });
        c.gridy = 2;
        panel.add(deleteButton, c);
        panel.setBorder(head);
        return panel;
    }

    @Override
    public JPanel getMenu() {
        JPanel menu = new JPanel();
        return menu;
    }
}
