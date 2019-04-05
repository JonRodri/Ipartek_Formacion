//10. Programa Java que lea dos números y muestre los números pares entre ellos 

package com.ipartek.formacion.proyecto.bucles;

import java.util.Scanner;

public class EjerciciosBucles10 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce dos numeros:");
		a = sc.nextInt();
		b = sc.nextInt();

		for (int i = a + 1; i < b; i++) {
			System.out.println("Numero " + i);
			if (i % 2 == 0) {
				System.out.println("El numero es par.");
			} else {
				System.out.println("El numero es impar.");
			}
		}
		sc.close();
	}
}
