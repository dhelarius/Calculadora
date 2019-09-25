package com.itla.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private EditText etPrimerValor;
    private EditText etSegundoValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResultado);
        etPrimerValor = findViewById(R.id.etPrimerValor);
        etSegundoValor = findViewById(R.id.etSegundoValor);
        Button btnSumar = findViewById(R.id.btnSumar);

        btnSumar.setOnClickListener(v -> {
            sumar();
        });

    }

    private void sumar(){
        if((etPrimerValor.getText().toString().isEmpty()) || (etSegundoValor.getText().toString().isEmpty()))
            return;

        Float primerValor = Float.parseFloat(etPrimerValor.getText().toString());
        Float segundoValor = Float.parseFloat(etSegundoValor.getText().toString());
        tvResult.setText(String.valueOf(primerValor + segundoValor));
    }
}
