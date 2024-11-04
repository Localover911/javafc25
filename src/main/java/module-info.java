module com.example.javafc25 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafc25 to javafx.fxml;
    exports com.example.javafc25;
}