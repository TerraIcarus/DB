package com.example.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public void Connect(String username,String password,String jdbcURL)
    {
        try {
            java.sql.Connection connection = DriverManager.getConnection(username, password, jdbcURL);
            System.out.println("Connected!");
            connection.close();
        } catch (SQLException e){
            System.out.println("Connection error");
            e.printStackTrace();
        }
    }

}
