package ar.edu.unlu.modelo;

public class Mesa {
	
	static final int fila = 5;
	static final int columna = 9;
	
	 String [] [] tunel = new String [fila][columna];
	

	public String[][] getTunel() {
		return tunel;
	}




	public void setTunel(String[][] tunel) {
		this.tunel = tunel;
	}





	public void validacionPosicion( int x, int y , Carta c) {
		
		if (tunel[x][y] == ".") {
			switch(c.getNroCarta()) {
			case 1 :{
				
				tunel[x][y] = "╬"; //ocupado por posicion
				break;
			}
			case 2 :{
				tunel[x][y] = "║"; //ocupado por posicion
				tunel[x][y-1] = "f" ; //izquierda
				tunel[x][y+1] = "f" ; //derecha
				break;
			}
			case 3:{
				tunel[x][y] = "╗"; //ocupado por posicion
				tunel[x-1][y] = "f"; //arriba
				tunel[x][y+1] = "f" ; //derecha
				break;
			}
			case 4:{
				tunel[x][y] = "╔"; //ocupado por posicion
				tunel[x-1][y] = "f"; //arriba
				tunel[x][y-1] = "f" ; //izquierda
				break;
			}
			case 5:{
				tunel[x][y] = "╝"; //ocupado por posicion
				tunel[x+1][y] = "f"; //abajo
				tunel[x][y+1] = "f" ; //derecha
				break;
			}
			case 6:{
				tunel[x][y] = "╚"; //ocupado por posicion
				tunel[x+1][y] = "f"; //abajo
				tunel[x][y+1] = "f" ; //derecha
				break;
			}
			case 7:{
				tunel[x][y] = "╣"; //ocupado por posicion
				tunel[x][y+1] = "f" ; //derecha
				break;
			}
			case 8:{
				tunel[x][y] = "╠"; //ocupado por posicion
				tunel[x][y-1] = "f" ; //izquierda
				break;
			}
			
			case 9:{
				tunel[x][y] = "═"; //ocupado por posicion
				tunel[x-1][y] = "f"; //arriba
				tunel[x+1][y] = "f"; //abajo
				break;
			}
			
				
			}
		}
		
		
		
	} //fin de validacionPosicion
	
	public void imprimirMatriz(String [][] matriz) {
		for (int x=0; x < matriz.length ; x ++) {
			for (int y=0; y < matriz[x].length ; y++) {
				System.out.print(matriz[x][y] + "  ");
			}
			System.out.println("");
		}
		
		
		
	}//fin imprimirMatriz
	
	
	public void inicializarMatriz (String [][] matriz) {
		for (int x=0; x < matriz.length ; x ++) {
			for (int y=0; y < matriz[x].length ; y++) {
				matriz[x][y] = ".";
			}
		}//cierra incializarMatriz
				matriz[2][1] = "╬";
	}



	
	
}