module com.example.javafxtipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtipcalculator to javafx.fxml;
    exports com.example.javafxtipcalculator;
}