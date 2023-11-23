package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListaActivity extends AppCompatActivity {
    private Button btnVerEmaus, btnVerChilenter, btnVerRecicleapp, btnVerHope, btnRegresar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        referencias();
        eventosBotones();
    }

    private void eventosBotones() {
        btnVerEmaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(ListaActivity.this, EmausActivity.class);
                startActivity(a);
            }
        });

        btnRegresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(ListaActivity.this, ItemActivity.class);
                startActivity(f);
            }
        });

        btnVerChilenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(ListaActivity.this, ChilenterActivity.class);
                startActivity(b);
            }
        });

        btnVerRecicleapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(ListaActivity.this, RecicleappActivity.class);
                startActivity(c);
            }
        });

        btnVerHope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(ListaActivity.this, HopeActivity.class);
                startActivity(d);
            }
        });
    }


    private void referencias() {
        btnVerEmaus = findViewById(R.id.btnVerEmaus);
        btnVerChilenter = findViewById(R.id.btnVerChilenter);
        btnVerRecicleapp = findViewById(R.id.btnVerRecicleapp);
        btnVerHope = findViewById(R.id.btnVerHope);
        btnRegresar2 = findViewById(R.id.btnRegresar2);
    }
}