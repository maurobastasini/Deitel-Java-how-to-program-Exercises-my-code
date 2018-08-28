package chapter6;

import java.util.Scanner;
//complete and functional
public class DisplayingSquareOfAsterisk {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int side;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter the side of the square: ");
			side = input.nextInt();
			if (side > 0){
				squareOfAsterisks(side);
			}
			
		}while(side > 0);
		
		System.out.println("**** Thanks for use my app :) ****");

	}
	
	public static void squareOfAsterisks(int side){
		
		for (int i = 0; i < side; i++){
			for (int j = 0; j < side; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
