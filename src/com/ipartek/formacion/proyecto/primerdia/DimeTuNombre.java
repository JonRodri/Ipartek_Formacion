package com.ipartek.formacion.proyecto.primerdia;

import java.util.Scanner;	//Importamos la clase Scanner para poder recoger datos por pantalla.

public class DimeTuNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "";	//Inicializar siempre los valores.
		String resp = "";
		//Boolean rosas = false;
		
		Scanner sc = new Scanner(System.in);	//Crear objeto para recoger datos por pantalla.
		
		System.out.println("Dime tu nombre: ");
		nombre = sc.nextLine();	//Leemos el string por pantalla al pulsar enter.
		System.out.println("Ongi etorri " + nombre);	//Sacar por pantalla.
		System.out.println("Quieres un jardin de rosas? (Si/No)");
		resp = sc.nextLine();
		//TODO eso para cuando aprendas a usar condicionales
		//OPERADOR IGUALDAD (==) sólo válido para números. NO VALE en Strings.
		if("Si".equalsIgnoreCase(resp)) {	//equalsIgnoreCase ignora mayus y minus
			//rosas = true;
			System.out.println("Has pedido un jardin de rosas.");
		}
		else if("No".equalsIgnoreCase(resp)) {
			//rosas = false;
			System.out.println("No mereces vivir.");
		}
		
		
		sc.close(); //Cerramos el scanner.

	}
}
