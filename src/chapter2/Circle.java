/*
 *       Filename:  Circle.java
 *    Description:  Exercise 2.28 - Diameter, Circumference and Area of a Circle
 *        @Author:  Mauro Bastasini - maurobastasiniprof@gmail.com
 *       @Version:  1.0
 */


package chapter2;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int radio;
		
		System.out.print("Enter circle's radio: ");
		radio = input.nextInt();
		
		System.out.printf("Circle's diameter is: %d%n", 2 * radio);
		System.out.printf("Circle's circumference: %f%n", 2 * Math.PI * radio);
		System.out.printf("Circle's area is: %f%n", Math.PI * radio * radio);
		
		input.close();
	}

}
