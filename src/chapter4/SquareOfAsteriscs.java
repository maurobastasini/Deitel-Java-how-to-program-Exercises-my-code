package chapter4;

import java.util.Scanner;

public class SquareOfAsteriscs {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int side;
		int row = 0;
		int column;
		System.out.print("Enter the side of the square");
		side = input.nextInt();
		while (row < side){
			column = 0;
			while(column < side){
				System.out.print("*");
				column++;
			}
			System.out.println();
			row++;
		}
				
	}
		
}
