package main;

//import main.ListaEnlazada;
//import main.ListaEnlazadaOrdenada;

public class Main {

	public static void main(String[] args) {
		ListaEnlazadaDobleCircular lista = new ListaEnlazadaDobleCircular();
		lista.agregar(1);
		lista.agregar(2);
		lista.agregar(3);
		lista.agregar(4);
		lista.agregar(5);
		lista.eliminar(2);
		lista.ver();

	}

}
