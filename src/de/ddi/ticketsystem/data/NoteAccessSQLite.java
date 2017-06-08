package de.ddi.ticketsystem.data;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class NoteAccessSQLite extends AccessSQLite {

    @Override
    protected void initTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS notes ("
            + " id integer PRIMARY KEY, "
            + " ticket_id integer, "
            + " employee_id integer, "
            + " title text, "
            + " content text, "
            + " creation_date integer"
            + ");";
        createStatement().execute(sql);
    }
    @Override
    public List<String> load() throws IOException {
        try {
            connect();
            disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IOException("Failed to load database!");
        }
        return new ArrayList<>();
    }

    @Override
    public void save(List<String> data) throws IOException {

    }
}
