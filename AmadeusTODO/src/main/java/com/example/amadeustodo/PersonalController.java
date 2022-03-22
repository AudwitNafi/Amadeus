package com.example.amadeustodo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class PersonalController {

    @FXML
    private Button addButton;

    @FXML
    private Button closeButton;

    @FXML
    private Label helloLabel;

    @FXML
    private Button taskButton;

    @FXML
    private Button notesButton;

    @FXML
    private Button notificationsButton;

    @FXML
    private ListView<?> personalTaskList;

    @FXML
    void addButtonsPressed(ActionEvent event) {

    }

    @FXML
    void closeButtonPressed(ActionEvent event) {
        closeButton.setOnAction((ActionEvent e)->{
            Platform.exit();
        });
    }

    @FXML
    void taskButtonPressed(ActionEvent event)
    {

    };

    @FXML
    void notesButtonPressed(ActionEvent event) {

    }

    @FXML
    void notificationsButtonsPressed(ActionEvent event) {

    }
}