package com.example.amadeus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField loginPassTextField;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField userNameTextField;

    @FXML
    void loginButtonPressed(ActionEvent event) {
        try{
            scene = new Scene(root);
            String username = userNameTextField.getText();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
            root = loader.load();
            DashboardController dc = new DashboardController();
            dc.greetUser(username);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.show();
            stage.setScene(scene);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void signUpButtonPressed(ActionEvent event) {

    }

}
