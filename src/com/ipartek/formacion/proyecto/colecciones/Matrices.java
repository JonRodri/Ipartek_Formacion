package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		int[][] matriz = new int[3][2];

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce valores para las filas: ");
		for (int i = 0; i < matriz.length; i++) {
			matriz[i][0] = sc.nextInt();
		}

		sc.close();

	}// end main

}
