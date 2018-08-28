package chapter7;

import java.util.Random;

public class DiceRolling {
	private static Random rnd = new Random();
	
	
	public static void main(String[] args) {
		int[] sumCounter = new int[11];
		
		for(int i = 0; i < 36000000; i++){
			sumCounter[rollOfDice() - 2]++;
		}
		System.out.printf("%8d%8d%8d%8d%8d%8d%8d%8d%8d%8d%8d%n",
				2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		for(int element : sumCounter){
			System.out.printf("%8d", element);		}
		

	}

	
	
	public static int rollOfDice(){
		int die1 = 1 + rnd.nextInt(6);
		int die2 = 1 + rnd.nextInt(6);
		
		return die1 + die2;
		
		
	}
	
}
