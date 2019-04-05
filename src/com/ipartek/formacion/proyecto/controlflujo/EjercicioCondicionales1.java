package com.ipartek.formacion.proyecto.controlflujo;

public class EjercicioCondicionales1 {

	public static void main(String[] args) {
		int edad = 17;
		
		if(edad <= 39 && edad >= 18) {
			System.out.println("Eres joven.");
		}
		
		else if(edad <= 17) {
			System.out.println("Eres menor de edad;");
		}
		
		else if(edad >= 40 && edad <= 64) {
			System.out.println("Eres maduro.");
		}
		
		else if(edad > 64) {
			System.out.println("Cuidate.");
		}

	}

}
