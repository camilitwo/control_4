package com.example.control_4_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.control_4_imc.dto.ImcDTO;

public class MainActivity extends AppCompatActivity {

    EditText _peso, _estatura;
    Button calcular;
    TextView resultado;

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se obtiene relación con los objetos EditText, botón Calcular
        _peso= (EditText)findViewById(R.id.peso);
        _estatura= (EditText)findViewById(R.id.estatura);
        calcular = (Button)findViewById(R.id.calcular);

        // Se activa escucha y se crea evento OnClick
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(new ImcDTO(Double.parseDouble(_peso.getText().toString()),
                        Double.parseDouble(_estatura.getText().toString()))
                        .calcularImc());
            }
        });
        resultado = (TextView)findViewById(R.id.resultado);
    }
}