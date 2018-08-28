package chapter2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cantidadAsteriscos,
			cantidadFilas;
		
		System.out.print("Ingrese la cantidad de asteriscos: ");
		cantidadAsteriscos = input.nextInt();
		System.out.print("Ingrese la cantidad de filas: ");
		cantidadFilas = input.nextInt();
		
		for (int i = 0; i < cantidadFilas; i++){
			
			for (int j = 0; j < cantidadAsteriscos; j++){
				
				System.out.print("* ");
				
			}
			
			System.out.print("\n");
			if (i % 2 == 0){
				System.out.print(" ");
			}
			
			
		}
	}

}
