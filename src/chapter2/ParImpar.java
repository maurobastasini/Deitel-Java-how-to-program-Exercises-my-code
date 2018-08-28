package chapter2;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		java.util.Scanner input = new Scanner(System.in);
		int number1,
			number2;
		String result = "empty";
		
		System.out.print("Enter a number: ");
		number1 = input.nextInt();
		System.out.print("Enter a number: ");
		number2 = input.nextInt();
				
		if (number1 % number2 == 0){
			System.out.printf("%d is multiple of %d", number1, number2);
		}else{
			System.out.printf("%d is not multiple of %d", number1, number2);
		}
		

	}

}
