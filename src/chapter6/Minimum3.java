package chapter6;

import java.util.Scanner;

public class Minimum3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num1,
				num2,
				num3;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter number 1: ");
			num1 = input.nextDouble();
			if(num1 != -1000){
				System.out.print("Enter number 2: ");
				num2 = input.nextDouble();
				System.out.print("Enter number 3: ");
				num3 = input.nextDouble();
				
				System.out.printf("Numbers: %.2f %.2f %.2f. Minimum: %.2f%n",
						num1, num2, num3, minimum(num1,num2,num3));
			}
			
			
		}while(num1 != -1000);
		
		System.out.println("**** Thanks for use my app :) ****");
				
	}
	
	public static double minimum(double number1, double number2, double number3){
		
		return Math.min(Math.min(number1, number2), number3);
		
	}
}
