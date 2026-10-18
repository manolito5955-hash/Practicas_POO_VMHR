module com.myvmhr.fecha {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.myvmhr.fecha to javafx.fxml;
    exports com.myvmhr.fecha;
}
