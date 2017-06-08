package de.ddi.ticketsystem.data;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AccessSQLite implements Access {
    private static Connection connection;
    private static final String DB_PATH = "res/database.db";

    protected void connect() throws DataException {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection("jdbc:sqlite:" + DB_PATH);
                connection.setAutoCommit(false);
            }
        } catch (SQLException e) {
            throw new DataException("Could not connect with Database.");
        }
        try {
            this.initTable();
        } catch (SQLException e) {
            throw new DataException("Could not initilize Database Tables.");
        }
    }

    protected abstract void initTable() throws SQLException;

    protected Statement createStatement() throws SQLException {
        return connection.createStatement();
    }

    protected void disconnect() throws DataException {
        try {
            if (!connection.isClosed() && connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new DataException("Could not close Database connection");
        }
    }
}
