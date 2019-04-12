package com.ipartek.formacion.proyecto.ejercicios;

import java.util.Scanner;

public class EjercicioAlumnosPojo {

	static Scanner sc = new Scanner(System.in);
	static int opc = 0;
	final static int OPCION_LISTAR = 1;
	final static int OPCION_NOMBRE = 2;
	final static int OPCION_POSICION = 3;
	final static int LISTAR_APROBADOS = 4;
	final static int LISTAR_SUSPENDIDOS = 5;
	final static int LISTAR_ALFABETICAMENTE = 6;
	final static int SALIR = 7;
	static Alumno[] alumnos = { new Alumno("Ander", "Uraga", 2), new Alumno("Ione", "Elizmendi", 4),
			new Alumno("Itziar", "Elizmendi", 8), new Alumno("Mikel", "Iglesias", 5), new Alumno("Ibon", "Juarrero", 9),
			new Alumno("Miguel", "", 0) };

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

	private static void menu() { // TODO menu() con Switch mejor

		do {
			System.out.println("Elige una opcion:");
			System.out.println("-----------------");
			System.out.println("1.Listar alumnos");
			System.out.println("2.Buscar alumno por nombre");
			System.out.println("3.Buscar alumno por posicion");
			System.out.println("4.Listar alumnos aprobados");
			System.out.println("5.Listar alumnos suspendidos");
			System.out.println("6.Listar alumnos alfabeticamente");
			System.out.println("-----------------");
			System.out.println("7.Salir");
			opc = sc.nextInt();
		} while (opc != OPCION_LISTAR && opc != OPCION_NOMBRE && opc != OPCION_POSICION && opc != SALIR
				&& opc != LISTAR_APROBADOS && opc != LISTAR_SUSPENDIDOS && opc != LISTAR_ALFABETICAMENTE);

		if (opc == OPCION_LISTAR) {
			listar();
		} else if (opc == OPCION_NOMBRE) {
			buscarPorNombre();
		} else if (opc == OPCION_POSICION) {
			buscarPorPosicion();
		} else if (opc == LISTAR_APROBADOS) {
			listarAprobados();
		} else if (opc == LISTAR_SUSPENDIDOS) {
			listarSuspendidos();
		} else if (opc == LISTAR_ALFABETICAMENTE) {
			listarAlfabeticamente();
		}

	}

	private static void listarAlfabeticamente() {
		Alumno aux = new Alumno();

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNombre().charAt(0) > alumnos[i + 1].getNombre().charAt(0)) {
				aux = alumnos[i];
				alumnos[i] = alumnos[i + 1];
				alumnos[i] = aux;
			}
		}

	}

	private static void listarSuspendidos() {
		for (Alumno a : alumnos) {
			if (a.getNota() < 5) {
				System.out.println(a);
			}
		}
	}

	private static void listarAprobados() {
		for (Alumno a : alumnos) { // Recorre alumnos de la clase Alumno
			if (a.getNota() >= 5) {
				System.out.println(a);
			}
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

		for (Alumno a : alumnos) { // a -> nombre variable -> busca
			if (a.getNombre().equalsIgnoreCase(nombre) == true) {
				System.out.println("El alumno que buscabas es el #" + a);
				flag = false;
				// break; si lo encuentra sale del for.
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
					System.out.println("En la posicion [" + posicion + "] tenemos al alumno: " + alumnos[posicion]);
				}
			}

		}

	}

}
