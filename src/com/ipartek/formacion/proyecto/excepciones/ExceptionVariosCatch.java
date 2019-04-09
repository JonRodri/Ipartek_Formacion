package com.ipartek.formacion.proyecto.excepciones;

public class ExceptionVariosCatch {

	public static void main(String[] args) {
		try {
			Integer.parseInt("1434234A4GGC");

		} catch (NullPointerException e) {
			System.out.println("**Capturada excepcion NullPointerException" + e.getMessage());

		} catch (Exception e) {
			System.out.println("**Capturada excepcion." + e.getMessage());

		} finally {
			System.out.println("Esto se ejecuta siempre.");
		}
	}

}
