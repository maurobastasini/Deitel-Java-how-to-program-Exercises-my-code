package chapter6;

import java.util.Scanner;
//done done
public class SeparatingDigits {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter the number (0 to finish): ");
			number = input.nextInt();
			displayDigits(number);
			
		}while(number > 0);
		
		System.out.print("**** Thanks for use my app :) ****");

	}
	
	public static int quotient(int number1, int number2){
		return number1 / number2;
		
	}
	
	public static int remainder(int number1, int number2){
		return number1 % number2;
		
	}
	
	
	public static void displayDigits(int number){
		
		int[] numVal = new int[String.valueOf(number).length()];
		
		for(int i = (numVal.length - 1); i >= 0; i--){
			
			numVal[i] = remainder(number, 10);
			number = quotient(number, 10);
		}
		
		for(int i = 0; i < numVal.length; i++){
			
			System.out.printf("%d ", numVal[i]);
		}
		
		System.out.println();
		
		
	}

}
