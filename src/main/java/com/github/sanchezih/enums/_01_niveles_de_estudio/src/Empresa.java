package com.github.sanchezih.enums._01_niveles_de_estudio.src;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private List<Persona> personas;

	/*----------------------------------------------------------------------------*/

	/**
	 * Constructor de la clase Empresa.
	 * 
	 * Inicializa la lista de personas que pertenecen a la empresa.
	 */
	public Empresa() {
		this.personas = new ArrayList<>();
	}

	/*----------------------------------------------------------------------------*/

	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

	/**
	 * Muestra por consola todas las personas cuyo nivel de estudio coincide con el
	 * nivel recibido por parametro.
	 * 
	 * @param nivelDeEstudio
	 */
	public void mostrarPorNivel(NivelDeEstudio nivelDeEstudio) {
		for (Persona persona : personas) {
			if (persona.getNivelDeEstudio() == nivelDeEstudio) {
				System.out.println(persona);
			}
		}
	}

}
