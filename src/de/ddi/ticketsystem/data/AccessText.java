package de.ddi.ticketsystem.data;

import util.List;

import java.io.*;

public abstract class AccessText implements Access {
    protected String pathToFile;
    protected List<String> lines;

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

    @Override
    public void save(List<String> data) throws IOException {
        FileWriter fw = new FileWriter(pathToFile);
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i = 0; i < this.lines.size(); i++) {
            String line = this.lines.get(i);
            bw.write(line);
            bw.newLine();
        }

        bw.close();
    }
}
