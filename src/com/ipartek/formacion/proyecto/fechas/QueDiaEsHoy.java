package com.ipartek.formacion.proyecto.fechas;

import java.time.LocalDateTime;

public class QueDiaEsHoy {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.printf("A�o %s \n", now.getYear());
		System.out.printf("Mes %s \n", now.getMonthValue());
		System.out.printf("Dia %s \n", now.getDayOfMonth());
		System.out.printf("Hora %s \n", now.getHour());
		System.out.printf("Minuto %s \n", now.getMinute());

		String medioAnio = "";

		// Para asignar un valor a una variable con IF-ELSE -> 5 l�neas
		if (now.getMonthValue() < 6) {
			medioAnio = "No ha pasado medio a�o.";
		} else {
			medioAnio = "Ya ha pasado medio a�o.";
		}

		// El c�digo es m�s limpio con un OPERADOR TERNARIO
		String medioAnioTernario = (now.getMonthValue() < 6) ? "No ha pasado medio a�o." : "Ya ha pasado medio a�o.";
		System.out.println(medioAnioTernario);
	}

}
