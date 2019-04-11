package com.ipartek.formacion.proyecto.poo;

public class Triangulo {
	
	//atributos
	private int a;
	private int b;
	private int c;
	
	
	//constructor
	public Triangulo() {
		super();
		this.a = 7;
		this.b = 4;
		this.c = 6;
	}
	
	
	//setters & getters
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	
	public void ladoMayor(int a, int b, int c) {
		if(a > b && a > c) {
			System.out.println("A es el lado mayor.");
		} 
		else if(b > c && b > a) {
			System.out.println("B es el lado mayor.");
		} else {
			System.out.println("C es el lado mayor.");
		}
	}
	
	public void equilatero(int a, int b, int c) {
		if(a == b && a == c) {
			System.out.println("Es equilatero.");
		}
	}
}