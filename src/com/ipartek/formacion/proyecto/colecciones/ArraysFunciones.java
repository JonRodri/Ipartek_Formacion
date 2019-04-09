package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

public class ArraysFunciones {
//VARIABLES GLOBALES para métodos de este tipo de clase STATIC.
	static String dias[] = new String[7];
	static int diaSeleccionado;

	public static void main(String[] args) {
		inicializarValores();
		pedirOpciones();
		mostrarDatos();

	}

	private static void inicializarValores() {
		dias[0] = "Lunes";
		dias[1] = "Martes";
		dias[2] = "Miercoles";
		dias[3] = "Jueves";
		dias[4] = "Viernes";
		dias[5] = "Sabado";
		dias[6] = "Domingo";

	}

	private static void pedirOpciones() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Elige un dia: ");
		diaSeleccionado = sc.nextInt();

		sc.close();

	}

	private static void mostrarDatos() {
		System.out.println("Has seleccionado el " + dias[diaSeleccionado]);
	}

}
