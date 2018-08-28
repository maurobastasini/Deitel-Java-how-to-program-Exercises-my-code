package chapter6;

import java.util.Scanner;
import java.security.SecureRandom;
//done done
public class GameOfCraps {
	private enum Status { CONTINUE, WON, LOSE };
	private static final SecureRandom rand = new SecureRandom();
	private static Scanner input = new Scanner(System.in);
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	private static int bankBalance = 1000;
	private static int wager = 0;
	
	
	public static void main(String[] args) {
		
		System.out.println("**** WELCOME ****");
				
	
		Status gameStatus;
		int myPoint = 0;
		
		makeWager();		
		
		int sumOfDices = rollDices();
		
		switch(sumOfDices){		
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOSE;
			break;
		
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDices;
			System.out.println("Player point is: " + myPoint);
		}
		
		while(gameStatus == Status.CONTINUE){
			
			chatter();
			makeWager();		
			
			sumOfDices = rollDices();
			
			if(myPoint == sumOfDices){
				gameStatus = Status.WON;
			}
			else if(sumOfDices == SEVEN){
				gameStatus = Status.LOSE;
			}
			
		}
		
		if(gameStatus == Status.WON){
			bankBalance += wager * 2;
			System.out.printf("Player wins. Money: %d.%n", bankBalance);			
		}else{
			System.out.printf("Player loses. Money: %d.%n", bankBalance);			
		}
		
		System.out.print("**** Thanks for use my app :) ****");

	}
	
	public static int rollDices(){
		
		int die1 = 1 + rand.nextInt(6);
		int die2 = 1 + rand.nextInt(6);
						
		int sum = die1 + die2;
		
		System.out.printf("The player rolled %d + %d = %d.%n", die1, die2, sum);
		
		return sum;
		
	}
	
	public static void makeWager(){
		int newWager = 0;
		do{
			System.out.printf("Your money: %d. Enter your wager: ", bankBalance);
			newWager = input.nextInt();
		}while(newWager > bankBalance || newWager < 0);
		
		bankBalance -= newWager;
		wager += newWager;

	}
	
	public static void chatter(){
		switch(rand.nextInt(3)){
		case 0:
			System.out.println("\nOh, you're going for broke, huh?");
			break;
		case 1:
			System.out.println("\nAw c'mon, take a chance!");			
			break;
		default:
			System.out.println("\nYou're up big. Now's the time to cash in your chips!");	
		}
	}
	

}
