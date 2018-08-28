package chapter4;

import java.util.Scanner;
//complete and functional
public class Euler {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number= -1;
		int factorial= 1;
		double euler = 1;
		int count= 1;
		while(number < 1){
			System.out.print("Enter how many times to do the operation: ");
			number = input.nextInt();
		}
		while (count <= number){
			factorial *= count++;
			euler += 1.0 / factorial;
			
		}
		
		System.out.printf("Euler: %.13f", euler);
		
		
			

	}

}
