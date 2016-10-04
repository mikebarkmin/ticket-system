package de.ddi.ticketsystem.data;

import util.List;

import java.io.*;

public abstract class AccessText implements Access {
    /**
     * Pfad an dem die Datei gespeichert werden soll
     */
    protected String pathToFile;
    /**
     * Die Zeilen, die geladen wurden
     */
    protected List<String> lines;

    /**
     * Lädt eine Textdatei Zeilenweise in eine Liste
     * @return Die Liste mit den Zeilen aus einer Textdatei
     * @throws IOException wenn die Datei nicht lesbar ist
     */
    @Override
    public List<String> load() throws IOException {
        List<String> lines = new List<>();

        // die Datei am entsprechenden Pfad lesen
        FileReader fr = new FileReader(pathToFile);
        // die Datei mit einem BufferedReader lesen
        BufferedReader br = new BufferedReader(fr);

        String currentLine;

        // die Datei Zeile für Zeile lesen
        while((currentLine = br.readLine()) != null) {
            lines.add(currentLine);
        }

        // den BufferedReader und FileReader schließen
        br.close();
        fr.close();

        return lines;
    }

    /**
     * Speichert eine Liste aus Strings zeilenweise in eine Textdatei.
     * @param data List<String>, die zeilenweise gespeichert werden soll
     * @throws IOException wenn die Datei nicht schreibbar ist
     */
    @Override
    public void save(List<String> data) throws IOException {
        // die Datei zum Schreiben am Pfad öffnen
        FileWriter fw = new FileWriter(pathToFile);
        // die Datei mit einem BufferedWriter beschreiben
        BufferedWriter bw = new BufferedWriter(fw);
        // die Datei Zeile für Zeile beschreiben
        for(int i = 0; i < data.size(); i++) {
            String line = data.get(i);
            bw.write(line);
            bw.newLine();
        }

        // den BufferedReader und FileReader schließen
        bw.close();
        fw.close();
    }
}
