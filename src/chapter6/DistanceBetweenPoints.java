package chapter6;

import java.util.Scanner;
//done done
public class DistanceBetweenPoints {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		boolean proceed;
		
		do{
			System.out.print("Enter x1 (component in x of the first point): ");
			x1 = input.nextDouble();
			System.out.print("Enter y1 (component in y of the first point): ");
			y1 = input.nextDouble();
			System.out.print("Enter x2 (component in x of the second point): ");
			x2 = input.nextDouble();
			System.out.print("Enter y2 (component in y of the second point): ");
			y2 = input.nextDouble();
			
			System.out.printf("The distance between (%.2f ; %.2f) and (%.2f ; %.2f) is: %.2f.%n",
					x1, y1, x2, y2, distance(x1, y1, x2, y2));
			System.out.print("Do yo want to calculate another distance? 1: Yes. 2: No.");
			if (input.nextInt() == 1) proceed = true;
			else proceed = false;
			
			
		}while(proceed);
		
		
	}
	
	
	public static double distance(double x1, double y1, double x2, double y2){
		
		double xComponent = x2 - x1;
		double yComponent = y2 - y1;
		return Math.sqrt(Math.pow(xComponent, 2) + Math.pow(yComponent, 2));
		
		
	}
}
