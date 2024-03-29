package de.ddi.ticketsystem.logic;

import de.ddi.ticketsystem.data.Access;
import de.ddi.ticketsystem.data.DataException;

/**
 * Ist für die Verwaltung von Daten zuständig. Über die Verbindung Access können die Daten gespeichert und geladen werden.
 * Der Manager muss diese dann in Objekte umwandeln.
 */
public abstract class Manager {
    /**
     * Verbindung zum Speichern und Laden von Daten
     */
    protected Access access;

    protected Manager(Access access) {
        this.access = access;
    }

    /**
     * Speichert die Daten
     */
    public abstract void save() throws DataException;

    /**
     * Lädt die Daten
     */
    public abstract void load() throws DataException;
}
