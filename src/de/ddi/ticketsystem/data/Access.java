package de.ddi.ticketsystem.data;

import java.util.List;

/**
 * Interface, welches die Schnittstelle zur Datenschicht bereitstellt
 */
public interface Access {
    /**
     * Laden der Daten als eine Liste von Strings. Wenn das Laden nicht möglich ist, wird eine Exception geworfen.
     * @return List von Strings
     * @throws IOException
     */
    List<String> load() throws DataException;

    /**
     * Speichern einer Liste von Strings. Wenn das Speichern nicht möglich ist, wird eine Exception geworfen.
     * @param data Liste der zu speichernden Daten
     * @throws IOException
     */
    void save(List<String> data) throws DataException;
}
