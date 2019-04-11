package com.ipartek.formacion.proyecto.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prueba1 {

	public static void main(String[] args) throws IOException {
		// LA RUTA
		String linea = "asdfdsafaf";
		String ruta = "C://hobetuz/proyecto/resources/prueba.txt";
		File prueba = new File(ruta);
		BufferedWriter bw;
		FileWriter prueba = null;
		try {
			prueba = new FileWriter("C://hobetuz/proyecto/resources/prueba.txt");
			pw = new PrintWriter(prueba);
		}
		// EXISTE?
		if (prueba.exists()) {
			bw = new BufferedWriter(new FileWriter(prueba));
			bw.write("Linea: El fichero de texto ya estaba creado.");
		} else {
			bw = new BufferedWriter(new FileWriter(prueba));
			bw.write("Acabo de crear el fichero de texto.");
		}

		if (linea != null) {
			bw.write(linea);
		}
		bw.close();

		// SÍ -> MODIFICAMOS

		// NO -> MOSTRAR MENSAJE

	}

}
