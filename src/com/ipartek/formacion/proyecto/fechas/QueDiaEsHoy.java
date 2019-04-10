package com.ipartek.formacion.proyecto.fechas;

import java.time.LocalDateTime;

public class QueDiaEsHoy {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

		System.out.printf("Año %s \n", now.getYear());
		System.out.printf("Mes %s \n", now.getMonthValue());
		System.out.printf("Dia %s \n", now.getDayOfMonth());
		System.out.printf("Hora %s \n", now.getHour());
		System.out.printf("Minuto %s \n", now.getMinute());

		String medioAnio = "";

		// Para asignar un valor a una variable con IF-ELSE -> 5 líneas
		if (now.getMonthValue() < 6) {
			medioAnio = "No ha pasado medio año.";
		} else {
			medioAnio = "Ya ha pasado medio año.";
		}

		// El código es más limpio con un OPERADOR TERNARIO
		String medioAnioTernario = (now.getMonthValue() < 6) ? "No ha pasado medio año." : "Ya ha pasado medio año.";
		System.out.println(medioAnioTernario);
	}

}
