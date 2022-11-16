package com.example.db;

import javafx.css.PseudoClass;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField field1;

   /* @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    PseudoClass errorClass = PseudoClass.getPseudoClass("error");

    @FXML
    protected void loginClick() {

    }
    @FXML
    protected void regClick() {

    }
}
