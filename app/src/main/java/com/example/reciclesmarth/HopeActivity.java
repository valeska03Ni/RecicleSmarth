package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HopeActivity extends AppCompatActivity {
    private Button btnLlamarHope, btnWebHope, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hope);

        referencias();
        eventosBotones();
    }

    private void eventosBotones() {
        btnLlamarHope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marcar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+56933963976 "));
                startActivity(marcar);
            }
        });

        btnWebHope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hopechile.cl/"));
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
        btnLlamarHope = findViewById(R.id.btnLlamarHope);
        btnWebHope = findViewById(R.id.btnWebHope);
        btnRegresar = findViewById(R.id.btnRegresar);
    }
}