
package com.myvmhr.fecha;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcularEdad() {

        String fecha = txtFecha.getText();

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate nacimiento =
                LocalDate.parse(fecha, formato);

        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(nacimiento, hoy);

        int anios = edad.getYears();
        int meses = edad.getMonths();

        lblResultado.setText("Tiene " + anios
                + " años con " + meses + " meses");
    }

    @FXML
    private void limpiar() {

        txtFecha.clear();
        lblResultado.setText("");

    }
}
