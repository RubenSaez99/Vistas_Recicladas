package com.ruben.vistas_recicladas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ruben.vistas_recicladas.Utils.Persona;

import org.w3c.dom.Text;

public class ActivityPersona extends AppCompatActivity {
    ImageView logo;
    TextView nombre,apellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);
        instancias();

    }

    private void instancias() {
        Persona p = (Persona) getIntent().getExtras().get(Activity_sin_cartas.TAG_1);
        logo = findViewById(R.id.logoActivityPersona);
        nombre = findViewById(R.id.textoNombrePersona);
        apellido = findViewById(R.id.textoApellidoPersona);
        if (p.getSexo() == 0)
            logo.setImageResource(R.drawable.man);
        else
            logo.setImageResource(R.drawable.woman);
        nombre.setText(p.getNombre());
        apellido.setText(p.getApellido());
    }
}
