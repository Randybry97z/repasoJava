package main;

import java.util.Enumeration;
import java.util.Hashtable;
import main.Persona;

public class Main {

	public static void main(String[] args) {
		//<type k, type m> <key, value>
//		Hashtable<String, String> tabla = new Hashtable<String, String>();
//		tabla.put("Jose", "Mexicano");
//		tabla.put("Edgar", "Colombiano");
//		tabla.put("Diego", "Español");
		
		Persona p1 = new Persona("jose", 30);
		Persona p2 = new Persona("juan", 20);
		Persona p3 = new Persona("bryan", 23);
		
		Hashtable<String, Persona> tabla = new Hashtable<String, Persona>();
		tabla.put(p1.getName(), p1);
		tabla.put(p2.getName(), p2);
		tabla.put(p3.getName(), p3);
		
		String tmp;
		Enumeration<String> keys = tabla.keys();
		while(keys.hasMoreElements()) {
			tmp = keys.nextElement();
			System.out.println(tabla.get(tmp));
		}

	}
}
