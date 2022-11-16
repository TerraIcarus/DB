package com.example.db;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("бд");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String username=scanner.nextLine();
        System.out.println("Enter password");
        String password=scanner.nextLine();

        Connect connect= new Connect();
        connect.Connect(username,password, "jdbc:postgresql://46.229.214.241:5432/MazuninaT");


        launch();
    }
}