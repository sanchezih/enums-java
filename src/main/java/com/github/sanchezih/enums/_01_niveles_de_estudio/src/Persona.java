package com.github.sanchezih.enums._01_niveles_de_estudio.src;

public class Persona {

    private String nombre;
    private String apellido;
    private NivelDeEstudio nivelDeEstudio;

    /*----------------------------------------------------------------------------*/

    public Persona(String nombre, String apellido, NivelDeEstudio nivelDeEstudio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelDeEstudio = nivelDeEstudio;
    }

    /*----------------------------------------------------------------------------*/

    public NivelDeEstudio getNivelDeEstudio() {
        return nivelDeEstudio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", " +
                "nivelDeEstudio=" + nivelDeEstudio + '}';
    }

}
