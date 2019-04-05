package com.ipartek.formacion.proyecto.variables.operadores.aritmeticos;

import java.util.Scanner;

public class ConversorEuros {

	public static void main(String[] args) {
		int monedaOpc = 0;
		final float VALOR_DOLAR = (float)1.12;
		final float VALOR_BITCOIN = (float)4423;
		final float VALOR_YEN = (float)0.0080;
		float euros = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuantos euros tienes?");
		
		euros = sc.nextFloat();	//Igualar a la variable
		
		/*System.out.println("Tienes " + euros * VALOR_DOLAR + "$");*/
		
		System.out.println("¿A que moneda quieres convertir? (1->Dolar 2->Bitcoin 3->Yen)");
		
		monedaOpc = sc.nextInt();		
		do {
			if(monedaOpc == 1) {
				System.out.println("Tienes " + euros * VALOR_DOLAR + " $");
			}
			
			else if(monedaOpc == 2) {
				System.out.println("Tienes " + euros * VALOR_BITCOIN + " Bitcoins");
			}
			
			else if(monedaOpc == 3) {
				System.out.println("Tienes " + euros * VALOR_YEN + " Yenes");
			}
		while(monedaOpc < 1 && monedaOpc > 3);
		sc.close();

	}

}
