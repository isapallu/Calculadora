package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

    }
    public void Soma(View v){
        double v1 = Double.parseDouble(n1.getText().toString());
        double v2 = Double.parseDouble(n2.getText().toString());

        double sm = v1 + v2;


    }

}