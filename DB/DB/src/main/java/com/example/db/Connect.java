package com.example.db;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static Connection Connect(String username, String password, String jdbcURL)
    {
        try {
            java.sql.Connection connection = DriverManager.getConnection(jdbcURL, username, password) ;
            System.out.println("Connected!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection error");
            e.printStackTrace();
            return null;
        }



    }



}
