// 9.Programa Java que lea dos números y muestre los números desde el menor hasta el mayor 

package com.ipartek.formacion.proyecto.bucles;

import java.util.Scanner;

public class EjercicioBucles9 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce dos numeros:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Numeros entre " + num1 + " y " + num2);

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}

		sc.close();
	}

}
