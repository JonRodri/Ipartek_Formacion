package com.ipartek.formacion.proyecto.variables;

public class Variables {

	public static void main(String[] args) {
		//Variables primitivas empiezan por minus.
		
		System.out.println("Ejemplo de variables");	//ln: salto de línea || /n
		System.out.println("********************");
		
		String nombre = "Txus";
		
		/* TODAS LAS VARIABLES PRIMITIVAS EMPIEZAN POR MINUS. */
		
		//Variables de tipo enteras
		byte edadByte = 33;
		short edadShort = 33;
		int edad = 33;

		//Variables de tipo decimal
		float sueldoCasteado = (float) 5000.99;
		float sueldoConF = 5000.99f;
		
		double sueldoBarcenas = 500000000.99;
		
		//Booleanas
		boolean isAprobado = true;
		boolean aprobado = true;
		boolean profesor = false;
		
		//Caracteres
		char letra = 'a';	//Van entre comillas simples
		char simbolo = '?';
		char num = '5';
		String abc = "abcdefg";	//Van entre comillas dobles. String es una clase, empieza por mayus.
		
		//Constantes
		final float NUMERO_PI = 3.14f;	//Variables CONSTANTES en MAYUS.
	}

}
