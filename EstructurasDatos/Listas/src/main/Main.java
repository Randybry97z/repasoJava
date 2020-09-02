package main;

//import main.ListaEnlazada;
import main.ListaEnlazadaOrdenada;

public class Main {

	public static void main(String[] args) {
		ListaEnlazadaOrdenada lista = new ListaEnlazadaOrdenada();
		lista.insertarOrden(1);
		lista.insertarOrden(4);
		lista.insertarOrden(10);
		lista.insertarOrden(2);
		lista.insertarOrden(5);
		lista.insertarOrden(8);
		lista.verLista();

	}

}
