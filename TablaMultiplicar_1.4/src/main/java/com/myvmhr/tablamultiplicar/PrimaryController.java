package com.myvmhr.tablamultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcular() {

        int numero = Integer.parseInt(txtNumero.getText());

        String tabla = "";

        for (int i = 1; i <= 10; i++) {

            int resultado = numero * i;

            tabla = tabla + numero + " x " + i
                    + " = " + resultado + "\n";
        }

        lblResultado.setText(tabla);
    }
}