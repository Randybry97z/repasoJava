package main;

public class NodoC {
	int dato;
	NodoC adelante, atras;
	
	public NodoC() {}
	
	public NodoC(int dato) {
		this.dato = dato;
		adelante = atras = null;
	}
	
	public int getDato() {
		return dato;
	}

}
