package com.ruben.vistas_recicladas.Utils;

import java.io.Serializable;

public class Persona implements Serializable {
    String nombre,apellido;
    int telefono,sexo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getSexo() {
        return sexo;
    }

    public Persona(String nombre, String apellido, int telefono, int sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.sexo = sexo;
    }
}
