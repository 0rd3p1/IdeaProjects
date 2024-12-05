module com.example.projetointegradorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetointegradorfx to javafx.fxml;
    exports com.example.projetointegradorfx;
}