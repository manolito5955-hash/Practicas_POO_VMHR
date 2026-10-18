module com.myvmhr.tablamultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.myvmhr.tablamultiplicar to javafx.fxml;
    exports com.myvmhr.tablamultiplicar;
}
