package com.ipartek.formacion.proyecto.controlflujo;

public class Condicionales {

	public static void main(String[] args) {
		final int MAYORIA_EDAD = 18; // CONSTANTE
		final int EDAD_JUBILACION = 64;

		final int MAYORIA_EDAD_MENTAL_HOMBRES = EDAD_JUBILACION;
		final int MAYORIA_EDAD_MENTAL_MUJERES = 30;

		int edadPepe = 64;
		char sexo = 'h';

		if (edadPepe >= MAYORIA_EDAD) {
			System.out.println("Es mayor de edad.");
		} else {
			System.out.println("Es menor de edad.");
		}

		if (edadPepe >= MAYORIA_EDAD_MENTAL_HOMBRES && (sexo == 'h' || sexo == 'H')) {
			System.out.println("Mentalmente es mayor de edad.");
		} else if ((edadPepe < MAYORIA_EDAD_MENTAL_HOMBRES && sexo == 'h' || sexo == 'H')) {
			System.out.println("Mentalmente no es mayor de edad.");
		}
	}

}
