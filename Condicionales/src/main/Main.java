package main;

public class Main {

	public static void main(String[] args) {
		// CONDICIONES
//		//if if-else
//		
//		String colorLuz = "rose";
//		
//		if(colorLuz.equals("Verde")) {
//			System.out.println("Continua...");
//		}else if(colorLuz.equals("Amarillo")) {
//			System.out.println("Alto parcial...");
//		}else if(colorLuz.equals("Rojo")) {
//			System.out.println("Alto total!");
//		}
//		else {
//			System.out.println("Color no válido");
//		}
		
		//Scope
//		int promedio = 10;
//		
//		if (promedio > 7) {
//			String mensaje = "Felicidades tu promedio es de "+ promedio;
//			
//			if (promedio == 10) {
//				System.out.println(mensaje);
//			}
//		}
//		//System.out.println(mensaje);
		
		//Switch
//		String colorLuz = "Rojo";
//		switch (colorLuz) {
//		case "Verde":
//		case "verde":
//			System.out.println("Continue");
//			break;
//		case "Amarillo":
//		case "amarillo":
//			System.out.println("Cuidado");
//			break;
//		case "Rojo":
//		case "rojo":
//			System.out.println("Alto");
//			break;
//		default:
//			System.out.println("Color no válido");
//			break;
//		}
		
		//While
//		int contador = 0;
//		int numero = 123;
//		
//		while(numero > 0) {
//			numero = numero / 10;
//			contador++;
//		}
//		System.out.println("El número posee " + contador + " dígitos");
		
		//Do While
//		int contador = 0;
//
//		do {
//			System.out.println(contador);
//			contador++;
//		}while(contador < 10);
		
		//For
//		int num = 8;
//		for(int i = 1; i <= 10; i++) {
//			int res = num*i;
//			System.out.println(" " + num + " x " + i +" = " + res);
//		}
		for(int i=1, heigth=5; i<=heigth;i++){
        for(int range=heigth-i;range>0;range--) System.out.print(" ");
            for(int star=1;star<2*i;star++) System.out.print("*");
          System.out.println();
        }

	}

}
