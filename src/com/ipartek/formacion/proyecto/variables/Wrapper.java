package com.ipartek.formacion.proyecto.variables;

public class Wrapper {

	public static void main(String[] args) {
		/*
		 * Los wrappers son clases que envuelven a las variables primitivas.
		 * 
		 * Tienen utilidades o funciones para trabajar con ellas. Por ejemplo, convertir de String a int y viceversa.
		 * 
		 */
		
		int num = 0;
		String numCadena = "3";
		
		// Convertimos/parseamos de String a int
		num = Integer.parseInt(numCadena);
		System.out.println(num);
		
		//byte wrapper Byte
		System.out.println("Variable primitiva byte valor minimo :" + Byte.MIN_VALUE);
		System.out.println("Variable primitiva byte valor minimo :" + Byte.MAX_VALUE);
		
		float sueldo = 600.55f;
		
		//Conversión de float a int
		System.out.println("Podemos castear de float " + sueldo + " a int " + (int)sueldo);
		
		//int wrapper Integer
		System.out.println("Variable primitiva int valor minimo :" + Integer.MIN_VALUE);
		System.out.println("Variable primitiva int valor minimo :" + Integer.MAX_VALUE);
		
		char nomVar = 'a';
		
		System.out.println("¿Es digito el char 'a'?" + Character.isDigit(nomVar));
		System.out.println("¿Es digito el char '1'?" + Character.isDigit('1'));	//Entre comilla simple
		
		//ASCII
		System.out.println("El valor ASCII de la variable char es igual a : " + ((int)nomVar));
		
		//PRINTAR LA TABLA ASCII
		for(int i=0; i<255; i++) {
			System.out.println("char " + (char)i + " codigo: " + i);
		}
		
	}

}
