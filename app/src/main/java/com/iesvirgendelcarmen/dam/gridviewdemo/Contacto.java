package com.iesvirgendelcarmen.dam.gridviewdemo;

/**
 * Created by matinal on 30/10/2017.
 */

public class Contacto {
    private String Nombre;
    private String Apellidos;
    private int Foto;

    public Contacto(String nombre, String apellidos, int foto) {
        Nombre = nombre;
        Apellidos = apellidos;
        Foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }
}
