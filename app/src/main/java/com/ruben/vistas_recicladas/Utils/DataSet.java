package com.ruben.vistas_recicladas.Utils;

import java.util.ArrayList;

public class DataSet {
    public static DataSet newInstance(){
        DataSet dataSet = new DataSet();
        return dataSet;
    }
    public ArrayList obtenerPersonas(){
        ArrayList<Persona> lista= new ArrayList<>();
        lista.add(new Persona("Jose","Lopez",123,0));
        lista.add(new Persona("Maria","Lopez",123,1));
        lista.add(new Persona("Ana","Lopez",123,1));
        lista.add(new Persona("Juan","Lopez",123,0));
        lista.add(new Persona("Belen","Lopez",123,1));
        return lista;
    }
}
