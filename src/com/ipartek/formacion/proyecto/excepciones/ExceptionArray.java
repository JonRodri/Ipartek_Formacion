package com.ipartek.formacion.proyecto.excepciones;

public class ExceptionArray {
	static String[] frutas = { "Limon", "Manzana", "Fresa" };

	public static void main(String[] args) {
		mostrar();
	}

	static void mostrar() {
		System.out.println("La primera fruta es: " + frutas[0]);
		System.out.println("La segunda fruta es: " + frutas[1]);
		System.out.println("La tercera fruta es: " + frutas[2]);
		System.out.println("La cuarta fruta es: " + frutas[3]);

		System.out.println("Nunca veras esta linea por consola.");
	}
}
