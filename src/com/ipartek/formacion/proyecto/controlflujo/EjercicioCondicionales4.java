//4. Programa que lea dos caracteres por teclado y compruebe si son iguales.

package com.ipartek.formacion.proyecto.controlflujo;

import java.util.Scanner;

public class EjercicioCondicionales4 {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un caracter: ");
		a = sc.nextLine();
		char c = a.charAt(0);
		System.out.println("Introduce otro caracter: ");
		b = sc.nextLine();
		char d = b.charAt(0);
		if (c == d) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("No son iguales.");
		}

		sc.close();

	}

}
