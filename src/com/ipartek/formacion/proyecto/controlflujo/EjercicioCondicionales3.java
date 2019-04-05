//3. Programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.

package com.ipartek.formacion.proyecto.controlflujo;

import java.util.Scanner;

public class EjercicioCondicionales3 {

	public static void main(String[] args) {
		int num = 0;
		int opc = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un entero: ");
		num = sc.nextInt();
		do {
			System.out.println("Elige una opcion -> 1-El doble 2-El triple");
			opc = sc.nextInt();
		} while (opc != 1 && opc != 2);
		switch (opc) {
		case 1:
			System.out.println("El doble es: " + 2 * num);
			break;
		case 2:
			System.out.println("El triple es: " + 3 * num);
			break;
		}
		sc.close();
	}

}
