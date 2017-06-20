package de.ddi.ticketsystem.data;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class NoteAccessSQLite extends AccessSQLite {

    private static final String insertNoteSQL = "INSERT INTO notes VALUES ('%s', '%s', '%s', '%s', '%s', '%s');";

    private static final String selectAllNotesSQL = "SELECT * FROM notes;";

    private static final String deleteAllNotesSQL = "DELETE FROM notes;";

    @Override
    protected void initTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS notes (" + " id integer PRIMARY KEY, " + " ticket_id integer, "
                + " employee_id integer, " + " title text, " + " content text, " + " creation_date integer" + ");";
        createStatement().execute(sql);
    }

    @Override
    public List<String> load() throws DataException {
        connect();
        ArrayList<String> data = new ArrayList<>();
        try {
            ResultSet noteResults = createStatement().executeQuery(selectAllNotesSQL);
            while (noteResults.next()) {
                int id = noteResults.getInt("id");
                int ticketId = noteResults.getInt("ticket_id");
                int employeeId = noteResults.getInt("employee_id");
                String title = noteResults.getString("title");
                String content = noteResults.getString("content");
                int creationDate = noteResults.getInt("creation_date");
                data.add(id + ";" + ticketId + ";" + employeeId + ";" + title + ";" + content + ";" + creationDate);
            }
        } catch (SQLException e) {
            throw new DataException("Could not load notes from database.");
        }
        disconnect();
        return data;
    }

    private void saveNote(String note) throws SQLException {
        String[] values = note.split(";");
        String sql = String.format(insertNoteSQL, values[0], values[1], values[2], values[3], values[4], values[5]);
        System.out.println(sql);
        createStatement().execute(sql);
    }

    @Override
    public void save(List<String> notes) throws DataException {
        connect();
        try {
            createStatement().execute(deleteAllNotesSQL);
            for (String note : notes) {
                saveNote(note);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataException("Notes could not be saved.");
        }
        disconnect();
    }
}
