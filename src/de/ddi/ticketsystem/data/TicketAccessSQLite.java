package de.ddi.ticketsystem.data;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TicketAccessSQLite extends AccessSQLite {

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
        disconnect();
        return new ArrayList<>();
    }

    @Override
    public void save(List<String> data) throws DataException {
    }
}
