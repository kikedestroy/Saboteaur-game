package ar.edu.unlu.modelo;

import java.util.ArrayList;


public class Jugador {
	private String nombre ;
	private TipoEnano enano;
	private int pepitasDeOro;
	
	private ArrayList<Carta> cartasJugador = new ArrayList();
	
	
	public Jugador(String nombre, TipoEnano enano, int pepitasDeOro) {
		super();
		this.nombre = nombre;
		this.enano = enano;
		this.pepitasDeOro = pepitasDeOro;
	}
	
	
	public void extraerCartasMazo(ArrayList<Carta> cartas) { //creo mazo jugador
			
			for (int i = 1; i <= 6; i++) {
				cartasJugador.add(cartas.get(i));
				cartas.remove(i);
			}
			
		}
	


	public ArrayList<Carta> getCartasJugador() {
		return cartasJugador;
	}

	public void setCartasJugador(ArrayList<Carta> cartasJugador) {
		this.cartasJugador = cartasJugador;
	}

	@Override
	public String toString() {
		return "Jugador [cartasJugador=" + cartasJugador + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPepitasDeOro() {
		return pepitasDeOro;
	}
	public void setPepitasDeOro(int pepitasDeOro) {
		this.pepitasDeOro = pepitasDeOro;
	}
	
	
	

	
	
	
	
	

}
