package com.ipartek.formacion.proyecto.pojo;

//import java.util.Scanner;

public class Perro extends Animal {
	// atributos
	private boolean vacunado;

	// constructores
	public Perro() {
	}

	public Perro(boolean vacunado) {
		super();
		this.vacunado = vacunado;
	}



	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	@Override
	public String toString() {
		return super.toString() + "Vacunado: " + isVacunado();
	}

	public String sonido() {
		return "Guau guau";
	}

	// métodos
	public void listarPerros(Perro dog[]) {
		Perro aux = new Perro();
		
		for (int i = 0; i < dog.length; i++) {
			if (dog[i].getNombre().charAt(0) > dog[i + 1].getNombre().charAt(0)) {
				aux = dog[i];
				dog[i] = dog[i + 1];
				dog[i] = aux;
			}
		}
	}
	
	/*
	public void crearPerros(Perro dog[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<dog.length; i++) {
			System.out.printf("Nombre: %s\nRaza: %s\nPeso: %s\n", dog[i].setNombre(), dog[i].setRaza(getRaza()), dog[i].setVacunado(vacunado), dog[i].setPeso(getPeso()));
		}
		
		sc.close();
	}
	*/
}
