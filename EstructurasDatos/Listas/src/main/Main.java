package main;

import main.ListaEnlazada;

public class Main {

	public static void main(String[] args) {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregarInicio(1);
		lista.agregarInicio(2);
		lista.agregarInicio(3);
		lista.agregarInicio(4);
		lista.agregarFinal(5);
		//lista.eliminar(3);
		lista.buscar(2);
		lista.verLista();

	}

}
