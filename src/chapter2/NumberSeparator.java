package chapter2;

import java.util.Scanner;

public class NumberSeparator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number,
			firstDigit = 999,
			secondDigit,
			thirdDigit,
			fourthDigit,
			fifthDigit;
		
		System.out.print("Enter a five digit number: ");
		number = input.nextInt();
		
		firstDigit = number % 10;
		number = number / 10;
		secondDigit = number % 10;
		number = number / 10;
		thirdDigit = number % 10;
		number = number / 10;
		fourthDigit = number % 10;
		number = number / 10;
		fifthDigit = number % 10;
			
		System.out.print(" " + fifthDigit);
		System.out.print(" " + fourthDigit);
		System.out.print(" " + thirdDigit);
		System.out.print(" " + secondDigit);
		System.out.print(firstDigit);
		
	}

}
