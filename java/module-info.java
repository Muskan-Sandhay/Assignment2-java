module com.example.assignment2fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.assignment2fx to javafx.fxml;
    exports com.example.assignment2fx;
}