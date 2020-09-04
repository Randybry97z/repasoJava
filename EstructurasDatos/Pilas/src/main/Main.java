package main;

public class Main {

	public static void main(String[] args) {	
		PilaO pila = new PilaO();
		pila.push("hhh");
		pila.push(2);
		pila.push(true);
		pila.push(2.2f);
		pila.pop();
		while(!pila.empty()) {
			System.out.print(pila.pop());
		}

	}

}
