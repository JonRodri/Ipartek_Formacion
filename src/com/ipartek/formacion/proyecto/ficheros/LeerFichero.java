package com.ipartek.formacion.proyecto.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerFichero {

	public static void main(String[] args) {
		String linea;

		try (FileReader fr = new FileReader("C:/hobetuz/proyecto/resources/datos.txt")) {
			BufferedReader entrada = new BufferedReader(fr);

			while ((linea = entrada.readLine()) != null) { // mientras no se llegue al final del fichero
				System.out.println(linea); // se nuestra por pantalla
			}

			entrada.close();

		} catch (FileNotFoundException e) {
			System.out.println("CUIDADIN: Fichero no existe");

		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
			e.printStackTrace();

		}

	}

}
