package com.example.amadeus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML
    private Button addButton;

    @FXML
    private Label greetUserLabel;

    @FXML
    private Button notesButton;

    @FXML
    private Button notificationsButton;

    @FXML
    private Button personalButton;

    @FXML
    private Button workButton;

    @FXML
    void addButtonsPressed(ActionEvent event) {

    }

    @FXML
    void notesButtonPressed(ActionEvent event) {

    }

    @FXML
    void notificationsButtonsPressed(ActionEvent event) {

    }

    @FXML
    void personalButtonPressed(ActionEvent event) {

    }

    @FXML
    void workButtonPressed(ActionEvent event) {

    }
    public void greetUser(String username)
    {
        greetUserLabel.setText("Hello "+username);
    }
}
