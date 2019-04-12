package com.ipartek.formacion.proyecto.pojo;

public class Animal {
	// atributos
	private String nombre;
	private String raza;
	private float peso;

	// constructores
	public Animal() {
		this.nombre = "NULL";
		this.raza = "Cruce";
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

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String sonido() {
		return ".......Sin sonido......";
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso + ", sonido=" + sonido() + "]";
	}

}
