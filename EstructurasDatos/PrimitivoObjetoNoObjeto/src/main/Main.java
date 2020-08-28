package main;
public class Main {

	public static void main(String[] args) {
		//INMUTABILIDAD
		String s1 = "Hola";
		String s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		s1 = "Hello";
		System.out.println(s1);
		System.out.println(s2);
	}
}
