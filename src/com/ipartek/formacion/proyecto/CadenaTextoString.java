package com.ipartek.formacion.proyecto;

public class CadenaTextoString {

	public static void main(String[] args) {
		String cadena = "SupercAlifragilisticoespiAlidoso";
		String cadenaSucia = "   665534334     ";
		char letra = 'a';

		// Limpiar espacios en blanco a derecha e izda.
		cadenaSucia.trim();
		System.out.println("Cadena sin espacios en blanco: " + cadenaSucia);
		// cadena.length() -> devuelve la longitud
		System.out.println("La longitud de la cadena es: " + cadena.length());
		System.out.println("La primera letra es: " + cadena.charAt(0));
		System.out.println("La última letra es: " + cadena.charAt(cadena.length() - 1));
		System.out.println("Minusculas: " + cadena.toLowerCase());
		System.out.println("Mayusculas: " + cadena.toUpperCase());
		System.out.println("Substring: " + cadena.substring(2, 4));
		System.out.println(cadena + " tiene " + contarLetras(cadena, letra) + " letras.");
		System.out.println("La cadena reversa: " + darVuelta(cadena));
		System.out.println("La cadena es palindroma: " + esPalindroma(cadena));
	}

	/**
	 * Función que cuenta las letras de un String predifinido por usuario y cuenta.
	 * Case insensitive. cuántas letras A contiene.
	 * 
	 * @param cadena String cadena a examinar
	 * @param letra  char letra
	 * @return cont int cont, retorna las letras contadas.
	 */

	public static int contarLetras(String cadena, char letra) {
		int cont = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.toLowerCase(cadena.charAt(i)) == 'a') {
				cont++;
			}
		}

		return cont;
	}

	public static String darVuelta(String cadena) {
		String resul = "";

		if (cadena != null) {
			for (int i = cadena.length(); i > 0; i--) {
				resul += cadena.charAt(i); // Concatenar cadena.charAt(i) con cadenaRever
			}
		}

		return resul;
	}

	public static boolean esPalindroma(String cadena) {
		String cadenaDos = "";
		boolean resp = false;

		for (int i = cadena.length(); i > 0; i--) {
			cadenaDos = cadenaDos + cadena.charAt(i);
		}

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == cadenaDos.charAt(i)) {
				resp = true;
			} else {
				resp = false;
			}
		}

		return resp;
	}

}
