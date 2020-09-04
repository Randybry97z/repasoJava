package main;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo rectangulo = new Rectangulo(10,20);
		Triangulo triangulo = new Triangulo(10,5);
		
		Presentacion presentacion = new Presentacion();
		
		presentacion.area(rectangulo);
		presentacion.area(triangulo);
		
		//OPEN/CLOSED
		//Abierto a la extensión pero cerrado a la modificación
		//SE IMPLEMENTÓ INTERFACE PARA OCUPAR EL PRINCIPIO
		
		//SUSTITUCION DE LISKOV
		//Los subtipos deben ser sustituibles por sus tipos base
		/*
		 * Jaguar yagua = new Jaguar()
		 * Felino yagua = new Jaguar()
		 * De estas dos formas se debe poder implementar la clase
		*/
		
		//SEGREGACIÓN DE INTERFACES
		/*
		 * Los clientes no deben ser forzados a metodos que no usen
		 * 
		 * IFelino yagua = new Jaguar(10,120f);
		 * yagua.cazar();
		 * 
		 * IFelino(){
		 *	void cazar();
		 * }
		 * 
		 * IFelinoSalvaje() extends IFelino{
		 * 	void rugir();
		 * }
		 * 
		 * IFelinoCasero() extends IFelino{
		 *	void maullar();
		 * }
		 * 
		*/
		
		//INVERSIÓN DE DEPENDENCIAS
		//Las entidades deben de depender de abstracción y no de concreción

	}

}
