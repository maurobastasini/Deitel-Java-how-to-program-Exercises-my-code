package chapter6;

import java.util.Scanner;
//complete and functional
public class RoundingNumbers2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double number;
		
		do{
			System.out.print("Enter a floatting point number (-1 to finish): ");
			number = input.nextDouble();
			if (number > 0){
				System.out.printf("Original: %f. Integer: %d. Tenths: %.1f." +
			"Hundredths: %.2f. Thousandths %.3f%n", number, roundToInteger(number),
			roundToTenths(number), roundToHundredths(number), roundToThousandths(number));
			}
		}while(number != -1);
		
		
	}
	public static int roundToInteger(double number){
		int rounded = (int) Math.floor(number + 0.5);
		return rounded;
	}
	public static double roundToTenths(double number){
		double rounded = Math.floor(number * 10 + 0.5) / 10;
		return rounded;
	}
	public static double roundToHundredths(double number){
		double rounded = Math.floor(number * 100 + 0.5) / 100;
		return rounded;
	}
	public static double roundToThousandths(double number){
		double rounded = Math.floor(number * 1000 + 0.5) / 1000;
		return rounded;
	}
	

}
