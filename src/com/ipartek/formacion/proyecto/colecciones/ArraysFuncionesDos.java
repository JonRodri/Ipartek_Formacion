//Menú pronóstico del tiempo -> Idioma -> Prono hoy, 3 días, 7 días CON FUNCIONES

package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

public class ArraysFuncionesDos {

	// variables globales
	static int idioma = 0;
	static int opc = 0;
	static String diasSemana[] = new String[7];
	static String diasSemanaEu[] = new String[7];
	static int[] temperaturaSemanaMax = { 13, 17, 14, 14, 15, 16, 13, 16 };
	static int[] temperaturaSemanaMin = { 8, 7, 8, 8, 6, 7, 8 };

	// lo mismo pero inicializando según se declara:

	public static void main(String[] args) {

		inicializarValores();
		pedirIdioma();
		mostrarDatos(idioma);

	}// end main

	private static void inicializarValores() {
		diasSemana[0] = "Lunes";
		diasSemana[1] = "Martes";
		diasSemana[2] = "Miercoles";
		diasSemana[3] = "Jueves";
		diasSemana[4] = "Viernes";
		diasSemana[5] = "Sabado";
		diasSemana[6] = "Domingo";

		diasSemanaEu[0] = "Astelehena";
		diasSemanaEu[1] = "Asteartea";
		diasSemanaEu[2] = "Asteazkena";
		diasSemanaEu[3] = "Osteguna";
		diasSemanaEu[4] = "Ostirala";
		diasSemanaEu[5] = "Larumbata";
		diasSemanaEu[6] = "Igandea";

	}

	private static void pedirIdioma() {

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Elige un idioma: (1->Castellano 2->Euskera)");
			idioma = sc.nextInt();
		} while (idioma < 1 && idioma > 2);

		sc.close();
	}

	private static void mostrarDatos(int idioma) {

		Scanner sc = new Scanner(System.in);

		switch (idioma) {
		case 1:
			System.out.println("Elige prevision: (1->Hoy 2->Proximos 3 dias 3->Semanal");
			opc = sc.nextInt();
			if (opc == 1) {
				System.out.println("Prevision para hoy");
				System.out.println(" ::" + diasSemana[0] + ":: ");
				System.out.println("Maxima: " + temperaturaSemanaMax[0]);
				System.out.println("Minima: " + temperaturaSemanaMin[0]);
			} else if (opc == 2) {
				System.out.println("Prevision para los proximos 3 dias");
				for (int i = 1; i < 4; i++) {
					System.out.println("::" + diasSemana[i] + ":: ");
					System.out.println("Maxima: " + temperaturaSemanaMax[i]);
					System.out.println("Minima: " + temperaturaSemanaMin[i]);
					System.out.println("");
				}
			} else {
				System.out.println("Prevision semanal");
				for (int i = 0; i < 7; i++) {
					System.out.println("::" + diasSemana[i] + ":: ");
					System.out.println("Maxima: " + temperaturaSemanaMax[i]);
					System.out.println("Minima: " + temperaturaSemanaMin[i]);
					System.out.println("");
				}
			}
			break;

		case 2:
			System.out.println("Aukeratu prebisioa: (1->Gaur 2->Hurrengo 3 egunekoa 3->Astekoa)");
			opc = sc.nextInt();

			if (opc == 1) {
				System.out.println("Garuko prebitsioa");
				System.out.println("::" + diasSemana[0] + ":: ");
				System.out.println("Goienekoa: " + temperaturaSemanaMax[0]);
				System.out.println("Gutxikoena: " + temperaturaSemanaMin[0]);
			} else if (opc == 2) {
				System.out.println("Prevision para los proximos 3 dias");
				for (int i = 1; i < 4; i++) {
					System.out.println("::" + diasSemana[i] + ":: ");
					System.out.println("Goienekoa: " + temperaturaSemanaMax[i]);
					System.out.println("Gutxikoena: " + temperaturaSemanaMin[i]);
					System.out.println("");
				}
			} else {
				System.out.println("Prevision semanal");
				for (int i = 0; i < 7; i++) {
					System.out.println("::" + diasSemana[i] + ":: ");
					System.out.println("Goienekoa: " + temperaturaSemanaMax[i]);
					System.out.println("Gutxikoena: " + temperaturaSemanaMin[i]);
					System.out.println("");
				}
			}
			break;

		}// end switch
		sc.close();
	}// end mostrarDatos

}
