package com.ipartek.formacion.proyecto.excepciones;

public class ExceptionPropagacion {

	public static void main(String[] args) {
		System.out.println("main - EMPIEZA");
		a();
		System.out.println("main - TERMINA");
	}

	private static void c() {
		System.out.println("metodoC - EMPIEZA");
		String cadena = null;
		cadena.length(); // NULL POINTER EXCEPTION
		System.out.println("metodoC - TERMINA");

	}

	private static void b() {
		System.out.println("metodoB - EMPIEZA");
		c();
		System.out.println("metodoB - TERMINA");
	}

	private static void a() {
		System.out.println("metodoA - EMPIEZA");
		b();
		System.out.println("metodoA - TERMINA");

	}

}
