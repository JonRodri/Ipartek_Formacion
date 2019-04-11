package com.ipartek.formacion.proyecto.poo;

public class Persona {
	//atributos
	private String nombre;
	private String apellido;
	private int edad;
	private boolean isMayorEdad;

	//constructor
	public Persona() {
		super();
		this.nombre = "nombre";
		this.apellido = "apellido";
		this.edad = 0;
		this.isMayorEdad = false;
	}

	public boolean isMayorEdad() {
		return isMayorEdad;
	}

	public void setMayorEdad(boolean isMayorEdad) {
		this.isMayorEdad = isMayorEdad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*public String mayorEdad(boolean isMayorEdad) {
		String resp = isMayorEdad == true ? "Es mayor de edad" : "Eres un fresisuis todavia";
		
		return resp;
	}*/
	
}