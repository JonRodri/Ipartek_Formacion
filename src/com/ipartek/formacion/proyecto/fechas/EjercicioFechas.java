package com.ipartek.formacion.proyecto.fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjercicioFechas {

	public static void main(String[] args) {
		DayOfWeek lunes = DayOfWeek.MONDAY;

		System.out.println(lunes);
		System.out.printf("8 d�as ser�: %s%n", lunes.plus(8));
		System.out.printf("2 d�as antes fue: %s%n", lunes.minus(2));

		// Basado en c�digo ISO
		Locale l = new Locale("es", "ES");
		System.out.println("TextStyle.FULL:" + lunes.getDisplayName(TextStyle.FULL, l));// lunes
		System.out.println("TextStyle.NARROW:" + lunes.getDisplayName(TextStyle.NARROW, l));// L
		System.out.println("TextStyle.SHORT:" + lunes.getDisplayName(TextStyle.SHORT, l));// lun

		LocalDate date = LocalDate.of(1999, Month.AUGUST, 23);
		DayOfWeek dia = date.getDayOfWeek();

		YearMonth mes = YearMonth.now();
		System.out.printf("Este mes es %s y tiene %d d�as%n", mes, mes.lengthOfMonth());
		mes = YearMonth.of(2004, Month.FEBRUARY);
		System.out.printf("El mes %s tuvo %d d�as,%n", mes, mes.lengthOfMonth());
		mes = YearMonth.of(2002, Month.FEBRUARY);
		System.out.printf("el mes %s tuvo %d d�as,%n", mes, mes.lengthOfMonth());
		mes = YearMonth.of(2000, Month.FEBRUARY);
		System.out.printf("el mes %s tuvo %d d�as%n", mes, mes.lengthOfMonth());
		mes = YearMonth.of(1800, Month.FEBRUARY);
		System.out.printf("Pero el mes %s tuvo %d d�as �Sab�as que no es considerado bisiesto?%n", mes,
				mes.lengthOfMonth());

		MonthDay diaMes = MonthDay.of(Month.FEBRUARY, 28);
		System.out.printf("El d�a %s %s es v�lido para el a�o 2019%n", diaMes, diaMes.isValidYear(2019) ? "" : "no");
		// la respuesta ser� NO

		Year ano = Year.now();
		System.out.printf("Este a�o es %s y %s es bisiesto%n", ano, ano.isLeap() ? "s�" : "no");

		LocalTime justoAhora = LocalTime.now();
		System.out.printf("En este momento son las %d horas con %d minutos y %d segundos\n", justoAhora.getHour(),
				justoAhora.getMinute(), justoAhora.getSecond());

		LocalDateTime ahora = LocalDateTime.now();
		System.out.printf("La hora es: %s%n", ahora);
		LocalDateTime algunDia = LocalDateTime.of(1976, Month.MARCH, 27, 6, 10);
		System.out.printf("Yo nac� el %s%n", algunDia);
		System.out.printf("Hace seis meses fue %s%n", LocalDateTime.now().minusMonths(6));
	}

}
