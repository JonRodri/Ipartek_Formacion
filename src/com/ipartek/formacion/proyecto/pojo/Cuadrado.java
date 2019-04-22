/*
3. Desarrollar una clase que represente un cuadrado y tenga los siguientes m�todos:
a.	Cargar el valor del lado
b.	Imprimir el per�metro y su superficie.
Per�metro=lado*4
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
	
	//m�todos
	public void cargarDatos(float lado) {
		String sLado = Float.toString(lado);
		
		sLado = JOptionPane.showInputDialog("Introduce el valor de un lado:");
		lado = Float.parseFloat(sLado);
	}
	
	public void perimetroSuperficie(float lado) {
		System.out.println("Perimetro: " + lado * 4);
		System.out.println("Superficie: " + lado * lado);
	}
}
