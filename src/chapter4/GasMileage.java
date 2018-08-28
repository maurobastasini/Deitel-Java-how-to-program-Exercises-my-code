package chapter4;

import java.util.Scanner;
//complete and functional
public class GasMileage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalMiles = 0;
		int totalGallons = 0;
		int miles;
		
		System.out.print("Enter miles (0 finish): ");
		miles = input.nextInt();
		while (miles > 0){
			System.out.print("Enter gallons: ");
			int gallons = input.nextInt();
			
			totalMiles += miles;
			totalGallons += gallons;
			
			System.out.printf("Relation in last trip : %.2f%n", (float)miles / (float)gallons);
			System.out.printf("Relation in all trip : %.2f%n", (float)totalMiles / (float)totalGallons);
			
			System.out.print("Enter miles (0 finish): ");
			miles = input.nextInt();
		}
			
		System.out.print("Good bye! :)");
	}

}
