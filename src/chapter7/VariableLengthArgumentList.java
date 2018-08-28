package chapter7;

import java.util.Scanner;
//done but not proved if it works with the JVM
public class VariableLengthArgumentList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int QUANTITY;
		if(args.length > 0){
			 QUANTITY = Integer.parseInt(args[0]);
		}
		else{
			QUANTITY = 10;
		}
		
		int[] numbers = new int[QUANTITY];
		int factor;
		int counter = 0;
		
		do{
			System.out.print("Enter a factor (0 to finish): ");
			factor = input.nextInt();
			if(factor != 0)
				numbers[counter++] = factor;
		
		}while(factor != 0 && counter < QUANTITY);
		
		System.out.printf("The result is: %d", 
		multiplication(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]));

	}
	
	public static int multiplication(int... numbers){
		for(int i = 1; i < numbers.length; i++){
			if(numbers[i] != 0)
				numbers[0] *= numbers[i];
		}
		return numbers[0];
	}
	
}
