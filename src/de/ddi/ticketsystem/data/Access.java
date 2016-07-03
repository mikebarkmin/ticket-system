package de.ddi.ticketsystem.data;

import util.List;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Access {
    List<String> load() throws IOException;
    void save(List<String> data) throws IOException;
}
