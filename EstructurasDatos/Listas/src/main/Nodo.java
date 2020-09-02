package main;

public class Nodo {
	int dato;
	Nodo refeNodo;
	
	public Nodo(int data) {
		dato = data;
	}
	
	public int getDato() {
		return dato;
	}
	
	public void setRef(Nodo ref) {
		this.refeNodo = ref;
	}
	
	public Nodo getRef() {
		return refeNodo;
	}
}
