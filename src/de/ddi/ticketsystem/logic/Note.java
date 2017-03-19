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

    /**
     * Erstellt ein Objekt vom Typ Note mit einem Titel, der Notiz selbst und einem Angestellten, der die Notiz
     * erstellt hat.
     * @param title Titel der Notiz
     * @param content Die Notiz selbst
     * @param employee Der Angestellte, der die Notiz erstellt hat
     */
    public Note(String title, String content, Employee employee) {
        this.title = title;
        this.content = content;
        this.employee = employee;
        creationDate = new Date();
    }

    /**
     * Erstellt ein Objekt vom Typ Note mit einem Titel, der Notiz selbst, einem Angestellten, der die Notiz
     * erstellt hat und einem bestimmten Erstellungsdatum.
     * @param title Titel der Notiz
     * @param content Die Notiz selbst
     * @param employee Der Angestellte, der die Notiz erstellt hat
     * @param creationDate Zeitpunkt, zu dem die Notiz erstellt wurde
     */
    public Note(String title, String content, Employee employee, Date creationDate) {
        this(title, content, employee);
        this.creationDate = creationDate;
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

    /**
     * Gibt die Notiz als ";"-getrennte Zeichenfolge in der Reihenfolge Titel;Notiz;Erstellungsdatum; zurück.
     * @return Ein ";"-getrennter String mit den Informationen der Notiz
     */
    public String saveToText() {
        String text = title + ";" + content + ";" + creationDate.getTime() + ";";
        return text;
    }
}
