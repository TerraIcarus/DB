package com.example.db;

import javafx.beans.property.BooleanProperty;
import javafx.css.PseudoClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;

public class HelloController {
    @FXML
    private TextField field1;
    @FXML
    private TextField field2;
    @FXML
    private Label message;
    @FXML
    private ImageView img1;

   /* @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    //private PseudoClass error = PseudoClass.getPseudoClass("error");
    private static PseudoClass EXPLODING_PSEUDO_CLASS = PseudoClass.getPseudoClass("error");
    BooleanProperty error;

    @FXML
    protected void loginClick() throws IOException {
      String username = field1.getText();
        String password = field2.getText();

        Connection c = Connect.Connect(username,password, "jdbc:postgresql://46.229.214.241:5432/MazuninaT");
        if(c!= null){
            FXMLLoader fxmlLoader = new FXMLLoader(MainMenu.class.getResource("MainMenu.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("бд");
            stage.setScene(scene);
            stage.show();
        }
        else {
            message.setText("Неверный логин или пароль");
            message.setTextFill(Color.RED);
            //img1.pseudoClassStateChanged(PseudoClass.getPseudoClass("error"), true);
          //  error = new SimpleBooleanProperty(false);
          //  exploding.addListener(e -> pseudoClassStateChanged(EXPLODING_PSEUDO_CLASS, exploding.get()));
        }


    }
    @FXML
    protected void regClick() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Reg.class.getResource("Log2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("бд");
        stage.setScene(scene);
        stage.show();
    }

   /* public static void ToMainMenu() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Reg.class.getResource("Log2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("бд");
        stage.setScene(scene);
        stage.show();

    }*/
}
