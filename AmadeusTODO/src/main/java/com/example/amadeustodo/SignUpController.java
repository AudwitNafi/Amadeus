package com.example.amadeustodo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {
    @FXML
    private Button closeButton;

    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField userNameTextField;

    @FXML
    void closeButtonPressed(ActionEvent event) {
        closeButton.setOnAction((ActionEvent e)->{
            Platform.exit();
        });
    }

    @FXML
    void signUpButtonPressed(ActionEvent event) {

    }
}
