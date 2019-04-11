package com.ipartek.formacion.proyecto.ficheros;

import java.io.File;

public class ListarDirectorio {

	public static void main(String[] args) {
		File file = new File("C:/hobetuz/proyecto/resources");
		File[] ficheros = file.list();

		for (File f : ficheros) {
			System.out.println(f.getName() + " esCarpeta: " + f.isDirectory());
		}

	}

	/**
	 * Función recursiva para mostrar el árbol de ficheros
	 * 
	 * @param f file, directorio del cual vamos a mostrar su árbol.
	 */

	static void mostrarDirectorio(File f) {

		if (f != null) { // no es nulo?
			if (f.isDirectory()) { // es un directorio?
				f.getName(); // conseguimos el nombre
				File[] files = f.listFiles(); // listamos
				for (File fit : files) { // fIteracion
					mostrarDirectorio(fit);
				}
			} else { // si no es directorio printar nombre
				System.out.println(f.getName());
			}
		}
	}

}
