package main;

public class Main {

	public static void main(String[] args) {
		// String = Clase
		
//		String mensaje = "Hola, soy una cadena ";
//		System.out.println(mensaje);

		// MÉTODOS
		
//		//Longitud
//		int cantidad = mensaje.length();
//		System.out.println(cantidad);
//		
//		//Contains
//		boolean res = mensaje.contains("Hola");
//		System.out.println(res);
//		
//		//Start with || end with
//		boolean inicia = mensaje.startsWith("Hola");
//		
//		boolean termina = mensaje.endsWith("v");
//		
//		System.out.println("Inicia: " + inicia + " ; " + "Termina: " + termina );
//
//		String cadena = mensaje.concat(" del curso de Java :v");
//		System.out.println(cadena);
		
//		//Uppercase && Lowercase
//		
//		System.out.println(mensaje.toUpperCase());
//		
//		System.out.println(mensaje.toLowerCase());
//		
//		//Trim
//		System.out.println(mensaje.trim());
//		
//		//Format
//		String curso = "Java";
//		float valor = 10.82935f;
//		//mensaje = String.format("Bienvenido al curso %s", curso);
//		mensaje = String.format("El total de %d artículos es: %.2f %s", 3, valor, "MXN");
//		System.out.println(mensaje);
//		System.out.printf("El total de %d artículos es: %.2f %s", 3, valor, "MXN");
		
		//COMPARAR CADENAS
		
		String cadena1 = "Hola";
		String cadena2 = "hola";
		
		//boolean resultado = cadena2.equals(cadena1);
		boolean resultado = cadena2.equalsIgnoreCase(cadena1);
		System.out.println(resultado);
		
		//Concat
		String curso = "Java";
		String mensaje = cadena1.concat(" bienvenido al curso de: ");
		System.out.println(mensaje.concat(curso));
	}

}
