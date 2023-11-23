package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemActivity extends AppCompatActivity {

    private Button btnIrEmpresas, btnIrNoticia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        referencias();
        eventosBotones();
    }

    private void eventosBotones() {
        btnIrNoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noticias = new Intent(ItemActivity.this, NoticiaActivity.class);
                startActivity(noticias);
            }
        });

        btnIrEmpresas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(ItemActivity.this, ListaActivity.class);
                startActivity(l);

            }
        });
    }

    private void referencias() {
        btnIrEmpresas = findViewById(R.id.btnIrEmpresas);
        btnIrNoticia = findViewById(R.id.btnIrNoticia);
    }
}