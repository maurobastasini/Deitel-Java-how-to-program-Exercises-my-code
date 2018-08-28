package chapter6;

import java.util.Scanner;
//done done
public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1,
			num2;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter the first number (0 to finish): ");
			num1 = input.nextInt();
			if(num1 != 0){
				System.out.print("Enter the second number: ");
				num2 = input.nextInt();
				
				System.out.printf("First Number: %d, Second Number: %d, GCD: %d.%n",
						num1, num2, gcd(num1,num2));
			}
			
			
		}while(num1 != 0);
		
		System.out.println("**** Thanks for use my app :) ****");
	}
	
	
	public static int gcd(int number1, int number2){
		int remainder;
		
		do{
			if(number1 < number2){
				remainder = number2 % number1;
				if(remainder == 0){
					return number1;
				}
				number2 = remainder;
			}else{
				remainder = number1 % number2;
				if(remainder == 0){
					return number2;
				}
				number1 = remainder;
			}
			
		}while(remainder > 0);
		
		return remainder;
		
	}
}
