package com.ipartek.formacion.proyecto.ejercicios;

import java.util.Scanner;

public class ArrayAlumnos {

	static Scanner sc = new Scanner(System.in);
	static int opc = 0;
	final static int OPCION_LISTAR = 1;
	final static int OPCION_NOMBRE = 2;
	final static int OPCION_POSICION = 3;
	final static int SALIR = 4;
	static String[] alumnos = { "Ander", "Ione", "Itziar", "Mikel", "Ibon", "Miguel", "Pedro", "Diosdado", "Sergio",
			"Jon", "Sara" };

	public static void main(String[] args) {
		String resp = "";
		boolean repetir = false;

		do {
			menu();
			do {
				// Preguntamos si quiere salir
				System.out.println("Quieres elegir otra opcion: Si / No");
				sc = new Scanner(System.in);
				resp = sc.nextLine();
				if ("Si".equalsIgnoreCase(resp)) {
					repetir = true;
				} else if ("No".equalsIgnoreCase(resp)) {
					System.out.println("Hasta luego :)");
				}
			} while (!"Si".equalsIgnoreCase(resp) && !"No".equalsIgnoreCase(resp));
		} while (repetir);

		sc.close();

	}

	private static void menu() {

		do {
			System.out.println(
					"Elige una opcion: (1-Listar alumnos 2-Buscar alumno por nombre 3-Buscar alumno por posicion)");
			opc = sc.nextInt();
		} while (opc != OPCION_LISTAR && opc != OPCION_NOMBRE && opc != OPCION_POSICION && opc != SALIR);

		if (opc == OPCION_LISTAR) {
			listar();
		} else if (opc == OPCION_NOMBRE) {
			buscarPorNombre();
		} else if (opc == OPCION_POSICION) {
			buscarPorPosicion();
		}

	}

	private static void listar() {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Alumno [" + i + "]: " + alumnos[i]);
		}

	}

	private static void buscarPorNombre() {
		String nombre = "";
		boolean flag = true;

		System.out.println("Introduce un nombre:");
		sc = new Scanner(System.in);
		nombre = sc.nextLine();

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].equalsIgnoreCase(nombre) == true) {
				System.out.println("El alumno que buscabas es el #" + i);
				flag = false;
			}
		}

		if (flag == true) {
			System.out.println("El alumno " + nombre + " no existe.");
		}

	}

	private static void buscarPorPosicion() {
		int posicion = 0;

		System.out.println("Introduce la posicion del alumno que quieres buscar:");
		sc = new Scanner(System.in);
		posicion = sc.nextInt();

		for (int i = 0; i < alumnos.length; i++) {
			if (posicion > alumnos.length) {
				System.out.println("No tenemos tantos alumnos. Introduce un valor entre 0 y " + alumnos.length);
			}

			else if (posicion < 0) {
				System.out.println("Introduce un valor superior a 0.");
			}

			else {
				if (i == posicion) {
					System.out.println("En la posicion [" + posicion + "] tenemos al alumno: " + alumnos[i]);
				}
			}

		}

	}

}
