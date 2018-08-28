package chapter7;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int position;
		
		do{
			System.out.printf("Enter the nth position to calculate the fibonacci number" +
					"(0 to finish): ");
			position = input.nextInt();		
			System.out.printf("fibonacci de %d = %f%n", position, fibonacci(position));
		
		}while(position != 0);
		
	}
	
	public static int factorial(int number){
		if(number == 0){
			return 1;
		}else{
			return number * factorial(number - 1);
		}
	}
	
	public static int fibonacciRecursive(int number){
		if(number == 0){
			return 0;
		}
		if(number == 1){
			return 1;
		}else{
			return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
		}
		
		
	}
	public static double fibonacci(double number){
		double prePrevius = 0;
		double previus = 1;
		double total;
		if(number == 0){
			return 0;
		}
		if(number == 1){
			return 1;
		}else{
			
			for(int i = 2; i < number; i++){
				total = prePrevius + previus;
				prePrevius = previus;
				previus = total;

			}
			
			return prePrevius + previus;
		}
		
				
		
	}
}
