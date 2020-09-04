package main;

public class Pila {
	private Nodo ultimo;
	int size;
	
	public Pila() {
		ultimo = null;
		size = 0;
	}
	
	public boolean empty() {
		return ultimo == null;
	}
	
	public void push(int dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = ultimo;
		ultimo = nuevo;
		size++;
	}
	
	public int pop() {
		int tmp = ultimo.dato;
		ultimo = ultimo.siguiente;
		size--;
		return tmp;
	}
	
	public int peek() {
		return ultimo.dato;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		while(!empty()) {
			pop();
		}
	}

}
