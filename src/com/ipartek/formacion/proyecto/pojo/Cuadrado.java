/*
3. Desarrollar una clase que represente un cuadrado y tenga los siguientes métodos:
a.	Cargar el valor del lado
b.	Imprimir el perímetro y su superficie.
Perímetro=lado*4
Superficie=lado*lado
*/
package com.ipartek.formacion.proyecto.pojo;

import javax.swing.JOptionPane;

public class Cuadrado {
	// atributos
	private float lado;

	// constructor
	public Cuadrado() {
		super();
		this.lado = 0;
	}

	// getters & setters
	public float getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public void cargarDatos(lado) {
		String sLado = 
		
		JOptionPane.showInputDialog("Introduce el valor de un lado:");
		
	}
	
	
}
