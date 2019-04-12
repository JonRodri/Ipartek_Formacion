package com.ipartek.formacion.proyecto.pojo;

public class Perro extends Animal {
	// atributos
	private boolean vacunado;

	// constructores
	public Perro() {
		super();
		this.vacunado = false;
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

	// otros metodos
	/*
	 * public void comparaFortaleza(Perro Odie, Perro Pluto, Perro AyteDeSanta,
	 * Perro Scooby) { if (Scooby.getPeso() > Odie.getPeso() && Scooby.getPeso() >
	 * Pluto.getPeso() && Scooby.getPeso() > AyteDeSanta.getPeso()) {
	 * System.out.println("#1 Scooby"); } }
	 */
	public static void comparaFortaleza(Perro[] perros) {

	}

}
