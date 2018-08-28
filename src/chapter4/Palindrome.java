package chapter4;

import java.util.Scanner;
//complete and functional
public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int digit0;
		int digit1;
		int digit3;
		int digit4;
		System.out.println("Enter your number to check (5 digits): ");
		number = input.nextInt();
				
		while (number < 9999 || number > 100000){
			System.out.println("Error, please enter a 5 digit number: ");
			number = input.nextInt();
		}
		digit0 = number % 10;
		digit1 = (number / 10) % 10;
		digit3 = (number / 1000) %10;
		digit4 = (number / 10000) %10;			
		
		if (digit4 == digit0){
			if (digit3 == digit1){
				System.out.println("It is Palindrome");
			}
		}
		
	}

}
