//Ejemplo de utilización de la clase File para obtener información sobre las unidades del sistema

package com.ipartek.formacion.proyecto.ficheros;

import java.io.File;

public class MostrarUnidadesDisco {

	public static void main(String[] args) {
		// Para Java un File puede ser:
		// carpeta => f.isDirectory() fichero => f.isFile()
		File[] unidades = File.listRoots(); // Listar discos
		System.out.printf("   %20s %20s %n", "Tamaño Total", "Tamaño disponible");
		for (File f : unidades) { // foreach Por cada elemento de Unidades, lo guarda en F.
			f.isDirectory();
			System.out.print(f);
			System.out.printf("%20s %20s %n", f.getTotalSpace(), f.getFreeSpace());
		}
	}
}
