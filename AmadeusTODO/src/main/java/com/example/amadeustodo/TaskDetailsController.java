package com.example.amadeustodo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class TaskDetailsController {

    @FXML
    private Label taskDeadline;

    @FXML
    private Label taskDesc;

    @FXML
    private Label taskTitle;

    @FXML
    private Button closeButton;

    @FXML
    void deleteButtonPressed(ActionEvent event) {

    }

    @FXML
    void updateButtonPressed(ActionEvent event) {

    }

    public void setTitleText(String title)
    {
        taskTitle.setText(title);
    }

    public void setDescText(String desc)
    {
        taskDesc.setText(desc);
    }

    public void setDeadline(LocalDate deadline)
    {
        taskDeadline.setText("Deadline: " +String.valueOf(deadline));
    }

}