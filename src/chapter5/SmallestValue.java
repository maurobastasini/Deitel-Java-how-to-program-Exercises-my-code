package chapter5;

import java.util.Scanner;
//complete and functional
public class SmallestValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantity;
		int number;
		int smallest;
		
		System.out.print("Enter a number(represents the quantity of numbers): ");
		quantity = input.nextInt();
		System.out.print("Enter a number: ");
		smallest = input.nextInt();
		for (int i = 0; i < quantity - 1; i++){
			System.out.print("Enter a number: ");
			number = input.nextInt();
			if (number < smallest){
				smallest = number;
			}
			
		}
		
		System.out.printf("%s%d.", "The smallest value is: ", smallest);
		
	}

}
