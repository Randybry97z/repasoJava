package main;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// VECTORES
		
		//Por defecto su longitud es de 10
		Vector vector = new Vector(/*initialCapacity*/10,/*incrementCapacity*/5);
		vector.add("he");
		vector.add("Hola");
		vector.insertElementAt(/*obj*/"jj", /*index*/1);
		System.out.println(vector);
		vector.remove("he");
		System.out.println(vector);
		System.out.println(vector.elementAt(0));
	}

}
