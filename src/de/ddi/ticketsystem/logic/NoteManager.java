package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;
import util.List;

import java.io.IOException;
import java.util.Date;

public class NoteManager extends Manager{

    private List<String> loaded;
    private List<String> toSave;
    private UserManager userManager;

    /**
     * Erstellt ein Objekt vom Typ NoteManager, der die Notizen zu Tickets über einen Zugriff laden und speichern kann,
     * und die Notizen zu Tickets verwaltet.
     * @param access Ein Zugriff vom Typ Access zum Laden und Speichern der Notizen
     * @param userManager Ein UserManager zum Zugriff auf Nutzerdaten
     */
    public NoteManager(Access access, UserManager userManager) {
        super(access);
        load();
        toSave = new List<>();
        this.userManager = userManager;
    }

    /**
     * Fügt Notizen anhand einer TicketID eienr Liste hinzu, die Notizen zum Speicher vormerkt.
     * @param ticketId Die ID des Tickets, zu dem die Notizen gehören
     * @param notes Eine Liste von Notizen
     */
    public void addToSave(int ticketId, List<Note> notes) {
        for(int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            int id = toSave.size();
            String text = id + ";" + ticketId + ";" + userManager.indexOf(note.getEmployee()) + ";" + note.saveToText() + ";";
            toSave.add(text);
        }
    }

    /**
     * Weist einen Zugriff vom Typ Access an, die zum Speichern vorgemerkten Notizen zu speichern
     */
    @Override
    public void save() {
        try {
            access.save(toSave);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Weißt einen Zugriff vom Typ Access an, die Notizen zu laden und speichert diese intern.
     */
    @Override
    protected void load() {
        try {
            loaded = access.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gibt eine Liste von Notizen zurück, die zu dem Ticket mit der übergebenen ID gehören.
     * @param id Die ID eines Tickets
     * @return List<Note> aus den zu dem Ticket gehörenden Notizen
     */
    public List<Note> getForTicketId(int id) {
        List<Note> notes = new List<>();
        for(int i = 0; i < loaded.size(); i++) {
            String[] values = loaded.get(i).split(";");
            int ticketId = Integer.parseInt(values[1]);
            if(ticketId == id) {
                Employee employee = (Employee) userManager.get(Integer.parseInt(values[2]));
                Date creationDate = new Date(values[5]);
                Note note = new Note(values[3], values[4], employee, creationDate);
                notes.add(note);
            }
        }
        return notes;
    }
}
