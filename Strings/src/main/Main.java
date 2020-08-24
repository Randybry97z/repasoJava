package main;

public class Main {

	public static void main(String[] args) {
		// String = Clase
		
		String mensaje = "Hola, soy una cadena ";
		System.out.println(mensaje);

		// MÉTODOS
		
		//Longitud
		int cantidad = mensaje.length();
		System.out.println(cantidad);
		
		//Contains
		boolean res = mensaje.contains("Hola");
		System.out.println(res);
		
		//Start with || end with
		boolean inicia = mensaje.startsWith("Hola");
		
		boolean termina = mensaje.endsWith("v");
		
		System.out.println("Inicia: " + inicia + " ; " + "Termina: " + termina );

		String cadena = mensaje.concat(" del curso de Java :v");
		System.out.println(cadena);
		
	}

}
