package com.example.calcapp;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button soma, sub, mult, div;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        soma = findViewById(R.id.som);
        sub = findViewById(R.id.sub);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        resultado = findViewById(R.id.result);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double numero1Digitado = Double.parseDouble(num1.getText().toString());
                Double numero2Digitado = Double.parseDouble(num2.getText().toString());

                // soma
                Double resultadoSoma = numero1Digitado + numero2Digitado;
                resultado.setText("Resultado: " + resultadoSoma);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double numero1Digitado = Double.parseDouble(num1.getText().toString());
                Double numero2Digitado = Double.parseDouble(num2.getText().toString());

                // Subtração
                Double resultadoSub = numero1Digitado - numero2Digitado;
                resultado.setText("Resultado: " + resultadoSub);

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double numero1Digitado = Double.parseDouble(num1.getText().toString());
                Double numero2Digitado = Double.parseDouble(num2.getText().toString());

                // Multiplicação
                Double resultadoMult = numero1Digitado * numero2Digitado;
                resultado.setText("Resultado: " + resultadoMult);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double numero1Digitado = Double.parseDouble(num1.getText().toString());
                Double numero2Digitado = Double.parseDouble(num2.getText().toString());

                // Divisão
                Double resultadoDiv = numero1Digitado / numero2Digitado;
                resultado.setText("Resultado: " + resultadoDiv);
            }
        });
    }
}