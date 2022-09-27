module com.example.lab31testprogramr {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires org.testng;


    opens com.example.lab31testprogramr to javafx.fxml;
    exports com.example.lab31testprogramr;
}