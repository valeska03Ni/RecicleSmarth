package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroActivity extends AppCompatActivity {

    private Button btnRegistrar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        referencias();
        eventoBotones();
    }




    private void eventoBotones(){

        //Enviar de registro a iniciar sesión
        btnRegistrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistroActivity.this, IniciarActivity.class));
            }
        });


    }



    private void referencias(){
        btnRegistrar1 = findViewById(R.id.btnRegistrar1);
    }
}