package chapter6;

import java.util.Scanner;

public class Califications {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int calification;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter the student average (-1 to finish): ");
			calification = input.nextInt();
			if(calification != -1){
				System.out.printf("The result is: %d.%n", qualityPoints(calification));
			}
			
		}while(calification != -1);
		
		System.out.print("**** Thanks for use my app :) ****");
	}
	
	public static int qualityPoints(int note){
		
		switch(note / 10){
		case 10:
		case 9:
			return 4;
		case 8:
			return 3;
		case 7:
			return 2;
		case 6:
			return 1;
		default:
			return 0;
		}
		
	}

}
