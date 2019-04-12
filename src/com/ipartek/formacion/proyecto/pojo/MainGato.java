package com.ipartek.formacion.proyecto.pojo;

import javax.swing.JOptionPane;

public class MainGato {

	public static void main(String[] args) {
		Gato cat = new Gato();
		Gato g = new Gato();
		String nombre = "";
		String sPeso = "";
		float peso = 0;
		boolean error = true;

		// cat.setNombre("Garfield");
		// cat.setPeso(40);
		// cat.setRaza("");
		// cat.setVacunado(true);

		// Datos para crear un gato
		try {
			// 1º Pedimos datos al usuario
			do {
				try {
					nombre = JOptionPane.showInputDialog("Dime el nombre del gato: ");
					sPeso = JOptionPane.showInputDialog("Cuánto pesa? (Kg)");
					peso = Float.parseFloat(sPeso);
					error = false;
				} catch (Exception e) {
					System.out.println("Excepcion capturada.");
				}
			} while (error);

		} catch (Exception e) {

			System.out.println("***Nunca deberíamos entrar aquí.");
			e.printStackTrace();

		} finally {

			if (!cat.isVacunado()) {
				System.out.println("Vigila a tu gato.");
			} else {
				System.out.println("Tu gato esta a salvo.");
			}
		}

		// 2º Crear un gato con los valores de usuario
		g.setNombre(nombre);
		g.setPeso(peso);

		// 3º Mostrar
		System.out.println(g);

	}

}
