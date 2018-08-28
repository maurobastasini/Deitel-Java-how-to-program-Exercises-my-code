package chapter5;

import java.util.Scanner;
//complete and functional
//be careful about result overflow (int)...
public class ProductOfOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int min;
		int max;
		int result = 1;
		System.out.print("Enter the min range: ");
		min = input.nextInt();
		System.out.print("Enter the max range: ");
		max = input.nextInt();
		
		for (;min <= max; min += 2){
			result *= min;
		}
		System.out.printf("The result is: %,d.", result);
		
		

	}

}
