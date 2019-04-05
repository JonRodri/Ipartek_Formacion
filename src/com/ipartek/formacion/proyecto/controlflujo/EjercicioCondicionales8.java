//8. Calcular el mayor de tres números enteros en Java.

package com.ipartek.formacion.proyecto.controlflujo;

import java.util.Scanner;

/**
 * Ejemplo para calcular el mayor de 3 números.
 * 
 * @author Curso
 *
 */

public class EjercicioCondicionales8 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		/* int mayor = 0; */

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tres numeros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		System.out.println("El mayor es el: " + buscarMayor(a, b, c));

		/*
		 * if (a > mayor && a > b && a > c) { mayor = a;
		 * System.out.println("El valor de 'a' (" + a + ") es el mayor."); } else if (b
		 * > mayor && b > c && b > a) { mayor = b;
		 * System.out.println("El valor de 'b' (" + b + ") es el mayor."); } else if (c
		 * > mayor && c > a && c > b) { mayor = c;
		 * System.out.println("El valor de 'c' (" + c + ") es el mayor."); }
		 */

		sc.close();
	}

	// DOCUMENTACIÓN FUNCIÓN /** Javadoc
	/**
	 * Busca el mayor número entero de los tres introducidos.
	 * 
	 * @param n1 int 1º número
	 * @param n2 int 2º número
	 * @param n3 int 3º número
	 * @return el mayor de los 3 parámetros de entrada
	 */

	// DECLARAR FUNCIÓN
	public static int buscarMayor(int a, int b, int c) {
		int mayor = -1;

		if (a > mayor && a > b && a > c) {
			mayor = a;
		} else if (b > mayor && b > c && b > a) {
			mayor = b;
			System.out.println("El valor de 'b' (" + b + ") es el mayor.");
		} else if (c > mayor && c > a && c > b) {
			mayor = c;
			System.out.println("El valor de 'c' (" + c + ") es el mayor.");
		}

		return mayor;
	}

}
