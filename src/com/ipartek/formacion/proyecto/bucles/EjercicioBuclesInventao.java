//Pedir un caracter por pantalla y analizar si es una letra, número o dígito

package com.ipartek.formacion.proyecto.bucles;

import java.util.Scanner;

public class EjercicioBuclesInventao {

	public static void main(String[] args) {
		char x = 'A';
		String z = "0";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una letra, número o caracter especial:");
		z = sc.nextLine();
		x = z.charAt(0);

		if (Character.isLetter(x) == true) {
			System.out.println("Es letra.");
			if (Character.isUpperCase(x) == true) {
				System.out.println("Y es mayus.");
			} else {
				System.out.println("Y es minus.");
			}
		} else if (Character.isDigit(x) == true) {
			System.out.println("Es numero.");
		}

		/*
		 * FUNCIONAMIENTO isLetter etc. System.out.println("es letra " +
		 * Character.isLetter(x)); System.out.println("es digito " +
		 * Character.isDigit(x)); System.out.println("es mayuscula " +
		 * Character.isUpperCase(x));
		 */

	}

}
