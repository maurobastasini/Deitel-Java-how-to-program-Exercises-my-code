package chapter6;

import java.util.Scanner;
//done done perfects: 6, 28, 496, 8128, 33 550 336 ... and 1 I think
public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i = 2; i <= 1000000; i++){
			if(isPerfect(i)){
				System.out.println("The number " + i + " is perfect...");
				printFactors(i);
			}

		}
	
		/* If want to charge a number to probe it manually...
		int number;
		
		do{
			System.out.print("Enter a number(0 to finish): ");
			number = input.nextInt();
			if(isPerfect(number)){
				System.out.println("The number " + number + " is perfect...");
				printFactors(number);
			}
			
		}while(number > 0);
		*/
	}
	
	
	public static boolean isPerfect(int number){
		
		int acum = 0;
		
		for(int i = 1; i <= number/2; i++){
			
			if (number % i == 0){
				acum += i;
			}
		
		}
		
		return (number == acum)? true : false;
	
	}
	
	public static void printFactors(int number){
		int rightLimit = number / 2;
		
		System.out.print("Factors: ");		
        for(int i=1; i <= rightLimit; i++){
            if(number % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
	}
}
