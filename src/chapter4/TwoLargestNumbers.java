package chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int number;
		int largest;
		int secondLargest;
		System.out.print("Enter a number: ");
		number = input.nextInt();
		largest = number;
		System.out.print("Enter a number: ");
		number = input.nextInt();
		if (largest < number){
			secondLargest = largest;
			largest = number;
		}
		else{
			secondLargest = number;
		}
		while (counter < 8){
			System.out.print("Enter a number: ");
			number = input.nextInt();
			if (largest < number){
				secondLargest = largest;
				largest = number;
			}
			else if(secondLargest < number){
				secondLargest = number;
			}
			counter++;
			
		}
		
		System.out.printf("The largest number is: %d.", largest);
		System.out.printf("The second largest number is: %d.", secondLargest);
	}
}
