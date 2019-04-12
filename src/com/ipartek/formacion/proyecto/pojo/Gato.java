package com.ipartek.formacion.proyecto.pojo;

public class Gato extends Animal {
	// atributos
	private boolean vacunado;

	// constructores
	public Gato() {
		super();
		this.vacunado = false;
	}

	// getters & setters
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

}
