package com.example.amadeustodo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    @FXML
    private Button addButton;

    @FXML
    private Button closeButton;

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
    void closeButtonPressed(ActionEvent event) {
        closeButton.setOnAction((ActionEvent e)->{
            Platform.exit();
        });
    }

    @FXML
    void notesButtonPressed(ActionEvent event) {

    }

    @FXML
    void notificationsButtonsPressed(ActionEvent event) {

    }

    @FXML
    void personalButtonPressed(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Personal.fxml"));
        Stage stage = (Stage)personalButton.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void workButtonPressed(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Work.fxml"));
        Stage stage = (Stage)workButton.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
