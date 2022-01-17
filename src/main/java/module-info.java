module com.example.hadibismillah {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hadibismillah to javafx.fxml;
    exports com.example.hadibismillah;
}