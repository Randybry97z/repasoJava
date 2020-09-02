package main;

//import java.util.Scanner;

public class Main {
	
	//Con ARRAYS sí se trabaja con la referencia a diferencia de las variables
	public static void modificar(int num[]) {
		num[0] = 111;
	}
	
	public static void main(String[] args) {
		// ARREGLOS []
		
		//UNIDIMENSIONALES / VECTORES
		/*
		 * int arr[] = new int[10]; 
		 * for(int i = 0; i < 10; i++) { 
		 * arr[i] = i;
		 * System.out.println(arr[i]);
		 *  }
		 * 
		 * System.out.println(arr.length);
		 */
		
		//MATRIZ / BIDIMENSIONALES
		/*
		 * Scanner scanner = new Scanner(System.in); int x = scanner.nextInt(); int y =
		 * scanner.nextInt(); int matrix[][] = new int[x][y]; int n;
		 * 
		 * for(int i=0; i<x;i++) { for(int j=0; j<y;j++) { n =
		 * (int)(Math.random()*1000); matrix[i][j] = n; } }
		 * 
		 * for(int i=0; i<x;i++) { for(int j=0; j<y;j++) {
		 * System.out.println(matrix[i][j]); } }
		 */
		
		//MAS DE DOS DIMENSIONES
		/*
		 * int x = 3; int y = 3; int z = 3; String cubo[][][] = new String[x][y][z];
		 * for(int i=0;i<x;i++) { for(int j=0;j<y;j++) { for(int k=0;k<z;k++) {
		 * cubo[i][j][k] = String.valueOf(i) + String.valueOf(j) + String.valueOf(k); }
		 * } }
		 * 
		 * for(int i=0;i<x;i++) { for(int j=0;j<y;j++) { for(int k=0;k<z;k++) {
		 * System.out.println(cubo[i][j][k]); } } }
		 */
		
		//ARRAYS COMO PARAMETRO
		int num[] = {1,2,3,4};
		modificar(num);
		System.out.println(num[0]);

	}

}
