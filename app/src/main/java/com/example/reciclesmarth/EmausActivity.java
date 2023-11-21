package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmausActivity extends AppCompatActivity {
    private Button btnLlamarEmaus, btnWebEmaus, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emaus);

        referencias();
        eventosBotones();
    }

    private void eventosBotones() {
        btnLlamarEmaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marcar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:226433643 "));
                startActivity(marcar);
            }
        });

        btnWebEmaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://traperosdeemaus-sanluis.cl/"));
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

        btnLlamarEmaus = findViewById(R.id.btnLlamarEmaus);
        btnWebEmaus = findViewById(R.id.btnWebEmaus);
        btnRegresar = findViewById(R.id.btnRegresar);
    }
}