package chapter7;

import java.security.SecureRandom;

public class RollOfDicesTestCase {
	private static SecureRandom rnd = new SecureRandom();
	
	
	public static void main(String[] args) {
		int[] winCounter = new int[21];
		int[] loseCounter = new int[21];
		int myPoint = 0;
		int sumOfDices;
		int counter;
		int subTotal = 0;
		double average;
		
		for(int i = 0; i < 1000000; i++){
			sumOfDices = rollOfDice();
			counter = 2;
			switch(sumOfDices){
			case 2:
			case 3:
			case 12:
				loseCounter[1]++;
				break;
			case 7:
			case 11:
				winCounter[1]++;
				break;
			default:
				myPoint = sumOfDices;
				do{
					sumOfDices = rollOfDice();
					if(sumOfDices == myPoint){
						winCounter[counter]++;
						break;
					}
					if(sumOfDices == 7){
						loseCounter[counter]++;
						break;
					}
					if(counter < 20)
						counter++;
				}while(true);
			}
			
		}
	
		for(int i = 1; i < winCounter.length; i++){
			System.out.printf("Win at turn %d: %d%n", i, winCounter[i]);
			winCounter[0] += winCounter[i];
			subTotal += winCounter[i] * i;			
		}
		
		for(int i = 1; i < loseCounter.length; i++){
			System.out.printf("Lose at turn %d : %d%n", i, loseCounter[i]);
			loseCounter[0] += loseCounter[i];
			subTotal += loseCounter[i] * i;	
		}
		
		average = subTotal / (float)(winCounter[0] + loseCounter[0]);
		System.out.printf("Chances of win: %.8f. Chances of lose: %.8f%n",
				((double) winCounter[0] * 100 / 1000000),((double) loseCounter[0] * 100 / 1000000));
		System.out.printf("Avergage length: %.5f", average);
	}
	
	public static int rollOfDice(){
		int die1 = 1 + rnd.nextInt(6);
		int die2 = 1 + rnd.nextInt(6);
		
		return die1 + die2;
	}

}
