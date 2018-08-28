package chapter4;

import java.util.Scanner;
//complete and functional
public class SidesOfTriangle {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int	number1 = -1,
			number2 = -1,
			number3 = -1;
		while(number1 < 1){
		System.out.print("Enter a number");
		number1 = input.nextInt();
		}
		while(number2 < 1){
		System.out.print("Enter a number");
		number2 = input.nextInt();
		}
		while(number3 < 1){
		System.out.print("Enter a number");
		number3 = input.nextInt();
		}
		if (number1 < number2 + number3 || number2 < number1 + number3 || number3 < number1 + number2){
			System.out.print("They could represent the sides of a triangle");
		}
		
		
		

	}

}
