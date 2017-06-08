package de.ddi.ticketsystem.data;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserAccessSQLite extends AccessSQLite {

    private static final String insertEmployeeSQL = "INSERT INTO employees VALUES ("
        + "%s, %s, %s, %s, %s);";

    private static final String deleteEmployeeByIdSQL = "DELETE FROM employees WHERE id=%s;";

    private static final String insertCustomerSQL = "INSERT INTO customers VALUES ("
        + "%s, %s, %s, %s, %s);";

    private static final String deleteCustomerByIdSQL = "DELETE FROM customers WHERE id=%s;";

    @Override
    protected void initTable() throws SQLException {
        String employeeSql = "CREATE TABLE IF NOT EXISTS employees ("
            + " id integer PRIMARY KEY, "
            + " first_name varchar(64), "
            + " last_name varchar(64), "
            + " email varchar(64), "
            + " department varchar(64) "
            + ");";
        createStatement().execute(employeeSql);

        String customerSql = "CREATE TABLE IF NOT EXISTS customers ("
            + " id integer PRIMARY KEY, "
            + " first_name varchar(64), "
            + " last_name varchar(64), "
            + " email varchar(64), "
            + " company varchar(64) "
            + ");";
        createStatement().execute(customerSql);
    }

    @Override
    public List<String> load() throws DataException {
        connect();
        disconnect();
        return new ArrayList<>();
    }

    private void saveUser(String user) throws DataException {
        try {
            String[] values = user.split(";");
            if (values[1].equals("EMPLOYEE")) {
                String deleteSQL = String.format(deleteEmployeeByIdSQL, values[0]);
                createStatement().execute(deleteSQL);
                String insertSQL = String.format(insertEmployeeSQL, values[0], values[2], values[3], values[4], values[5]);
                createStatement().execute(insertSQL);
            } else if (values[1].equals("CUSTOMER")) {
                String deleteSQL = String.format(deleteCustomerByIdSQL, values[0]);
                createStatement().execute(deleteSQL);
                String insertSQL = String.format(insertCustomerSQL, values[0], values[2], values[3], values[4], values[5]);
                createStatement().execute(insertSQL);
            }
        } catch (SQLException e) {
            throw new DataException("User could not be saved.");
        }
    }

    @Override
    public void save(List<String> users) throws DataException {
        connect();
        for(String user : users) {
            saveUser(user);
        }
        disconnect();
    }
}
