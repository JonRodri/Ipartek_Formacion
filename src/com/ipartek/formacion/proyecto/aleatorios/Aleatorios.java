package com.ipartek.formacion.proyecto.aleatorios;

public class Aleatorios {

	public static void main(String[] args) {
		System.out.println("Diez numeros aleatorios: ");
		for (int i = 1; i < 11; i++) {
			System.out.println((int) (Math.random() * 11));
		}

	}

}
