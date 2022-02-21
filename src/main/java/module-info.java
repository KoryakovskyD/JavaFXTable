module com.example.javafxtable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtable to javafx.fxml;
    exports com.example.javafxtable;
}