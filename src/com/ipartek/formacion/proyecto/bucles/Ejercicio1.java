package com.ipartek.formacion.proyecto.bucles;

/*
 * 
 * Ejercicio para aprender el funcionamiento de los bucles
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		for (int i = 10; i > 0; i--) {
			System.out.println("Iteracion " + i);
			if (i % 2 == 0) {
				System.out.println("Es par.");
			} else {
				System.out.println("Es impar.");
			} // end for
		}

		// Iteración de 0 a N
		int parar = 0;

		while (parar >= 10) {
			System.out.println("parar " + parar);
			parar++;
		}

		// Iteración de 1 a N Entra 1 vez al menos
		int j = 0;
		do {
			System.out.println("Iteracion " + j);
			j++;
		} while (j < 10);

	} // end main

}
