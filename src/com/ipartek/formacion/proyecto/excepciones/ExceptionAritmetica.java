package com.ipartek.formacion.proyecto.excepciones;

public class ExceptionAritmetica {

	public static void main(String[] args) {

		System.out.printf(" = " + dividir(4, 2.5f));
		System.out.printf(" = " + dividir(4, 0));
		System.out.printf(" = " + dividir(4, -1.5f));

		try {
			float resultado = dividir(400.5f, 0);

			if (resultado == Float.POSITIVE_INFINITY) {
				System.out.println("***Resultado infinito");
			} else {
				System.out.println("Resultado no infinito.");
			}
		} finally {
			System.out.println("Esta linea se ejecuta siempre.");
		}

	}

	private static float dividir(float valor1, float valor2) {
		System.out.println(" Dividimos valor1 entre valor2.");

		return valor1 / valor2;
	}

}
