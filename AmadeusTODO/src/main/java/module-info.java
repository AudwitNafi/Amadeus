module com.example.amadeustodo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.amadeustodo to javafx.fxml;
    exports com.example.amadeustodo;
}