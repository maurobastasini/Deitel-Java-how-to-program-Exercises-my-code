package chapter4;

import java.util.Scanner;
//complete and functional
public class Factorial {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number = -1;
		long factorial = 1;
		int count= 1;
		
		while(number < 0){
		System.out.print("Enter a number to calculate it's factorial: ");
		number= input.nextInt();
		}
		while (number >= count){
			factorial *= count; 
			count++;		
		}
		System.out.printf("The number is: %d, and it's factorial is: %d.%n", number, factorial);
	}

}
