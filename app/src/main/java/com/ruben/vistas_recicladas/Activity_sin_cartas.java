package com.ruben.vistas_recicladas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.ruben.vistas_recicladas.Utils.Persona;
import com.ruben.vistas_recicladas.adaptadores.AdaptadorRecycler;

import java.util.ArrayList;

public class Activity_sin_cartas extends AppCompatActivity implements AdaptadorRecycler.onMyRecyclerListener {
    RecyclerView recicler;
    ArrayList<Persona> listaPersonas;
    AdaptadorRecycler adaptadorRecycler;
    final static String TAG_1 = "persona";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin_cartas);
        instancias();
        acciones();
    }
    private void rellenarRecycler(){
        recicler.setAdapter(adaptadorRecycler);

        adaptadorRecycler.notifyDataSetChanged();
        //al elemento de tipo reciclerview vaa mostrar las cosas de x manera o linearLayoutmanager o gridlayoutmanager
        recicler.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private void acciones() {

    }

    private void instancias() {
        recicler = findViewById(R.id.recicler);
        listaPersonas = new ArrayList<>();
        adaptadorRecycler = new AdaptadorRecycler(this, listaPersonas);
        rellenarRecycler();
    }

    @Override
    public void onMyrecycler(Persona persona) {
        Intent i = new Intent(getApplicationContext(),ActivityPersona.class);
        i.putExtra(TAG_1,persona);
        startActivity(i);
        finish();
    }
}
