package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private String dbURL = "jdbc:mysql://localhost:3306/data";
    private String userName = "roma";
    private String password = "88888888";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbURL, userName, password);
    }
}


