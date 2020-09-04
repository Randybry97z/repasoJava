package main;

public class Nodo {
	int dato;
	Nodo hijoI,hijoD;
	
	public Nodo(int dato) {
		this.dato = dato;
		hijoD = hijoI = null;
	}
	
	public String toString() {
		return "dato: "+dato;
	}
}
