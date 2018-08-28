package chapter3;

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName,
				lastName,
				gender;
		int dayBirth,
			monthBirth,
			yearBirth,
			height,
			weight;
		
		
		System.out.print("Enter your Name: ");
		firstName = input.nextLine();
		System.out.print("Enter your Last Name: ");
		lastName = input.nextLine();
		System.out.print("Enter your gender: ");
		gender = input.nextLine();
		System.out.print("Enter your day of birth: ");
		dayBirth = input.nextInt();
		System.out.print("Enter your month of birth: ");
		monthBirth = input.nextInt();
		System.out.print("Enter your year of birth: ");
		yearBirth = input.nextInt();
		System.out.print("Enter your height: ");
		height = input.nextInt();
		System.out.print("Enter your weight: ");
		weight = input.nextInt();
				
		HealthProfile mauro = new HealthProfile(firstName, lastName, gender, dayBirth, monthBirth, yearBirth, height, weight);
		System.out.print(mauro.toString());
		System.out.println("Edad: " + mauro.calculateAge(1, 9, 2017));
		System.out.println("MHR: " + mauro.calculateMaxHR(mauro.calculateAge(1, 9, 2017)));
		System.out.println("Target HR: " + mauro.calculateTargetHR(mauro.calculateMaxHR(mauro.calculateAge(1, 9, 2017))));
		System.out.println("BMI: " + mauro.calculateBMI());
		System.out.println();
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		
		
	}

}
