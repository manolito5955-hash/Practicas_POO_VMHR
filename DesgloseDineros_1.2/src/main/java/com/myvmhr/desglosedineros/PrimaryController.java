package com.myvmhr.desglosedineros;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtCantidad;

    @FXML
    private Label lbl500, lbl200, lbl100, lbl50, lbl20;
    @FXML
    private Label lbl10, lbl5, lbl2, lbl1;

    @FXML
    private void calcular() {

        int cantidad = Integer.parseInt(txtCantidad.getText());

        int b500 = cantidad / 500;
        cantidad = cantidad % 500;

        int b200 = cantidad / 200;
        cantidad = cantidad % 200;

        int b100 = cantidad / 100;
        cantidad = cantidad % 100;

        int b50 = cantidad / 50;
        cantidad = cantidad % 50;

        int b20 = cantidad / 20;
        cantidad = cantidad % 20;

        int m10 = cantidad / 10;
        cantidad = cantidad % 10;

        int m5 = cantidad / 5;
        cantidad = cantidad % 5;

        int m2 = cantidad / 2;
        cantidad = cantidad % 2;

        int m1 = cantidad;

        lbl500.setText("" + b500);
        lbl200.setText("" + b200);
        lbl100.setText("" + b100);
        lbl50.setText("" + b50);
        lbl20.setText("" + b20);

        lbl10.setText("" + m10);
        lbl5.setText("" + m5);
        lbl2.setText("" + m2);
        lbl1.setText("" + m1);
    }
}
