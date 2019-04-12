/* 
1. Confeccionar una clase que permita cargar el nombre y la edad de una persona.
a) Mostrar los datos cargados de la persona
b) Imprimir un mensaje que nos diga si es mayor de edad o no.
*/

package com.ipartek.formacion.proyecto.pojo;

public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();

		p1.setNombre("Jon");
		p1.setApellido("Rodriguez");
		p1.setEdad(29);

		System.out.printf("Nombre: %s\nApellido: %s\nEdad: %s\n\n", p1.getNombre(), p1.getApellido(), p1.getEdad());
		// boolean isMayorEdad = (p1.getEdad() >= 18) ? true : false;
		if (p1.getEdad() >= 18) {
			p1.setMayorEdad(true);
		} else {
			p1.setMayorEdad(false);
		}

		if (p1.isMayorEdad() == true) {
			System.out.println("Es mayor de edad.");
		} else {
			System.out.println("No es mayor de edad.");
		}

	}

}
