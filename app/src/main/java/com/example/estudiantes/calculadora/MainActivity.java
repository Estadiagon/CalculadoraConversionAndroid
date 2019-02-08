package com.example.estudiantes.calculadora;

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
    }
    public void suma(View vista){

        Button botonsuma = (Button) findViewById(R.id.suma);
        Button botonresta = (Button) findViewById(R.id.resta);
        Button botonconversion = (Button) findViewById(R.id.conversion);
        TextView textoresultado = (TextView) findViewById(R.id.resultado);
        EditText operador1 = (EditText) findViewById(R.id.operador1);
        EditText operador2= (EditText) findViewById(R.id.operador2);
        double numero1 =Double.parseDouble(String.valueOf(operador1.getText()));
        double numero2 =Double.parseDouble(String.valueOf(operador2.getText()));

        double resultado=numero1+numero2;

        textoresultado.setText("el resultado de la suma fue "+resultado);
    }

    public void resta(View vista){

        Button botonsuma = (Button) findViewById(R.id.suma);
        Button botonresta = (Button) findViewById(R.id.resta);
        Button botonconversion = (Button) findViewById(R.id.conversion);
        TextView textoresultado = (TextView) findViewById(R.id.resultado);
        EditText operador1 = (EditText) findViewById(R.id.operador1);
        EditText operador2= (EditText) findViewById(R.id.operador2);
        double numero1 =Double.parseDouble(String.valueOf(operador1.getText()));
        double numero2 =Double.parseDouble(String.valueOf(operador2.getText()));

        double resultado=numero1-numero2;

        textoresultado.setText("el resultado de la resta fue "+resultado);
    }

    public void conversion(View vista){

        Button botonsuma = (Button) findViewById(R.id.suma);
        Button botonresta = (Button) findViewById(R.id.resta);
        Button botonconversion = (Button) findViewById(R.id.conversion);
        TextView textoresultado = (TextView) findViewById(R.id.resultado);
        EditText operador1 = (EditText) findViewById(R.id.operador1);
        EditText operador2= (EditText) findViewById(R.id.operador2);
        double numero1 =Double.parseDouble(String.valueOf(operador1.getText()));
        double resultado=((numero1*1.8)+32);

        textoresultado.setText("el resultado de la conversion fue "+resultado);
    }



}
