package main;

public class Cola {
	Nodo primero,ultimo;
	int size;
	
	public Cola() {
		primero = ultimo = null;
		size = 0;
	}
	
	public boolean empty() {
		return primero == null;
	}
	
	public void insert(int dato) {
		Nodo nuevo = new Nodo(dato);
		if(empty()) {
			primero = nuevo;
		}else {
			ultimo.siguiente = nuevo;
		}
		ultimo = nuevo;
		size++;
	}
	
	public int delete() {
		int tmp = primero.dato;
		primero = primero.siguiente;
		size--;
		return tmp;
	}
	
	public int inicio() {
		return primero.dato;
	}
	
	public int size() {
		return size;
	}
	
	
	
}
