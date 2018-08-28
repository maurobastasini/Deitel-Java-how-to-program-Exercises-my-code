package chapter3;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter your first name: ");
		String aName = input.nextLine();
		System.out.println("Please, enter your last name: ");
		String aLastName = input.nextLine();
		System.out.println("Please, enter your day of birth: ");
		int aDay = input.nextInt();
		System.out.println("Please, enter your month of birth: ");
		int aMonth = input.nextInt();
		System.out.println("Please, enter your year of birth: ");
		int aYear = input.nextInt();
		
		HeartRates person1 = new HeartRates(aName, aLastName, aDay, aMonth, aYear);
		
		//display person1's instance values
		System.out.println(person1.toString());
		
		//prompt for current date
		System.out.println("Enter actual day: ");
		int actualDay = input.nextInt();
		System.out.println("Enter actual month: ");
		int actualMonth = input.nextInt();
		System.out.println("Enter actual year: ");
		int actualYear = input.nextInt();
		
		//calculate person1's age and max heart rate
		int age = person1.calculateAge(actualDay, actualMonth, actualYear);
		int maxHR = person1.calculateMaxHR(age);
		
		//display person1's age
		System.out.printf("Age: %d", age);
		
		//display person1's max heart rate
		System.out.printf("%s %s's max heart rate is: %d.%n",
				person1.getFirstName(), person1.getLastName(), maxHR);
		
		//display person1's target heart rate range
		System.out.println(person1.calculateTargetHR(maxHR));
		
	}

}
