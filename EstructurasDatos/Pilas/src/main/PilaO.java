package main;

import java.util.ArrayList;

public class PilaO {
	private ArrayList<Object> pila = new ArrayList<>();
	
	public void push(Object element) {
		pila.add(element);
	}
	
	public Object pop() {
		if (!pila.isEmpty()) {
			Object tmp = pila.get(pila.size()-1);
			pila.remove(pila.size()-1);
			return tmp;
		}else {
			return null;
		}
	}
	
	public boolean empty() {
		return pila.isEmpty();
	}
}
