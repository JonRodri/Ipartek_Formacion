//8. Calcular el mayor de tres números enteros en Java.

package com.ipartek.formacion.proyecto.controlflujo;

import java.util.Scanner;

public class EjercicioCondicionales8 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int mayor = 9999999;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tres numeros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > mayor && a > b && a > c) {
			System.out.println("El valor de 'a' (" + a + ") es el mayor.");
		} else if (b > mayor && b > c && b > a) {
			System.out.println("El valor de 'b' (" + b + ") es el mayor.");
		} else if (c > mayor && c > a && c > b) {
			System.out.println("El valor de 'c' (" + c + ") es el mayor.");
		}

		sc.close();
	}

}
