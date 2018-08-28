package chapter5;

import java.util.Scanner;
//complete and functional
public class BarChart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1,
			num2,
			num3,
			num4,
			num5;
		
		System.out.print("Enter 5 numbers separated by spaces:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
				
		for (int i = 0;i < num1; i++){
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < num2; i++){
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < num3; i++){
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < num4; i++){
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < num5; i++){
			System.out.print("*");
		}
		
		
	}

}
