package nl.guisilver.db;

import java.sql.*;

public class DbConnection {

    static final String DB_URL = "jdbc:mysql://localhost:3306/teste";
    static final String USER = "root";
    static final String PASS = "fodase01";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}