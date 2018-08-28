package chapter5;

import java.util.Scanner;
//complete and functional
public class FairTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double housing;
		double food;
		double clothing;
		double transportation;
		double education;
		double healthCare;
		double vacations;	
		double sum;
		double tax = 0.3;
		double total;
		
		System.out.print("Enter the housing expenses: ");
		housing = input.nextDouble();
		System.out.print("Enter the food expenses: ");
		food = input.nextDouble();
		System.out.print("Enter the clothing expenses: ");
		clothing = input.nextDouble();
		System.out.print("Enter the transportation expenses: ");
		transportation = input.nextDouble();
		System.out.print("Enter the education expenses: ");
		education = input.nextDouble();
		System.out.print("Enter the healthCare expenses: ");
		healthCare = input.nextDouble();
		System.out.print("Enter the vacations expenses: ");
		vacations = input.nextDouble();
		
		sum = housing + food + clothing + transportation + education + healthCare + vacations;
		total = sum + (sum * tax); // review this formula
		
		System.out.printf("Sum of expenses: %.2f, Tax: %.2f, total: %.2f", 
				sum, (sum * tax), total); //beware about the information printed... it could not be consistent
		
		
		

	}

}
