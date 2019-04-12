package com.ipartek.formacion.proyecto.ejercicios;

public class Alumno {

	// atributos PRIVADOS
	private String nombre;
	private String apellido;
	private float nota;

	// constructor -> Ahora para crear un alumno hay que pasarle obligatoriamente
	// los 3 campos

	public Alumno() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.nota = 0;
	}

	public Alumno(String nombre, String apellido, float nota) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.setNota(nota);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {

		if (nota < 0 || nota > 10) {
			this.nota = 0;
		} else {
			this.nota = nota;
		}
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + "]";
	}

}
