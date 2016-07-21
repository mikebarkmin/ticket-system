package de.ddi.ticketsystem.data;

import util.List;

import java.io.*;

public abstract class AccessText implements Access {
    protected String pathToFile;
    protected List<String> lines;

    /**
     * Lädt eine Textdatei Zeilenweise in eine Liste
     * @return Die Liste mit den Zeilen aus einer Textdatei
     * @throws IOException
     */
    @Override
    public List<String> load() throws IOException {
        List<String> lines = new List<>();

        FileReader fr = new FileReader(pathToFile);
        BufferedReader br = new BufferedReader(fr);

        String currentLine;

        while((currentLine = br.readLine()) != null) {
            lines.add(currentLine);
        }

        br.close();

        return lines;
    }

    /**
     * Speichert eine Liste aus Strings zeilenweise in eine Textdatei.
     * @param data List<String>, die zeilenweise gespeichert werden soll
     * @throws IOException
     */
    @Override
    public void save(List<String> data) throws IOException {
        FileWriter fw = new FileWriter(pathToFile);
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i = 0; i < data.size(); i++) {
            String line = data.get(i);
            bw.write(line);
            bw.newLine();
        }

        bw.close();
    }
}
