package ar.edu.unlu.main;
import java.awt.Menu;
import java.util.ArrayList;
import java.util.Stack;

import ar.edu.unlu.controlador.Controlador;
import ar.edu.unlu.controlador.Observable;
import ar.edu.unlu.modelo.Carta;
import ar.edu.unlu.modelo.Jugador;
import ar.edu.unlu.modelo.Mazo;
import ar.edu.unlu.modelo.Mesa;
import ar.edu.unlu.modelo.TipoEnano;
import ar.edu.unlu.vista.Observer;
import ar.edu.unlu.vista.Ventana1;
import ar.edu.unlu.vista.Ventana2;

public class Game implements Observable {
	private int ronda;
	private int turno;
	
	
	private ArrayList<Jugador> players;
	private ArrayList<Observer> observadores; 


	public Game() {
		players = new ArrayList<>();
		observadores = new ArrayList<>();
		
		
	}


	public ArrayList<Observer> getObservadores() {
		return observadores;
	}


	public void setObservadores(ArrayList<Observer> observadores) {
		this.observadores = observadores;
	}


	public ArrayList<Jugador> getPlayers() {
		return players;
	}


	public void setPlayers(ArrayList<Jugador> players) {
		this.players = players;
	}

	
	public void añadirJugador(String nombre1, String nombre2, String nombre3) {
		Jugador jugador1 = new Jugador(nombre1, TipoEnano.MINERO, 0);
		Jugador jugador2 = new Jugador(nombre2, TipoEnano.MINERO, 0);
		Jugador jugador3 = new Jugador(nombre3, TipoEnano.SABOTEADOR, 0);
		this.players.add(jugador1);
		this.players.add(jugador2);
		this.players.add(jugador3);
		notificar("addPJs");
		
	}
	
	
	public Stack<Integer> obtenerCartasJugador() {
		int nroJugador = 1; //declaro el numero de jugador que deseo mostrar las cartas
		Jugador jugador ; //variable del jugador
		
		//a chequear
		Mazo mazo = new Mazo();
		//a chequear
		
		Stack<Integer> pila = new Stack<>();
		
		jugador = players.get(nroJugador);
		
		
		// a chequear
		jugador.extraerCartasMazo(mazo.getCartas()); //saco las cartas del mazo para mi jugador
		//a chequear 
		
		for (Carta mazoJugador : jugador.getCartasJugador()) {
			pila.push(mazoJugador.getNroCarta());
			
		}
		
		notificar("obtenerCards");
		
		return pila;
		
	}
	

	public static void main(String[] args) {
	
		Game game = new Game();
		Ventana1 ventanaMenu = new Ventana1();
		Ventana2 ventanaJuego = new Ventana2();
		
		Controlador controlador = new Controlador();
		
		game.observadores.add(ventanaJuego);
		game.observadores.add(ventanaMenu);
		
		
		controlador.inicializarMazo();
		ventanaMenu.setVisible(true);

		
		
	}


	@Override
	public void add(Observer observer) {
		this.observadores.add(observer);
	}


	@Override
	public void remove(Observer observer) {
		this.observadores.remove(observer);
		
	}

	@Override
	public void notificar(String message) {
		
		if (message == "addPJs") {
			for(Observer o: observadores) {
				o.update("addPJs");
			}
		 }
		
		if(message == "obtenerCards") {
			 for(Observer observer: observadores) {
		            observer.update("obtenerCards");
		        }
		}
		
		
		
		
	}




	

}
