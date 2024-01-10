module com.example.vanocniprojekt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.vanocniprojekt to javafx.fxml;
    exports com.example.vanocniprojekt;
}