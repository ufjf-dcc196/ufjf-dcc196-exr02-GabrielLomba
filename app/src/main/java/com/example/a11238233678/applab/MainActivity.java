package com.example.a11238233678.applab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etNum1 = (EditText) findViewById(R.id.et_numero1);
        final EditText etNum2 = (EditText) findViewById(R.id.et_numero2);
        final TextView tvResultado = (TextView) findViewById(R.id.tv_resultado);

        final Button btnCalcular = (Button) findViewById(R.id.btn_somar);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(etNum1.getText().toString());
                int numero2 = Integer.parseInt(etNum2.getText().toString());

                tvResultado.setText(String.valueOf(numero1 + numero2));
            }
        });

        final Button btnSubtrair = (Button) findViewById(R.id.btn_subtrair);
        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(etNum1.getText().toString());
                int numero2 = Integer.parseInt(etNum2.getText().toString());

                tvResultado.setText(String.valueOf(numero1 - numero2));
            }
        });

        final Button btnMultiplicar = (Button) findViewById(R.id.btn_multiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(etNum1.getText().toString());
                int numero2 = Integer.parseInt(etNum2.getText().toString());

                tvResultado.setText(String.valueOf(numero1 * numero2));
            }
        });

        final Button btnDividir = (Button) findViewById(R.id.btn_dividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(etNum1.getText().toString());
                int numero2 = Integer.parseInt(etNum2.getText().toString());

                if(numero2 == 0) tvResultado.setText(R.string.divisao_zero);
                else tvResultado.setText(String.valueOf(numero1 / numero2));
            }
        });
    }
}
