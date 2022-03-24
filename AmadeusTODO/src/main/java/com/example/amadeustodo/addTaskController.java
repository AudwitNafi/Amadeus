package com.example.amadeustodo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class addTaskController {

    @FXML
    private ComboBox<?> Categories;

    @FXML
    private DatePicker Deadline;

    @FXML
    private ImageView Exit;

    @FXML
    private Button cancelButton;

    @FXML
    private Button okButton;

    @FXML
    private TextArea taskDescription;

    @FXML
    private TextField taskTitle;

    @FXML
    void cancelButtonPressed(ActionEvent event) {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void okButtonPressed(ActionEvent event) {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

}
