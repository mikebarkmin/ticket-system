package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;
import java.util.List;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class NoteManager extends Manager {

    /**
     * Liste von Strings die geladen wurden
     */
    private List<String> loaded;
    /**
     * Liste von String die zu speichern sind
     */
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
        toSave = new ArrayList<>();
        this.userManager = userManager;
    }

    /**
     * Fügt Notizen anhand einer TicketID eienr Liste hinzu, die Notizen zum Speicher vormerkt.
     * @param ticketId Die ID des Tickets, zu dem die Notizen gehören
     * @param notes Eine Liste von Notizen
     */
    public void addToSave(int ticketId, List<Note> notes) {
        // die Liste von Notizen durchlaufen
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            // eine ID für die Notiz ermitteln
            int id = toSave.size();
            // den String erstellen, welcher weitergegeben wird
            String text = id + ";" + ticketId + ";" + userManager.indexOf(note.getEmployee()) + ";" + note.saveToText();

            toSave.add(text);
        }
    }

    /**
     * Weist einen Zugriff vom Typ Access an, die zum Speichern vorgemerkten Notizen zu speichern
     */
    @Override
    public void save() throws IOException {
        access.save(toSave);
    }

    /**
     * Weißt einen Zugriff vom Typ Access an, die Notizen zu laden und speichert diese intern.
     */
    @Override
    public void load() throws IOException {
        loaded = access.load();
    }

    /**
     * Gibt eine Liste von Notizen zurück, die zu dem Ticket mit der übergebenen ID gehören.
     * @param id Die ID eines Tickets
     * @return List<Note> aus den zu dem Ticket gehörenden Notizen
     */
    public List<Note> getForTicketId(int id) {
        List<Note> notes = new ArrayList<>();
        // Liste von Notizen als Strings durchlaufen
        for (int i = 0; i < loaded.size(); i++) {
            // Den String am Semikolon aufteilen
            String[] values = loaded.get(i).split(";");
            // die ID des Tickets auslesen
            int ticketId = Integer.parseInt(values[1]);
            // überprüfen, ob die ID mit der gewünschten übereinstimmt
            if (ticketId == id) {
                // die notiz aus den weiteren Daten erstellen
                Employee employee = (Employee) userManager.get(Integer.parseInt(values[2]));
                Long datetime = Long.parseLong(values[5]);
                Date creationDate = new Date(datetime);
                Note note = new Note(values[3], values[4], employee, creationDate);
                // die notiz der Liste hinzufügen
                notes.add(note);
            }
        }
        return notes;
    }
}
