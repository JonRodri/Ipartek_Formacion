package com.ipartek.formacion.proyecto.poo;

public class Perro {
	// atributos
	private String nombre;
	private String raza;
	private boolean vacunado;
	private float peso;

	// constructores
	public Perro() {
		super();
		this.nombre = "NULL";
		this.raza = "Cruce";
		this.vacunado = false;
		this.peso = 0;
	}

	// getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void comparaFortaleza(Perro Odie, Perro Pluto, Perro AyteDeSanta, Perro Scooby) {
		if(Scooby.getPeso() > Odie.getPeso() && Scooby.getPeso() > Pluto.getPeso() && Scooby.getPeso() > AyteDeSanta.getPeso()) {
			System.out.println("#1 Scooby");
		}
	}

}
