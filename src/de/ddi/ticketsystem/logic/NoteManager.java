package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;
import util.List;

import java.io.IOException;
import java.util.Date;

public class NoteManager extends Manager{

    private List<String> loaded;
    private List<String> toSave;
    private UserManager userManager;

    public NoteManager(Access access, UserManager userManager) {
        super(access);
        this.load();
        this.toSave = new List<>();
        this.userManager = userManager;
    }

    public void addToSave(int ticketId, List<Note> notes) {
        for(int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            int id = this.toSave.size();
            String text = id + ";" + ticketId + ";" + userManager.indexOf(note.getEmployee()) + ";" + note.saveToText() + ";";
            this.toSave.add(text);
        }
    }

    @Override
    public void save() {
        try {
            this.access.save(toSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void load() {
        try {
            this.loaded = this.access.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Note> getForTicketId(int id) {
        List<Note> notes = new List<>();
        for(int i = 0; i < this.loaded.size(); i++) {
            String[] values = this.loaded.get(i).split(";");
            int ticketId = Integer.parseInt(values[1]);
            if(ticketId == id) {
                Employee employee = (Employee) this.userManager.get(Integer.parseInt(values[2]));
                Date creationDate = new Date(values[5]);
                Note note = new Note(values[3], values[4], employee, creationDate);
                notes.add(note);
            }
        }
        return notes;
    }
}
