package chapter7;

import java.security.SecureRandom;
import java.util.Scanner;
//done
public class TheTortoiseAndTheHare {
	private static final SecureRandom rand = new SecureRandom();
	private static final int[] tortoiseMovements = {3, -6, 1};
	private static final int[] hareMovements = {0, 9, -12, 1, -2};
	private static final String[] road = new String[75];
	public static void main(String[] args) {
		int turtlePosition = 0;
		int harePosition = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < road.length; i++){
			road[i] = " ";
		}
		
		road[1] = "|";
		road[0] = "0";
		road[70] = "|";
		displayRoad();
		System.out.printf("BANG !!!!! %nAND THEY'RE OFF !!!!!%n");
		road[0] = " ";
		
		for(int i = 0; i < 300; i++){
		
			road[turtlePosition] = " ";
			road[harePosition] = " ";
			
			turtlePosition += tortoiseMovements[turtleMove()];
			harePosition += hareMovements[turtleMove()];
			if(turtlePosition < 0){
				turtlePosition = 0;
			}else if(turtlePosition > road.length - 1){
				turtlePosition = 71;
			}
			
			road[turtlePosition] = "T";
			
			if(harePosition < 0){
				harePosition = 0;
			}else if(harePosition > road.length - 1){
				harePosition = 71;
			}
			road[harePosition] = "H";
			System.out.printf("%n%n%n%n");
			displayRoad();
			
			if(turtlePosition >= 70){
				System.out.println("The Turtle wins!!");
				break;
			}
			
			if(harePosition >= 70){
				System.out.println("The Hare wins!!");
				break;
			}
			
			input.nextLine();
			
		}

	}
	
	public static void displayRoad(){
		for(int i = 0; i < road.length; i++){
			System.out.print(road[i]);
		}
		System.out.println();
	}
	
	public static int turtleMove(){
		int random = rand.nextInt(10);
		if(random < 5){
			return 0;
		}else if(random < 7){
			return 1;
		}else{
			return 2;
		}
		
	}
	
	public static int hareMove(){
		int random = rand.nextInt(10);
		if(random < 2){
			return 0;
		}else if(random < 4){
			return 1;
		}else if(random < 5){
			return 2;
		}else if(random < 8){
			return 3;
		}else{
			return 4;
		}
		
	}

}
