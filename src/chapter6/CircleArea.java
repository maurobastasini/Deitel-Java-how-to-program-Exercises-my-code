package chapter6;

import java.util.Scanner;
//complete and functional
public class CircleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter the radius of the circle(0 to finish): ");
			radius = input.nextDouble();
			if(radius > 0){
				System.out.printf("The area of the circle of radius %.2f is %.2f.%n",
						radius, circleArea(radius));
				
			}
			
		}while(radius > 0);
		

	}
	
	public static double circleArea(double rad){
		return
				Math.PI * rad * rad;
		
	}
	
}
