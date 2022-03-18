module com.example.amadeus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.amadeus to javafx.fxml;
    exports com.example.amadeus;
}