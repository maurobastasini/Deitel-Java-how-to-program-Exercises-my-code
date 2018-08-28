package chapter4;

import java.util.Scanner;
//complete and functional
public class SalaryCalculator {

	public static void main(String[] args) {
		int counter = 0;
		Scanner input = new Scanner(System.in);
						
		while (counter <= 0){
			int hours;
			int hourlyRate;
			double salary;
			System.out.print("Enter the number of hours: ");
			hours = input.nextInt();
			System.out.print("Enter the hurly rate: ");
			hourlyRate = input.nextInt();
			if (hours <= 40){
				salary = hours * hourlyRate;
			}
			else{
				salary = 40 * hourlyRate + (hours - 40) * hourlyRate * 1.5;
			}
			
			System.out.printf("The salary is: $%.2f.", salary);
					
			
		}
	}
}
