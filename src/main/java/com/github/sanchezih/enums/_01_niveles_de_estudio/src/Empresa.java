package com.github.sanchezih.enums._01_niveles_de_estudio.src;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Persona> personas;

    /*----------------------------------------------------------------------------*/

    public Empresa() {
        this.personas = new ArrayList<>();
    }

    /*----------------------------------------------------------------------------*/

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void mostrarPorNivel(NivelDeEstudio nivelDeEstudio) {
        for (Persona persona : personas) {
            if (persona.getNivelDeEstudio() == nivelDeEstudio) {
                System.out.println(persona);
            }
        }
    }

}
