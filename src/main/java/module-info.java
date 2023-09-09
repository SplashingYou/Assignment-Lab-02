module com.example.csc311_fxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc311_fxml to javafx.fxml;
    exports com.example.csc311_fxml;
}