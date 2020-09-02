package main;

import main.ListaEnlazada;

public class ListaEnlazadaOrdenada extends ListaEnlazada {
	
	public ListaEnlazadaOrdenada() {
		super();
	}
	
	public ListaEnlazadaOrdenada insertarOrden(int dato) {
		Nodo nuevo;
		nuevo = new Nodo(dato); //primero
		if(primero == null) 
			primero = nuevo;
		else if(dato < primero.getDato()) { //nodoa = 1 nodob = 3
			nuevo.setRef(primero);
			primero = nuevo;
		}else { //nodoa = 10 nodob= 5
			Nodo anterior,primeroO;
			anterior = primeroO = primero;
			while((primeroO.getRef()!=null) && dato>primeroO.getDato()) {
				anterior = primeroO;
				primeroO = primeroO.getRef();
			}
			if(dato>primeroO.getDato())
				anterior = primeroO;
			
			nuevo.setRef(anterior.getRef());
			anterior.setRef(nuevo);
		}
		
		return this;
	}

}
