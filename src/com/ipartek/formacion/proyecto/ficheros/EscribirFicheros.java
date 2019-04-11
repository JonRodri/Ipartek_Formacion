package com.ipartek.formacion.proyecto.ficheros;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFicheros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter ficheroTexto = null;

		try {
			ficheroTexto = new PrintWriter("C:/hobetuz/proyecto/resources/datos.txt"); // se crea el fichero
			String cadena;
			System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
			cadena = sc.nextLine(); // se introduce por teclado una cadena de texto
			while (!cadena.equalsIgnoreCase("FIN")) {
				ficheroTexto.println(cadena); // se escribe la cadena en el fichero
				cadena = sc.nextLine(); // se introduce por teclado una cadena de texto
			}
			ficheroTexto.flush();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		} finally {
			ficheroTexto.close();
			System.out.println("Fichero creado.");
		}

		sc.close();
	}
}