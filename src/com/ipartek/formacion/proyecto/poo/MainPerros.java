package com.ipartek.formacion.proyecto.poo;

public class MainPerros {

	public static void main(String[] args) {
		Perro Scooby = new Perro();
		Perro Pluto = new Perro();
		Perro AyteDeSanta = new Perro();
		Perro Odie = new Perro();
		//Perro[] dog = new Perro[4];
		
		Odie.setNombre("Odie");
		Odie.setRaza("");
		Odie.setVacunado(true);
		Odie.setPeso(15);
		
		AyteDeSanta.setNombre("Ayudante de Santa");
		AyteDeSanta.setRaza("");
		AyteDeSanta.setVacunado(false);
		AyteDeSanta.setPeso(10);
		
		Pluto.setNombre("Pluto");
		Pluto.setRaza("");
		Pluto.setVacunado(false);
		Pluto.setPeso(30);
		
		Scooby.setNombre("Scooby Doo");
		Scooby.setRaza("Gran danes");
		Scooby.setVacunado(false);
		Scooby.setPeso(50);
		
		System.out.println("***Mostrando detalles de cada perro***");
		System.out.printf("Nombre: %s \nRaza: %s \nVacunado: %s \nPeso: %s \n\n", Odie.getNombre(), Odie.getRaza(), Odie.isVacunado(), Odie.getPeso());
		System.out.printf("Nombre: %s \nRaza: %s \nVacunado: %s \nPeso: %s \n\n", AyteDeSanta.getNombre(), AyteDeSanta.getRaza(), AyteDeSanta.isVacunado(), AyteDeSanta.getPeso());
		System.out.printf("Nombre: %s \nRaza: %s \nVacunado: %s \nPeso: %s \n\n", Pluto.getNombre(), Pluto.getRaza(), Pluto.isVacunado(), Pluto.getPeso());
		System.out.printf("Nombre: %s \nRaza: %s \nVacunado: %s \nPeso: %s \n\n", Scooby.getNombre(), Scooby.getRaza(), Scooby.isVacunado(), Scooby.getPeso());
		
		System.out.println("RANKING FORTALEZA");
		System.out.println("-----------------");
		//comparaFortaleza(Odie, Pluto, AyteDeSanta, Scooby);

	}

}
