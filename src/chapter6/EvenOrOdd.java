package chapter6;

import java.util.Scanner;
//complete and functional
public class EvenOrOdd {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter number 1 (0 to finish): ");
			num1 = input.nextInt();
			if (num1 > 0){
				if (isEven(num1)){
					System.out.printf("The number %d is even.%n", num1);
				}else{
					System.out.printf("The number %d is odd.%n", num1);
				}

			}
			
			
		}while(num1 > 0);
		
		System.out.println("**** Thanks for use my app :) ****");
		

	}
	
	public static boolean isEven(int number1){
		
		if (number1 % 2 == 0)		return true;
		else	return false;
	}
}
