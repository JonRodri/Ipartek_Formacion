package com.ipartek.formacion.proyecto;

public class Util {

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			System.out.println(numeroAleatorio(10));
		}

	}

	/**
	 * Genera un número aleatorio entre 0 y numeroMaximo excluido
	 * 
	 * @param numeroMaximo int
	 * @return
	 * @return int numero aleatorio
	 */
	public static int numeroAleatorio(int numeroMaximo) {
		return (int) (Math.random() * 10 + 1); // random devuelve double.
	}

}
