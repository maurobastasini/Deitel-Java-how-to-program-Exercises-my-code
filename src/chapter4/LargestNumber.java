package chapter4;

import java.util.Scanner;
//complete and functional
public class LargestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int number;
		int largest;
		System.out.print("Enter a number: ");
		number = input.nextInt();
		largest = number;
		
		while (counter < 9){
			System.out.print("Enter a number: ");
			number = input.nextInt();
			if (largest < number){
				largest = number;
			}
			counter++;
			
		}
		
		System.out.printf("The largest number is: %d.", largest);

	}

}
