package de.ddi.ticketsystem.logic;

import java.util.Date;

public class Note {
    /**
     * Kurzer Titel der Notiz
     */
    private String title;
    /**
     * Inhalt der Notiz
     */
    private String content;
    /**
     * Verfasser der Notiz
     */
    private Employee employee;
    /**
     * Erstellungsdatum der Notiz
     */
    private Date creationDate;

    public Note(String title, String content, Employee employee) {
        this.title = title;
        this.content = content;
        this.employee = employee;
        creationDate = new Date();
    }

    /**
     * Gibt den Titel der Notiz zurück
     * @return Titel der Notiz
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gibt den Inhalt der Notiz zurück
     * @return Inhalt der Notiz
     */
    public String getContent() {
        return content;
    }

    /**
     * Gibt den Verfasser der Notiz zurück
     * @return Verfasser der Notiz
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Gibt das Erstellungsdatum zurück
     * @return Erstellungsdatum
     */
    public Date getCreationDate() {
        return creationDate;
    }
}
