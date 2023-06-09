package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView resultadoConta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        resultadoConta = findViewById(R.id.rc);

    }
    public void Soma(View v){
        double v1 = Double.parseDouble(n1.getText().toString());
        double v2 = Double.parseDouble(n2.getText().toString());
        vazioS();
        double sm = v1 + v2;
        resultadoConta.setText(sm + "");
    }
    public void Subtracao(View v){
        double x1 = Double.parseDouble(n1.getText().toString());
        double x2 = Double.parseDouble(n2.getText().toString());

        double sub = x1 - x2;
        resultadoConta.setText(sub + "");
    }
    public void Divisao(View v){
        double f1 = Double.parseDouble(n1.getText().toString());
        double f2 = Double.parseDouble(n2.getText().toString());

        double div = f1%f2;
        resultadoConta.setText(div + "");
    }
    public void Multiplicacao(View v){
        double m1 = Double.parseDouble(n1.getText().toString());
        double m2 = Double.parseDouble(n2.getText().toString());
//
        double mult = m1*m2;
        resultadoConta.setText(mult + "");
    }
    public void vazioS(){
        try{
            double v1 = Double.parseDouble(n1.getText().toString());
            double v2 = Double.parseDouble(n2.getText().toString());
        }
        catch(Exception e){
            double v1 = 0;
            double v2 = 0;
        }
    }

}