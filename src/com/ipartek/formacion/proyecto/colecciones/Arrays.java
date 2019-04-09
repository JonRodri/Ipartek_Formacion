//Menú pronóstico del tiempo -> Idioma -> Prono hoy, 3 días, 7 días CON FUNCIONES

package com.ipartek.formacion.proyecto.colecciones;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		String[] diasSemana = new String[7];

		diasSemana[0] = "Lunes";
		diasSemana[1] = "Martes";
		diasSemana[2] = "Miercoles";
		diasSemana[3] = "Jueves";
		diasSemana[4] = "Viernes";
		diasSemana[5] = "Sabado";
		diasSemana[6] = "Domingo";

		// lo mismo pero inicializando según se declara:

		String[] diasSemanaEu = { "Astelehena", "Asteartea", "Asteazkena", "Osteguna", "Ostirala", "Larumbata",
				"Igandea" };
		int[] temperaturaSemanaMax = { 13, 17, 14, 14, 15, 16, 13, 16 };
		int[] temperaturaSemanaMin = { 8, 7, 8, 8, 6, 7, 8 };

		int idioma = 0; // Preferible usar constantes -> static final String IDIOMA_CASTELLANO = "c";
		int opc = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Elige un idioma: (1->Castellano 2->Euskera)");
			idioma = sc.nextInt();
		} while (idioma < 1 && idioma > 2);

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
			sc.close();

			if (opc == 1) {
				System.out.println("Garuko prebitsioa");
				System.out.println("::" + diasSemanaEu[0] + ":: ");
				System.out.println("Goienekoa: " + temperaturaSemanaMax[0]);
				System.out.println("Gutxikoena: " + temperaturaSemanaMin[0]);
			} else if (opc == 2) {
				System.out.println("Prevision para los proximos 3 dias");
				for (int i = 1; i < 4; i++) {
					System.out.println("::" + diasSemanaEu[i] + ":: ");
					System.out.println("Goienekoa: " + temperaturaSemanaMax[i]);
					System.out.println("Gutxikoena: " + temperaturaSemanaMin[i]);
					System.out.println("");
				}
			} else {
				System.out.println("Prevision semanal");
				for (int i = 0; i < 7; i++) {
					System.out.println("::" + diasSemanaEu[i] + ":: ");
					System.out.println("Goienekoa: " + temperaturaSemanaMax[i]);
					System.out.println("Gutxikoena: " + temperaturaSemanaMin[i]);
					System.out.println("");
				}
			}
			break;

		}// end main

	}

}
