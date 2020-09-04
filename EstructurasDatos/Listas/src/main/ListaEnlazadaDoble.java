package main;

import main.NodoD;

public class ListaEnlazadaDoble {
	NodoD primero,ultimo;
	int size;
	
	public ListaEnlazadaDoble() {}
	
	public void agregar(int dato) {
		NodoD nuevo = new NodoD(dato);
		
		if(size == 0) {
			primero = ultimo = nuevo;
		}else {
			nuevo.atras = ultimo;
			ultimo.adelante = nuevo;
			ultimo = nuevo;
		}
		size++;
	}
	
	public void agregarInicio(int dato) {
		NodoD nuevo = new NodoD(dato);
		 if(size == 0) {
			 primero = nuevo;
			 ultimo = nuevo;
		 }else {
			 nuevo.adelante = primero;
			 primero.atras = nuevo;
			 primero = nuevo;
		 }
		 size++;
	}
	
	public boolean eliminar() {
		if(size>0) {
			if(tamaño()==1) {
				primero = null;
				ultimo = null;
			}else {
				ultimo.atras.adelante = null;
				ultimo = ultimo.adelante = null;
			}
			size--;
		}
		return false;
	}
	
	public boolean eliminarInicio() {
		if(size>0) {
			if(tamaño()==1) {
				primero=null;
				ultimo=null;
			}else {
				primero.adelante.atras=null;
				primero = primero.adelante;
			}
		}
		return false;
	}
	
	public void verLista() {
		NodoD nodov;
		nodov = primero;
		while(nodov != null) {
			System.out.println(nodov.dato);
			nodov= nodov.adelante;
		}
	}
	
	public int tamaño() {
		return size;
	}
	
	public boolean vacio() {
		return tamaño() == 0;
	}
}
