module com.pedro.view {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pedro.view to javafx.fxml;
    exports com.pedro.view;
}