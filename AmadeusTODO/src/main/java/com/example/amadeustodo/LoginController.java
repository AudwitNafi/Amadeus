package com.example.amadeustodo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button closeButton;

    @FXML
    private Button loginButton;

    @FXML
    private Label loginErrorMessage;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField userNameTextField;

    @FXML
    void closeButtonPressed(ActionEvent event) {
        closeButton.setOnAction((ActionEvent e)->{
            System.exit(0);
        });
    }

    @FXML
    void loginButtonPressed(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage)loginButton.getScene().getWindow();
        stage.setScene(new Scene(root));
        DashboardController dashboardController = (DashboardController) fxmlLoader.getController();
        dashboardController.setTextHelloLabel(userNameTextField.getText());
    }

    @FXML
    void signUpButtonPressed(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Stage stage = (Stage)signUpButton.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
