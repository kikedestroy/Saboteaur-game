package ar.edu.unlu.controlador;



import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;


import ar.edu.unlu.main.Game;
import ar.edu.unlu.modelo.Carta;
import ar.edu.unlu.modelo.Jugador;
import ar.edu.unlu.modelo.Mazo;
import ar.edu.unlu.modelo.Mesa;


public class Controlador{
	
	Mesa mesa = new Mesa();
	Game game = new Game();
	Mazo mazo = new Mazo();
	
	public void mostrarEnTablaMatrizEntera(JTable table) {
		mesa.inicializarMatriz(mesa.getTunel());
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j < 9; j++) {
				table.setValueAt(mesa.getTunel()[i][j], i, j);			
			}
		}
	}
		
	public void agregarJugador(JTextField texto1,JTextField texto2,JTextField texto3,JLabel notificacion) {
		game.añadirJugador(texto1.getText(), texto2.getText(),texto3.getText());
		notificacion.setVisible(true);
		
		
	}
	
	
	public void mostrarJugadores(JTextPane jPane) {
		String concat = "";
		for (Jugador jugadores : game.getPlayers()) {
			concat = concat +"\n"+ jugadores.getNombre();
			
		}
		jPane.setText(concat);
	}

	
	
	
	public void inicializarMazo() {
		mazo.crearMazo();
		mazo.mezclar();
		
	}


	

	
	public void mostrarCartasJugador(JButton c1,
			JButton c2,JButton c3,JButton c4,JButton c5,JButton c6) {
		
		while(!game.obtenerCartasJugador().empty()) {
			switch (game.obtenerCartasJugador().pop()) {
			case 1:
				c1.setVisible(true);
				break;
			case 2:
				c2.setVisible(true);
				break;
			case 3:
				c3.setVisible(true);
				break;
			case 4:
				c4.setVisible(true);
				break;
			case 5:
				c5.setVisible(true);
				break;
			case 6:
				c6.setVisible(true);
				break;
	
			default:
				break;
			}
			
		}
				
	}

	
	//falta implementar
public void obtenerPosicionTable(int x, int y ,Carta c) {
	mesa.validacionPosicion(x, y, c);
}

	


		
}

	
	
	

