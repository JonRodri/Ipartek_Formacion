package com.ipartek.formacion.proyecto.excepciones;

public class ExceptionPropiaEjemplo {

	public static void main(String[] args) throws CancionException {
		try {
			reproducirCancion("Marea Gora - Koma");
			reproducirCancion("Dime tu nombre");
		} catch (Exception e) {
			System.out.println("***" + e.getMessage());
		}

	}

	static void reproducirCancion(String cancion) throws CancionException {

		if (CancionException.CANCION_PROHIBIDA.equals(cancion)) {
			throw new CancionException(CancionException.MENSAJE);
		} else {
			System.out.println("Reproduccion: " + cancion);
		}

	}

}
