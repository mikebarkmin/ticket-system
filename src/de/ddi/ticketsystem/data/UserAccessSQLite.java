package de.ddi.ticketsystem.data;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserAccessSQLite extends AccessSQLite {

    private static final String insertEmployeeSQL = "INSERT INTO employees VALUES (" + "'%s', '%s', '%s', '%s', '%s');";

    private static final String deleteAllEmployeesSQL = "DELETE FROM employees;";

    private static final String selectAllEmployeesSQL = "SELECT * FROM employees;";

    private static final String insertCustomerSQL = "INSERT INTO customers VALUES (" + "'%s', '%s', '%s', '%s', '%s');";

    private static final String deleteAllCustomerSQL = "DELETE FROM customers;";

    private static final String selectAllCustomersSQL = "SELECT * FROM customers;";

    @Override
    protected void initTable() throws SQLException {
        String employeeSql = "CREATE TABLE IF NOT EXISTS employees (" + " id integer PRIMARY KEY, "
                + " first_name varchar(64), " + " last_name varchar(64), " + " email varchar(64), "
                + " department varchar(64) " + ");";
        createStatement().execute(employeeSql);

        String customerSql = "CREATE TABLE IF NOT EXISTS customers (" + " id integer PRIMARY KEY, "
                + " first_name varchar(64), " + " last_name varchar(64), " + " email varchar(64), "
                + " company varchar(64) " + ");";
        createStatement().execute(customerSql);
    }

    @Override
    public List<String> load() throws DataException {
        connect();
        Map<Integer, String> dataMap = new HashMap<>();
        try {
            ResultSet customerResults = createStatement().executeQuery(selectAllCustomersSQL);
            while (customerResults.next()) {
                int id = customerResults.getInt("id");
                String firstName = customerResults.getString("first_name");
                String lastName = customerResults.getString("last_name");
                String email = customerResults.getString("email");
                String company = customerResults.getString("company");
                dataMap.put(id, id + ";CUSTOMER;" + firstName + ";" + lastName + ";" + email + ";" + company);
            }
            ResultSet employeeResults = createStatement().executeQuery(selectAllEmployeesSQL);
            while (employeeResults.next()) {
                int id = employeeResults.getInt("id");
                String firstName = employeeResults.getString("first_name");
                String lastName = employeeResults.getString("last_name");
                String email = employeeResults.getString("email");
                String department = employeeResults.getString("department");
                dataMap.put(id, id + ";EMPLOYEE;" + firstName + ";" + lastName + ";" + email + ";" + department);
            }
        } catch (SQLException e) {
            throw new DataException("Could not load users from database.");
        }
        disconnect();
        List<String> data = dataMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .map(Map.Entry::getValue).collect(Collectors.toList());
        return data;
    }

    private void saveUser(String user) throws SQLException {
        String[] values = user.split(";");
        if (values[1].equals("EMPLOYEE")) {
            String insertSQL = String.format(insertEmployeeSQL, values[0], values[2], values[3], values[4], values[5]);
            createStatement().execute(insertSQL);
        } else if (values[1].equals("CUSTOMER")) {
            String insertSQL = String.format(insertCustomerSQL, values[0], values[2], values[3], values[4], values[5]);
            createStatement().execute(insertSQL);
        }
    }

    @Override
    public void save(List<String> users) throws DataException {
        connect();
        try {
            createStatement().execute(deleteAllEmployeesSQL);
            createStatement().execute(deleteAllCustomerSQL);
            for (String user : users) {
                saveUser(user);
            }
        } catch (SQLException e) {
            throw new DataException("Users could not be saved.");
        }
        disconnect();
    }
}
