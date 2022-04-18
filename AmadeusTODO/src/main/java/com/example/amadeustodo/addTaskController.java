package com.example.amadeustodo;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class addTaskController implements Initializable {

    @FXML
    private ChoiceBox<Category> categoriesChoicebox;

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
        int taskid = Tasks.getTaskID();
        taskid++;
        String title = taskTitle.getText();
        Category category = categoriesChoicebox.getValue();
        String desc = taskDescription.getText();
        LocalDate deadline = Deadline.getValue();
        Tasks task = new Tasks(taskid, category, title, desc, deadline);

        // TODO: 4/18/2022 ADD DATABASE CODE

        if(task.getCategory() == Category.Personal) PersonalController.tasksList.add(task);
        else WorkController.tasksList.add(task);
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

    private Category category = Category.Personal;

    public Category getCategory() {
        return category;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setCategory();
    }

    private void setCategory() {
        categoriesChoicebox.setItems( FXCollections.observableArrayList( Category.values()));
//        categoriesChoicebox.setValue(category);
    }
}
