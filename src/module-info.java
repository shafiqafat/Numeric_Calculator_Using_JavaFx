module com.mycompany.calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.calculator to javafx.fxml;
    exports com.mycompany.calculator;
}
