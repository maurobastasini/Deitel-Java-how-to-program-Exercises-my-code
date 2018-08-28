package chapter6;

import java.security.SecureRandom;
//done done
public class CoinTossing {
	private enum Coin {HEADS, TAIL};
	private static final SecureRandom rand = new SecureRandom();
	
	public static void main(String[] args) {
		Coin result;
		long countHead = 0;
		long countTail = 0;
		
		//the types of variables long and the MAX_VALUE are just for testing secure random probability...
		for(int i = 0; i < Integer.MAX_VALUE; i++){
			result = flip();
			if(result == Coin.HEADS){
				countHead += 1;
			}else{
				countTail += 1;
			}
		}
		
		System.out.printf("Heads: %d, Tails: %d.%n", countHead, countTail);
		System.out.printf("Integer Max Value / 2: %d", Integer.MAX_VALUE / 2); //for testing
	}	
	
	public static Coin flip(){
		Coin face = (rand.nextBoolean()) ? Coin.HEADS : Coin.TAIL;
		return face;
	}
}
