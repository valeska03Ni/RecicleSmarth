package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IniciarActivity extends AppCompatActivity {

    private Button btnIngresarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar);

        referencias();
        eventoBotones();
    }

    private void eventoBotones(){

        //Enviar de Iniciar sesión a Lista
        btnIngresarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IniciarActivity.this, ItemActivity.class));
            }
        });
    }

    private void referencias(){
        btnIngresarSesion = findViewById(R.id.btnIngresarSesion);
    }
}