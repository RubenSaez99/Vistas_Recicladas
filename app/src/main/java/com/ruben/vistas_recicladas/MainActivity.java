package com.ruben.vistas_recicladas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button irSinCartas,irConCartas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
    irSinCartas.setOnClickListener(this);
    }

    private void instancias() {
        irSinCartas = findViewById(R.id.sinCartas);
        irConCartas = findViewById(R.id.conCartas);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sinCartas:
            Intent i = new Intent(getApplicationContext(), Activity_sin_cartas.class);
            startActivity(i);
            break;
            case android.R.id.home:
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
        }
    }
}
