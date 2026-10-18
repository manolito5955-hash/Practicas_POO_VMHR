package com.myvmhr.operacionesnumero;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Label lblCifras, lblPares, lblImpares;
    @FXML
    private Label lblMayor, lblMenor, lblDivisores;

    @FXML
    private void calcular() {

        int numero = Integer.parseInt(txtNumero.getText());
        int auxiliar = Math.abs(numero);

        int cifras = 0;
        int pares = 0;
        int impares = 0;
        int mayor = 0;
        int menor = 9;

        if (auxiliar == 0) {
            cifras = 1;
            menor = 0;
        }

        while (auxiliar > 0) {

            int digito = auxiliar % 10;

            cifras++;

            if (digito % 2 == 0) {
                pares = pares + digito;
            } else {
                impares = impares + digito;
            }

            if (digito > mayor) {
                mayor = digito;
            }

            if (digito < menor) {
                menor = digito;
            }

            auxiliar = auxiliar / 10;
        }

        String divisores = "";

        int valor = Math.abs(numero);

        for (int i = 1; i <= valor; i++) {

            if (valor % i == 0) {
                divisores = divisores + i + " ";
            }
        }

        lblCifras.setText("" + cifras);
        lblPares.setText("" + pares);
        lblImpares.setText("" + impares);
        lblMayor.setText("" + mayor);
        lblMenor.setText("" + menor);
        lblDivisores.setText(divisores);
    }
}
