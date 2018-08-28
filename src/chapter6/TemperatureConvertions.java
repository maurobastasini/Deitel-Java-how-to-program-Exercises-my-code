package chapter6;

import java.util.Scanner;
//done done
public class TemperatureConvertions {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double initialTemperature = 0;
		double finalTemperature;
		int unity;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.print("Enter the temperature (-1000 to finish): ");
			initialTemperature = input.nextDouble();
			if (initialTemperature != -1000){
				System.out.print("Enter the unity (1 for Celsius or 2 for Farenheit): ");
				unity = input.nextInt();
				
				switch(unity){
				case 1:
					System.out.printf("Celsius: %.2f to Farenheit: %.2f.%n",
							initialTemperature, farenheit(initialTemperature));
					break;
				default:
					System.out.printf("Farenheit: %.2f to Celsius: %.2f.%n",
							initialTemperature, farenheit(initialTemperature));
				}
								
			}
		}while(initialTemperature != -1000);
		
		System.out.println("**** Thanks for use my program :) ****");	

	}
	
	public static double celsius(double farenheitGrades){
		
		return 5.0 /9.0 * (farenheitGrades - 32);
	}
	
	
	public static double farenheit(double celsiusGrades){
		
		return 9.0 / 5.0 * celsiusGrades + 32;
	}
}
