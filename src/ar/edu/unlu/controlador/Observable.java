package ar.edu.unlu.controlador;

import ar.edu.unlu.vista.Observer;

public interface Observable {
		public void add(Observer observer);
	    public void remove(Observer observer);
	    public void notificar(String message);
}
