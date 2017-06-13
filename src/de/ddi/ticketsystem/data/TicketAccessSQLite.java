package de.ddi.ticketsystem.data;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TicketAccessSQLite extends AccessSQLite {

    private static final String deleteAllRequestTicketsSQL = "DELETE FROM request_tickets;";

    private static final String selectAllRequestTicketsSQL = "SELECT * FROM request_tickets;";

    private static final String insertRequestTicketSQL = "INSERT INTO request_tickets VALUES ("
        + "%s, %s, %s, %s, %s, %s, %s, %s, %s);";

    private static final String deleteAllOrderTicketsSQL = "DELETE FROM order_tickets;";

    private static final String selectAllOrderTicketsSQL = "SELECT * FROM order_tickets;";

    private static final String insertOrderTicketSQL = "INSERT INTO order_tickets VALUES ("
        + "%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s);";

    private static final String deleteAllMalfunctionTicketsSQL = "DELETE FROM malfunction_tickets;";

    private static final String selectAllMalfunctionTicketsSQL = "SELECT * FROM malfunction_tickets;";

    private static final String insertMalfunctionTicketSQL = "INSERT INTO malfunction_tickets VALUES ("
        + "%s, %s, %s, %s, %s, %s, %s, %s);";

    @Override
    protected void initTable() throws SQLException {
        String malfunctionSql = "CREATE TABLE IF NOT EXISTS malfunction_tickets ("
            + " id integer PRIMARY KEY, "
            + " employee_id integer, "
            + " customer_id integer, "
            + " description text, "
            + " status varchar(32), "
            + " priority integer, "
            + " creation_date integer, "
            + " device_service varchar(64)"
            + ");";
        createStatement().execute(malfunctionSql);

        String orderSql = "CREATE TABLE IF NOT EXISTS order_tickets ("
            + " id integer PRIMARY KEY, "
            + " employee_id integer, "
            + " customer_id integer, "
            + " description text, "
            + " status varchar(32), "
            + " priority integer, "
            + " creation_date integer, "
            + " vendor varchar(64), "
            + " article varchar(64), "
            + " address text, "
            + " quantity integer"
            + ");";
        createStatement().execute(orderSql);

        String requestSql = "CREATE TABLE IF NOT EXISTS request_tickets ("
            + " id integer PRIMARY KEY, "
            + " employee_id integer, "
            + " customer_id integer, "
            + " description text, "
            + " status varchar(32), "
            + " priority integer, "
            + " creation_date integer, "
            + " data integer, "
            + " service varchar(64) "
            + ");";
        createStatement().execute(requestSql);
    }

    @Override
    public List<String> load() throws DataException {
        connect();
        ArrayList<String> data = new ArrayList<>();
        try {
            ResultSet malfunctionResults = createStatement().executeQuery(selectAllMalfunctionTicketsSQL);
            while(malfunctionResults.next()) {
                int id = malfunctionResults.getInt("id");
                int employeeId = malfunctionResults.getInt("employee_id");
                int customerId = malfunctionResults.getInt("customer_id");
                String description = malfunctionResults.getString("description");
                String status = malfunctionResults.getString("status");
                int priority = malfunctionResults.getInt("priority");
                int creationDate = malfunctionResults.getInt("creation_date");
                String deviceService = malfunctionResults.getString("device_service");
                data.add(id + ";MALFUNCTION;" + employeeId + ";" + customerId + ";"
                    + description + ";" + status + ";" + priority + ";" + creationDate + ";" + deviceService);
            }

            ResultSet orderResults = createStatement().executeQuery(selectAllOrderTicketsSQL);
            while(orderResults.next()) {
                int id = orderResults.getInt("id");
                int employeeId = orderResults.getInt("employee_id");
                int customerId = orderResults.getInt("customer_id");
                String description = orderResults.getString("description");
                String status = orderResults.getString("status");
                int priority = orderResults.getInt("priority");
                int creationDate = orderResults.getInt("creation_date");
                String vendor = orderResults.getString("vendor");
                String article = orderResults.getString("article");
                data.add(id + ";ORDER;" + employeeId + ";" + customerId + ";"
                    + description + ";" + status + ";" + priority + ";" + creationDate + ";"
                    + vendor + ";" + article );
            }
        } catch (SQLException e) {
            throw new DataException("Could not load tickets from database.");
        }
        disconnect();
        return new ArrayList<>();
    }

    private void saveTicket(String ticket) throws SQLException {
        String[] values = ticket.split(";");
        if (values[1].equals("MALFUNCTION")) {
            String sql = String.format(insertMalfunctionTicketSQL, values[0], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9]);
            createStatement().execute(sql);
        } else if (values[1].equals("REQUEST")) {
            String sql = String.format(insertRequestTicketSQL, values[0], values[2], values[3], values[4], values[5], values[6], values[7], values[8]);
            createStatement().execute(sql);
        } else if (values[1].equals("ORDER")) {
            String sql = String.format(insertOrderTicketSQL, values[0], values[2], values[3], values[4], values[5], values[6], values[7], values[8], values[9]);
            createStatement().execute(sql);
        }
    }

    @Override
    public void save(List<String> tickets) throws DataException {
        connect();
        try {
            createStatement().execute(deleteAllRequestTicketsSQL);
            createStatement().execute(deleteAllOrderTicketsSQL);
            createStatement().execute(deleteAllMalfunctionTicketsSQL);
            for(String ticket : tickets) {
                saveTicket(ticket);
            }
        } catch (SQLException e) {
            throw new DataException("Tickets could not be saved.");
        }
        disconnect();
    }
}
