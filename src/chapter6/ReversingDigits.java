package chapter6;

import java.util.Scanner;
//done done
public class ReversingDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter a number (0 to finish): ");
			number = input.nextInt();
			if (number != 0){
				
				System.out.printf("Number: %d and reversed: %d.%n",
						number, reverse(number));
				
			}
			
		}while(number != 0);
		
		System.out.print("**** Thanks for use my app :) ****");
		
	}
	
	public static int reverse(int number){
		String reversed = "";
		while(number != 0){
			reversed += number % 10;
			number /= 10;
		}
		return Integer.parseInt(reversed);
		
	}
	
	
}
