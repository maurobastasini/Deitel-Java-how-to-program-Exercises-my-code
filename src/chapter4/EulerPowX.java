package chapter4;

import java.util.Scanner;
//complete and functional
public class EulerPowX {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number= -1;
		int x = -1;
		int factorial= 1;
		double euler = 1;
		int count= 1;
		while(number < 1){
			System.out.print("Enter how many times to do the operation: ");
			number = input.nextInt();
		}
		while(x < 1){
			System.out.print("Enter the exponent: ");
			x = input.nextInt();
		}
		while (count <= number){
			factorial *= count;
			euler += (float) Math.pow(x, count) / factorial;
			count++;
		}
		
		System.out.printf("Result: %.13f", euler);
	}

}
