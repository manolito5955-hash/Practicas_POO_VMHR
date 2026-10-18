module com.myvmhr.desglosedineros {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.myvmhr.desglosedineros to javafx.fxml;
    exports com.myvmhr.desglosedineros;
}
