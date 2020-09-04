package main;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
//		ArbolBinario arbol = new ArbolBinario();
//		
//		arbol.insertar(1);
//		arbol.insertar(10);
//		arbol.insertar(7);
//		arbol.insertar(5);
//		arbol.insertar(8);
//		arbol.ver(arbol.raiz);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(1);
		treeSet.add(10);
		treeSet.add(7);
		treeSet.add(5);
		treeSet.add(8);
		for(Iterator<Integer> i = treeSet.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}
}
