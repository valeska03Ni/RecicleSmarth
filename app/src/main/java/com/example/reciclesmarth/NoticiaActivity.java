package com.example.reciclesmarth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoticiaActivity extends AppCompatActivity {
    private Button btnRegresar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia);

        referencias();
        eevntosBotones();
    }

    private void eevntosBotones() {
        btnRegresar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRegresar3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent f = new Intent(NoticiaActivity.this, ItemActivity.class);
                        startActivity(f);
                    }
                });
            }
        });
    }

    private void referencias() {
        btnRegresar3 = findViewById(R.id.btnRegresar3);
    }
}