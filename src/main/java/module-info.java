module com.example.employeeattendancesystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;
    requires org.apache.poi.ooxml;


    opens com.example.employeeattendancesystem to javafx.fxml;
    exports com.example.employeeattendancesystem;
    exports com.example.employeeattendancesystem.Controllers;
    opens com.example.employeeattendancesystem.Controllers to javafx.fxml;
    exports com.example.employeeattendancesystem.Utils;
    opens com.example.employeeattendancesystem.Utils to javafx.fxml;
}