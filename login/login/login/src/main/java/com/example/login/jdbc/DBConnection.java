package com.example.login.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL =
        "jdbc:mysql://localhost:3306/login_db?useSSL=false&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD = "ycce123";

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ MySQL JDBC Connected Successfully");
            return con;
        }
        catch (Exception e) {
            System.out.println("❌ JDBC Connection Failed");
            e.printStackTrace();
            return null;
        }
    }
}
