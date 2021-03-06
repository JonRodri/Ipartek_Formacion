package com.ipartek.formacion.proyecto.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BusquedaTesoro {

	public static void main(String[] args) {

		Scanner entrada = null;
		String linea;
		int numeroDeLinea = 1;
		boolean contiene = false;
		Scanner sc = new Scanner(System.in);

		// Introducimos el texto a buscar
		System.out.print("Introduce texto a buscar: ");
		String texto = sc.nextLine();

		try {
			// guardamos el path del fichero en la variable ruta
			String ruta = "C:/hobetuz/proyecto/resources";
			// creamos un objeto File asociado al fichero seleccionado
			File f = new File(ruta);
			// creamos un Scanner para leer el fichero
			entrada = new Scanner(f);
			// mostramos el nombre del fichero
			System.out.println("Archivo: " + f.getName());
			// mostramos el texto a buscar
			System.out.println("Texto a buscar: " + texto);
			while (entrada.hasNext()) { // mientras no se llegue al final del fichero
				linea = entrada.nextLine(); // se lee una l�nea
				if (linea.contains(texto)) { // si la l�nea contiene el texto buscado se muestra por pantalla
					System.out.println("Linea " + numeroDeLinea + ": " + linea);
					contiene = true;
				}
				numeroDeLinea++; // se incrementa el contador de l�neas
			}
			if (!contiene) { // si el archivo no contienen el texto se muestra un mensaje indic�ndolo

				System.out.println(texto + " no se ha encontrado en el archivo");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Texto no encontrado");
		} catch (NullPointerException e) {
			System.out.println(e.toString() + "No ha seleccionado ning�n archivo");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
		sc.close();
	}
}// Fin programa de b�squeda de texto en un archivo
