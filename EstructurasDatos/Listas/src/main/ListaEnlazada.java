package main;

public class ListaEnlazada {
	protected Nodo primero;
	
	public ListaEnlazada() {
		primero = null;
	}
	
	public ListaEnlazada agregarInicio(int dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.refeNodo = primero;
		primero = nuevo;
		return this;
	}
	
	public void agregarFinal(int dato) {
		Nodo nuevoF = new Nodo(dato);
		nuevoF.refeNodo = null;
		
		if(primero==null) {
			primero = nuevoF;
			return;
		}
		Nodo tmp;
		for(tmp=primero;tmp.getRef()!=null;tmp=tmp.getRef()); 
			tmp.setRef(nuevoF);
		
	}
	
	public void buscar() {
		
	}
	
	public void eliminar() {
		
	}
	
	public void verLista() {
		Nodo nodov = primero;
		while(nodov!=null) {
			System.out.println(nodov.dato);
			nodov = nodov.refeNodo;
		}
		
	}
}
