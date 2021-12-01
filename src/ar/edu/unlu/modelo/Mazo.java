package ar.edu.unlu.modelo;

import java.util.ArrayList;


public class Mazo{
	
	private ArrayList<Carta> cartas;
	
	public Mazo(){
		cartas = new ArrayList<>();
		
	}
	
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}


	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}


	public void crearMazo() { //creo 9 cartas para probar , pero en realidad son 26
		
		for (int i = 1; i <= 9; i++) {
		cartas.add(new Carta(i)); 
		}
	}
	
	public void mezclar() { // mezclo esas 9 cartas
		Carta carta = null ;
		for (int i = 0; i < cartas.size(); i++) {
			int random = (int) (Math.random()*cartas.size());
			carta = cartas.get(i);
			cartas.set(i, cartas.get(random));
			cartas.set(random, carta);
			
		}
	}
	

	@Override
	public String toString() {
		return "Mazo [cartas=" + cartas + "]";
	}
	

}
