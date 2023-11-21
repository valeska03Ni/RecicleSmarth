package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChilenterActivity extends AppCompatActivity {
    private Button btnLlamarChilenter, btnWebChilenter, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chilenter);

        referencias();
        eventosBotones();
    }

    private void eventosBotones() {
        btnLlamarChilenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marcar = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:227866086"));
                startActivity(marcar);
            }
        });

        btnWebChilenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://chilenter.com/"));
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
        btnLlamarChilenter = findViewById(R.id.btnLlamarChilenter);
        btnWebChilenter = findViewById(R.id.btnWebChilenter);
        btnRegresar = findViewById(R.id.btnRegresar);
    }
}