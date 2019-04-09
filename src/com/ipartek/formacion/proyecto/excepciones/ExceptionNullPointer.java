package com.ipartek.formacion.proyecto.excepciones;

public class ExceptionNullPointer {

	public static void main(String[] args) {
		System.out.println("Hacemos que lance una exception de null pointer adrede.");

		String cadena = null;

		if ("constante".equals(cadena)) {
			System.out.println("IF: Forma correcta de un equals.");
		} else {
			System.out.println("ELSE: Forma correcta de un equals.");
		}

		cadena.trim();

		System.out.println("Nunca veras esta linea por consola.");

	}

}
