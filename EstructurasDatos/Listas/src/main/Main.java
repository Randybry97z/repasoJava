package main;

//import main.ListaEnlazada;
//import main.ListaEnlazadaOrdenada;

public class Main {

	public static void main(String[] args) {
		ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
		lista.agregar(1);
		lista.agregar(2);
		lista.agregar(3);
		lista.agregarInicio(4);
		lista.verLista();

	}

}
