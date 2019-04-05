package com.ipartek.formacion.proyecto.variables;

import java.util.Scanner;

public class EjemploVariables {

	public static void main(String[] args) {
		String nombre = "nombre";
		String calle = "calle";
		int edad = "99";
		int portal = "99";
		String Casado = 'N';
		int hijos = "99";
		float sueldo = "9999";
		String letraPiso = "A";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		System.out.println("Edad: ");
		edad = sc.nextInt();
		System.out.println("Casado (N/S): ");
		Casado = sc.nextLine();
		System.out.println("Num hijos: ");
		hijos = sc.nextInt();
		System.out.println("Sueldo: ");
		sueldo = sc.nextFloat();
		System.out.println("Calle: ");
		calle = sc.nextLine();
		System.out.println("Portal: ");
		portal = sc.nextInt();
		System.out.println("Letra del piso: ");
		letraPiso = sc.nextLine();
		
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Casado: " + Casado);
		if("s".equalsIgnoreCase(Casado)) {
			System.out.println("Si.");
		}
		else {
			System.out.println("No.");
		}
		System.out.println("Num hijos: " + hijos);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Calle: " + calle);
		System.out.println("Portal: " + portal);
		System.out.println("Letra del piso: " + letraPiso);

	}

}
