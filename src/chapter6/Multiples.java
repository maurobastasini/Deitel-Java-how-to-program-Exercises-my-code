package chapter6;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter number 1 (0 to finish): ");
			num1 = input.nextInt();
			if (num1 > 0){
				System.out.print("Enter number 2: ");
				num2 = input.nextInt();
				if (isMultiple(num1, num2)){
					System.out.printf("The number %d is multiple of the number %d.%n", num2, num1);
				}else{
					System.out.printf("The number %d is not a multiple of the number %d.%n", num2, num1);
				}

			}
			
			
		}while(num1 > 0);
		
		System.out.println("**** Thanks for use my app :) ****");
		

	}
	
	public static boolean isMultiple(int number1, int number2){
		
		if (number2 % number1 == 0)		return true;
		else	return false;
	}

}
