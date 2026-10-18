module com.myvmhr.operacionesnumero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.myvmhr.operacionesnumero to javafx.fxml;
    exports com.myvmhr.operacionesnumero;
}
