module com.myvmhr.gastossemanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.myvmhr.gastossemanales to javafx.fxml;
    exports com.myvmhr.gastossemanales;
}
