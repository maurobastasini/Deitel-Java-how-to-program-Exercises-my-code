package chapter6;

import java.util.Scanner;
//complete and functional
public class DisplayingSquareOfAnyCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int side;
		char character;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter the side of the square: ");
			side = input.nextInt();
			if (side > 0){
				System.out.print("Enter the character to fill the square: ");
				character = input.next().charAt(0);
				squareOfChar(side, character);
			}
			
		}while(side > 0);
		
		System.out.println("**** Thanks for use my app :) ****");

	}
	
	public static void squareOfChar(int side, char character){
		
		for (int i = 0; i < side; i++){
			for (int j = 0; j < side; j++){
				System.out.print(character);
			}
			System.out.println();
		}
	}

}
