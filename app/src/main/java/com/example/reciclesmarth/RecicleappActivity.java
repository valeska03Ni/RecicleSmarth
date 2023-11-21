package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class RecicleappActivity extends AppCompatActivity {

    private Button btnLlamarReciclapp, btnWebReciclapp, btnRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicleapp);

        referencias();
        evetosBotones();
    }

    private void evetosBotones() {

        btnLlamarReciclapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marcar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+56966543689"));
                startActivity(marcar);
            }
        });

        btnWebReciclapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://somosreciclapp.com/"));
                startActivity(web);
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void referencias() {
        btnLlamarReciclapp = findViewById(R.id.btnLlamarReciclapp);
        btnWebReciclapp = findViewById(R.id.btnWebRecicleapp);
        btnRegresar = findViewById(R.id.btnRegresar);
    }
}