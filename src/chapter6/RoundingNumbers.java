package chapter6;

import java.util.Scanner;
//complete and functional. It could be less complex.
public class RoundingNumbers {
	private static double number;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome");
		do{
			System.out.print("Enter the floatting point number(0 finishes): ");
			number = input.nextDouble();
			if (number != 0){
				System.out.printf("Original: %.2f. Rounded: %d.%n", number, round(number));
			}
			
		}while (number != 0);
		
		System.out.print("Thank you for use my app.");
		
	}
	
	public static int round(double num){
		int rounded = (int) Math.floor(num + 0.49999999999999);
		return rounded;
	}
}
