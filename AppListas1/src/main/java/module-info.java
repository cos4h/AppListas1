module com.example.applistas1 {
    requires javafx.controls;
    requires javafx.fxml;
  requires lombok;


  opens com.example.applistas1 to javafx.fxml;
    exports com.example.applistas1;
}