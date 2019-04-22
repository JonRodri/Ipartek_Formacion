package com.ipartek.formacion.proyecto.pojo;

public class MainCuadrado {

	public static void main(String[] args) {
		Cuadrado c = new Cuadrado();
		
		c.cargarDatos(c.getLado());
		c.perimetroSuperficie(c.getLado());
	}

}
