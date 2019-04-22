/*
2. Desarrollar un programa que cargue los lados de un triangulo e implemente los siguientes métodos:
a. Inicializar los atributos
b. Imprimir el valor del lado mayor
c. Mostrar en otro si es equilátero o no. (Los tres lados iguales).
*/
package com.ipartek.formacion.proyecto.pojo;

public class MainTriangulo {

	public static void main(String[] args) {
		Triangulo tri = new Triangulo();
		
		System.out.println("Triangulo");
		System.out.println("---------");
		tri.setA(5);
		tri.setB(5);
		tri.setC(4);
		System.out.printf("A: %s  B: %s  C:  %s\n\n", tri.getA(), tri.getB(), tri.getC());
		tri.ladoMayor(tri.getA(), tri.getB(), tri.getC());
		tri.equilatero(tri.getA(), tri.getB(), tri.getC());
	}

}
