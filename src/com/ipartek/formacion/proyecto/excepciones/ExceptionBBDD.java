package com.ipartek.formacion.proyecto.excepciones;

public class ExceptionBBDD {

	public static void main(String[] args) /* throws Exception */ {

		System.out.println("Conectando a base de datos de null");
		boolean isConected = conectarBBDD(null);

		try {
			if (isConected) {
				System.out.println("Conexion realizada con exito.");
			} else {
				System.out.println("No podemos conectarnos.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Esto es para simular que nos conectamos a una base de datos
	 *
	 * @param nombreBaseDatos
	 * @return true si conecta, false en caso contrario.
	 * @throws Exception si @param nombreBaseDatos == null || nombreBaseDatos == " "
	 */

	static boolean conectarBBDD(String nombreBaseDatos) throws Exception { // puede que lance excepción
		boolean resul = false;

		if (nombreBaseDatos != null && !" ".equals(nombreBaseDatos)) { // es lo mismo
			resul = true;
		} else {
			throw new Exception("ConexionException, este mensaje es nuestro o personalizado.");
		}

		return resul;
	}

}
