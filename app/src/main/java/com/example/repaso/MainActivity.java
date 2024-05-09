package com.example.repaso;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado1;

    private EditText input;
    @SuppressLint({"ResourceType", "CutPasteId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        // Obtener referencias de TextViews desde el layout
        textResultado1 = findViewById(R.id.textResultado1);
        input = findViewById(R.id.textCadena);
        Button btnResta = findViewById(R.id.btnResta);
        Button btnSuma = findViewById(R.id.btnSuma);
        Button btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        Button btnDivision = findViewById(R.id.btnDivision);

        // Establecer el listener para el botón de resta
        btnResta.setOnClickListener(v -> {
            ArrayList<Double> subCadenaDouble = new ArrayList<>();
            String cadenaNumeros = String.valueOf(input.getText());
            String[] subCadenaStrings = cadenaNumeros.split(",");

            for (String elemento:subCadenaStrings
                 ) {subCadenaDouble.add(Double.parseDouble(elemento));

            }
            Calculadora calculadora = new Calculadora();

            double resultado = calculadora.restar(subCadenaDouble);
            textResultado1.setText(String.valueOf(resultado));

            // Ejemplos de uso de los métodos sobrecargados de resta

        });


        // Establecer el listener para el botón de suma
        btnSuma.setOnClickListener(v -> {
            // Crear una instancia de la calculadora
            ArrayList<Double> subCadenaDouble = new ArrayList<>();
            String cadenaNumeros = String.valueOf(input.getText());
            String[] subCadenaStrings = cadenaNumeros.split(",");

            for (String elemento:subCadenaStrings
            ) {
                subCadenaDouble.add(Double.parseDouble(elemento));

            }
            Calculadora calculadora = new Calculadora();
            double resultado = calculadora.sumar(subCadenaDouble);
            textResultado1.setText(String.valueOf(resultado));




        });



        // Establecer el listener para el botón de multiplicación
        btnMultiplicacion.setOnClickListener(v -> {
            // Crear una instancia de la calculadora
            ArrayList<Double> subCadenaDouble = new ArrayList<>();
            String cadenaNumeros = String.valueOf(input.getText());
            String[] subCadenaStrings = cadenaNumeros.split(",");

            for (String elemento:subCadenaStrings
            ) {
                subCadenaDouble.add(Double.parseDouble(elemento));

            }
            Calculadora calculadora = new Calculadora();
            double resultado = calculadora.multiplicar(subCadenaDouble);
            textResultado1.setText(String.valueOf(resultado));


        });


        // Establecer el listener para el botón de división
        btnDivision.setOnClickListener(v -> {
            ArrayList<Double> subCadenaDouble = new ArrayList<>();
            String cadenaNumeros = String.valueOf(input.getText());
            String[] subCadenaStrings = cadenaNumeros.split(",");

            for (String elemento:subCadenaStrings
            ) {
                subCadenaDouble.add(Double.parseDouble(elemento));

            }
            Calculadora calculadora = new Calculadora();
            double resultado = calculadora.dividir(subCadenaDouble);
            textResultado1.setText(String.valueOf(resultado));

        });
    }
}
