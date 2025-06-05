module com.capacitamais.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.capacitamais.demo to javafx.fxml;
    exports com.capacitamais.demo;
}