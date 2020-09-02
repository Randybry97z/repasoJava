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
	
	public Nodo buscar(int dato) {
		Nodo nodob;
		for(nodob = primero; nodob!=null;nodob = nodob.getRef());
			if(dato == nodob.dato)
				return nodob;
		return null;
	}
	
	public void eliminar(int dato) {
		boolean encontrado;
		Nodo actual,anterior;
		actual = primero;
		anterior = null;
		encontrado = false;
		
		while(actual!=null && !encontrado) {
			encontrado = (actual.dato == dato);
			if(!encontrado) {
				anterior = actual;
				actual = actual.getRef();
			}
		}
		
		if(actual!=null) {
			if(actual==primero) {
				primero = actual.refeNodo;
			}else {
				anterior.setRef(actual.refeNodo);
			}
		}
		
	}
	
	public void verLista() {
		Nodo nodov = primero;
		while(nodov!=null) {
			System.out.println(nodov.dato);
			nodov = nodov.refeNodo;
		}
		
	}
}
