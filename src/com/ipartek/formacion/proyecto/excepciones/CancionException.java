package com.ipartek.formacion.proyecto.excepciones;

public class CancionException extends Exception {

	// definir mensajes propios
	static final String MENSAJE = "Por Dios otra vez esa cancion no!!";
	static final String CANCION_PROHIBIDA = "Dime tu nombre";

	public CancionException(String mensaje) {
		super(mensaje);
	}

	public static void main(String[] args) {

	}

}
