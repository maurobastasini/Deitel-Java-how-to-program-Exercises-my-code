package chapter6;

import java.util.Scanner;
//complete and functional
public class HypothenuseCalculation {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double side1;
		double side2;
		
		System.out.println("**** WELCOME ****");
		do{
			System.out.print("Enter the side 1(0 to finish): ");
			side1 = input.nextDouble();
			if (side1 > 0){
				System.out.print("Enter the side 2: ");
				side2 = input.nextDouble();
				System.out.printf("Side 1: %.2f, side 2: %.2f, hypothenuse: %.2f, Math hypothenuse method: %.2f.%n",
						side1, side2, hypothenuse(side1, side2), Math.hypot(side1, side2));
			}
		}while(side1 > 0);
		System.out.print("**** Thanks for use my app :) ****");
	}
	
	public static double hypothenuse(double side1, double side2){
		
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));		
	}
	

}
