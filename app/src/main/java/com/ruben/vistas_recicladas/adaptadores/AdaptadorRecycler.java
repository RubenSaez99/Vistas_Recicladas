package com.ruben.vistas_recicladas.adaptadores;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ruben.vistas_recicladas.R;
import com.ruben.vistas_recicladas.Utils.Persona;

import java.util.List;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.HolderAdapterPropio> {
    Context contexto;
    List listaPersonas;
    onMyRecyclerListener listener;

    public AdaptadorRecycler(Context contexto, List listaPersonas) {
        this.contexto = contexto;
        this.listaPersonas = listaPersonas;
        listener = (onMyRecyclerListener) contexto;
    }

    //Crea el contenedor que sirve para rellenar las filas.
    @NonNull
    @Override
    public HolderAdapterPropio onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.recycler_layout,parent,false);
        return new HolderAdapterPropio(view);
    }

    //Retorna el numero de elementos
    @Override
    public void onBindViewHolder(@NonNull HolderAdapterPropio holder, int position) {
        final Persona actual = (Persona) listaPersonas.get(position);
        holder.getNombre().setText(actual.getNombre());
        holder.getApellido().setText(actual.getApellido());
        if (actual.getSexo() == 0)
            holder.getImagen().setImageResource(R.drawable.man);
        else
            holder.getImagen().setImageResource(R.drawable.woman);

        holder.getNombre().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(String.valueOf(actual.getSexo()));
                listener.onMyrecycler(actual);
            }
        });



    }

    //
    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    class HolderAdapterPropio extends RecyclerView.ViewHolder{
        private ImageView imagen;
        private TextView nombre,apellido;


        public HolderAdapterPropio(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagen);
            apellido = itemView.findViewById(R.id.apellido);
            nombre = itemView.findViewById(R.id.nombre);
        }
        public Layout getLayout(){
            return getLayout();
        }

        public void setImagen(ImageView imagen) {
            this.imagen = imagen;
        }

        public void setNombre(TextView nombre) {
            this.nombre = nombre;
        }

        public void setApellido(TextView apellido) {
            this.apellido = apellido;
        }

        public ImageView getImagen() {
            return imagen;
        }

        public TextView getNombre() {
            return nombre;
        }

        public TextView getApellido() {
            return apellido;
        }
    }

    public interface onMyRecyclerListener {
         void onMyrecycler(Persona persona);
    }
}
