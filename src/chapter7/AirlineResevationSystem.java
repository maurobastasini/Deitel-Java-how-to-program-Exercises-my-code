package chapter7;

import java.util.Scanner;
//done... could be improved nested if else..
public class AirlineResevationSystem {
	private static boolean[] seats = new boolean[11];
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int option;
		int seatToReserve;
		String seatClass;
		int changeClass;
		
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.printf("Enter the class (1 for first class, 2 for Economy): ");
			option = input.nextInt();
			if(option != -1){
				seatToReserve = isEmpty(option);
				if(seatToReserve < 6)
					seatClass = "First Class";
				else
					seatClass = "Economy";
				
				if(seatToReserve != -1){
					seats[seatToReserve] = true;
					System.out.printf("%s%n Your seat: %d. Class: %s.%n%s%n",
							"***********************************",
							seatToReserve, seatClass,
							"***********************************");
				}else{
					System.out.printf("No available seats in %s. " +
							"Would you like to change to other class?(0 to cancel. 1 to change) : ",
							seatClass);
					changeClass = input.nextInt();
					if(changeClass == 1){
						if(seatToReserve < 6){
							seatToReserve = isEmpty(6);
							seatClass = "Economy";
							if(seatToReserve != -1){
								seats[seatToReserve] = true;
								System.out.printf("%s%n Your seat: %d. Class: %s.%n%s%n",
										"***********************************",
										seatToReserve, seatClass,
										"***********************************");
							}else
								System.out.printf("Next flight leaves in 3 hours.%n");
								option = -1;
							
						}else{
							seatToReserve = isEmpty(1);
							seatClass = "First Class";
							if(seatToReserve != -1){
								seats[seatToReserve] = true;
								System.out.printf("%s%n Your seat: %d. Class: %s.%n%s%n",
										"***********************************",
										seatToReserve, seatClass,
										"***********************************");
							}else{
								System.out.printf("Next flight leaves in 3 hours.%n");
								option = -1;
							}
						}
						
					}else{
						System.out.printf("We are sorry and we'll wait for your next trip%n");
					}
					
				}
				
			
			}
		}while(option != -1);
		
		System.out.println("**** Thanks for use our airline :) ****");
		
	}
	
	public static int isEmpty(int seatClass){
		if(seatClass == 1){
			for(int i = 1; i < 6; i++){
				if(!seats[i])
					return i;
			}
		}
		else{
			for(int i = 6; i < seats.length; i++){
				if(!seats[i])
					return i;
			}
		}
		return -1;
		
	}
}
