package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1EditText;
    private EditText num2EditText;
    private Spinner operacionSpinner;
    private Button calcularButton;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        operacionSpinner = findViewById(R.id.operacionSpinner);
        calcularButton = findViewById(R.id.calcularButton);
        resultadoTextView = findViewById(R.id.resultadoTextView);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());
                String operacion = operacionSpinner.getSelectedItem().toString();
                double resultado = 0;

                switch (operacion) {
                    case "Suma":
                        resultado = num1 + num2;
                        break;
                    case "Resta":
                        resultado = num1 - num2;
                        break;
                    case "Multiplicación":
                        resultado = num1 * num2;
                        break;
                    case "División":
                        resultado = num1 / num2;
                        break;
                }

                resultadoTextView.setText("Resultado: " + resultado);
            }
        });
    }
}
