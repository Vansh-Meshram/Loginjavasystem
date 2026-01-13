package com.example.login.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {

    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM users";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("username") + " | " +
                    rs.getString("password")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
