module com.example.pruebas_tema_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebas_tema_3 to javafx.fxml;
    exports com.example.pruebas_tema_3;
}