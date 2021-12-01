package ar.edu.unlu.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unlu.modelo.*;
import ar.edu.unlu.vista.Observer;

public class GameConsola implements Observer {
	private int ronda;
	private int turno;

	private ArrayList<Jugador> players;
	private Mesa mesa;

	
	//Constructor de Game 
	public GameConsola() {
		players = new ArrayList<>();
		mesa = new Mesa();
	}

	
	// PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		//GameConsola Saboteur = new GameConsola();
	//	Saboteur.comenzarJuego();

	}

	
	//Lector de opciones
	private void comenzarJuego() {		int opcion = 1;
		while (opcion != 0) {
			opcion = MostrarMenu();
			switch (opcion) {
			case 1:
				
				String[] arregloString = new String[3]; 
				arregloString = agregarJugadores();
				
				for (int i = 0;  i < arregloString.length; i++) {
					players.add(new Jugador(arregloString[i], null, opcion));	
				}
				
				generarEspacio();
				break;
				
			case 2:
				//mostrar jugadores con cantidad de pepitas
				mostrarJugadores();
				generarEspacio();
				break;
			case 3:
				//mostrar ranking de ganadores
				break;
			case 4:
				//mostrar manual del juego
				break;
			case 5:
				jugar();
				break;
		}
			
			
		}
		System.exit(0);

	}
	
	private int MostrarMenu() {
		int opcion = -1;
		while (opcion < 0 || opcion > 3) {

			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			
			System.out.println
			("\r\n" + "░██████╗░█████╗░██████╗░░█████╗░████████╗███████╗██╗░░░██╗██████╗░\r\n"
					+ "██╔════╝██╔══██╗██╔══██╗██╔══██╗╚══██╔══╝██╔════╝██║░░░██║██╔══██╗\r\n"
					+ "╚█████╗░███████║██████╦╝██║░░██║░░░██║░░░█████╗░░██║░░░██║██████╔╝\r\n"
					+ "░╚═══██╗██╔══██║██╔══██╗██║░░██║░░░██║░░░██╔══╝░░██║░░░██║██╔══██╗\r\n"
					+ "██████╔╝██║░░██║██████╦╝╚█████╔╝░░░██║░░░███████╗╚██████╔╝██║░░██║\r\n"
					+ "╚═════╝░╚═╝░░╚═╝╚═════╝░░╚════╝░░░░╚═╝░░░╚══════╝░╚═════╝░╚═╝░░╚═╝");
			System.out.println("");

			System.out.println("                      	      MENÚ                               ");
			System.out.println("*************************** Opciones ****************************");
			System.out.print(" 1 = Agregar jugador@s");
			System.out.println("  [ Deben ser tres (3) ]");
			System.out.println(" 2 = Mostrar jugador@s");
			System.out.println(" 3 = Mostrar RANKING ganador@s");
			System.out.println(" 4 = Ver Manual del juego");
			System.out.println(" 5 = JUGAR ");
			System.out.println("");
			System.out.println(" 0 = Salir del juego");
			System.out.println("");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

			Scanner sc = new java.util.Scanner(System.in);

			System.out.print("Ingrese una opción : ");
			opcion = sc.nextInt();

		}

		return opcion;

	}

	

	private void jugar() {
		
	}
	
	public void generarEspacio() {
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}
	}
	

	private void mostrarJugadores() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("                      	      Lista de Jugadores                   ");
		for (Jugador p : players) 
			System.out.println("- " + p.getNombre());
		esperarEnter();
	}
	
	
	private void esperarEnter() {
		System.out.println("Presione ENTER para continuar...");
		Scanner sc = new java.util.Scanner(System.in);
		String pausa = sc.nextLine();

	}
	

		
	
	private String[] agregarJugadores() {
		String jugadoreString[] = new String[3];
		String nombre = null;
		int cont = 0;
		System.out.println("                     	AGREGANDO JUGADOR                              ");
		while(cont < 3 ) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println((cont+1) + " JUGADOR ");
			System.out.print(" Nombre : ");
			nombre = scanner.nextLine();
			jugadoreString[cont] = nombre;
			
			cont ++;
		}
		return jugadoreString;
	}
	
	
	private String agregarJugador() {
		String nombre = "";
		System.out.println("                     	AGREGANDO JUGADOR                              ");
		while(nombre.equals("")) {
			Scanner scanner = new Scanner(System.in);
			System.out.print(" Nombre : ");
			nombre = scanner.nextLine();
			
		}
		return nombre;
	}
	

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub

	}

}
