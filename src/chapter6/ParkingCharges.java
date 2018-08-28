package chapter6;

import java.util.Scanner;
//complete and functional
public class ParkingCharges {
	
	private static final double MINIMUM_FEE = 2.0;
	private static final double HOURLY_FEE = 0.5;
	private static final double MAX_FEE = 10;
	
	private static double total = 0.0f;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int time = 0;
		
		do{
			System.out.print("Enter parking's time in hours");
			time = input.nextInt();
			
			if(time > 0){
				System.out.printf("Parking: $%.2f%n", calculateCharges(time));
			}

		}while(time > 0);
		
		System.out.printf("Total Yesterday: $%.2f%n", total);
		
	}
	
	public static double calculateCharges(double time){
		double fee = MINIMUM_FEE;
		if (time > 3){
			fee += (time - 3) * HOURLY_FEE;
		
		total += Math.min(fee, MAX_FEE);
		return Math.min(fee, MAX_FEE);
				
		}else{
			total += MINIMUM_FEE;
			return MINIMUM_FEE;
		}
		
			
	}	
	
	

}
