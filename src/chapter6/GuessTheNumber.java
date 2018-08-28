package chapter6;

import java.util.Scanner;
import java.security.SecureRandom;
//done done
public class GuessTheNumber {
	private static final SecureRandom rand = new SecureRandom();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		int count = 0;
		int min = 1;
		int max = 1000;
		int unknown = min + rand.nextInt(max);
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.printf("Guess a number between %d and %d: ", min, max);
			number = input.nextInt();
			
			if(number > unknown){
				System.out.println("Too High. Try again");
				max = number;
			}
			
			if(number < unknown){
				System.out.println("Too Low. Try again");
				min = number;
			}
			count += 1;
			
		}while(number != unknown);
		
		System.out.printf("Congratulations. You guessed the number in %d attemps!", count);
		
		if(count < 10){
			System.out.println("Either you know the secret or you got lucky!");
		}
		
		if(count == 10){
			System.out.println("Aha! you know the secret!");
		}
		
		if(count > 10){
			System.out.println("You should be able to do better");
		}
		
		System.out.println("**** Thanks for use my app ****");
		
	}

}
