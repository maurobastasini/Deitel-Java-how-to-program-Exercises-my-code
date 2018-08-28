package chapter7;

import java.security.SecureRandom;

public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom rand = new SecureRandom();
	
	public DeckOfCards(){
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for(int i = 0; i < deck.length; i++){
			deck[i] = new Card(faces[i % 13], suits[i / 13]);
		}
		
	}
	
	public void suffle(){
		currentCard = 0;
		int second;
		Card temp;
		for(int first = 0; first < deck.length; first++){
			second = rand.nextInt(NUMBER_OF_CARDS);
			temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
		
	}
	
	
	public Card dealCard(){
		if(currentCard < deck.length){
			return deck[currentCard++];
		}else{
			return null;
		}
	}
	
	//Poker hands
	
	public boolean pair(Card[] hand, int quantity){
		boolean onePair = false;
		boolean twoPairs = false;
		int[] count = new int[14];
		for(int i = 0; i < hand.length; i++){
			
			switch(hand[i].getFace()){
			case "Ace":
				count[1]++;
				break;
			case "Deuce":
				count[2]++;
				break;
			case "Three":
				count[3]++;
				break;
			case "Four":
				count[4]++;
				break;
			case "Five":
				count[5]++;
				break;
			case "Six":
				count[6]++;
				break;
			case "Seven":
				count[7]++;
				break;
			case "Eight":
				count[8]++;
				break;
			case "Nine":
				count[9]++;
				break;
			case "Ten":
				count[10]++;
				break;
			case "Jack":
				count[11]++;
				break;
			case "Queen":
				count[12]++;
				break;
			default:
				count[13]++;
			}
		}
		
		for(int i = 1; i < count.length; i++){
			if(count[i] == 2){
				if(onePair){
					twoPairs = true;
				}
				onePair = (onePair)? false : true;
			}	
		
		}
		if(quantity == 1){
			return onePair;
		}else{
			return twoPairs;
		}
	}
	
	public boolean three(Card[] hand){
		int[] count = new int[14];
		for(int i = 0; i < hand.length; i++){
			
			switch(hand[i].getFace()){
			case "Ace":
				count[1]++;
				break;
			case "Deuce":
				count[2]++;
				break;
			case "Three":
				count[3]++;
				break;
			case "Four":
				count[4]++;
				break;
			case "Five":
				count[5]++;
				break;
			case "Six":
				count[6]++;
				break;
			case "Seven":
				count[7]++;
				break;
			case "Eight":
				count[8]++;
				break;
			case "Nine":
				count[9]++;
				break;
			case "Ten":
				count[10]++;
				break;
			case "Jack":
				count[11]++;
				break;
			case "Queen":
				count[12]++;
				break;
			default:
				count[13]++;
			}
		}
		
		for(int i = 1; i < count.length; i++){
			if(count[i] == 3){
				return true;
			}
		}
		return false;
	}
	
	public boolean four(Card[] hand){
		int[] count = new int[14];
		for(int i = 0; i < hand.length; i++){
			
			switch(hand[i].getFace()){
			case "Ace":
				count[1]++;
				break;
			case "Deuce":
				count[2]++;
				break;
			case "Three":
				count[3]++;
				break;
			case "Four":
				count[4]++;
				break;
			case "Five":
				count[5]++;
				break;
			case "Six":
				count[6]++;
				break;
			case "Seven":
				count[7]++;
				break;
			case "Eight":
				count[8]++;
				break;
			case "Nine":
				count[9]++;
				break;
			case "Ten":
				count[10]++;
				break;
			case "Jack":
				count[11]++;
				break;
			case "Queen":
				count[12]++;
				break;
			default:
				count[13]++;
			}
		}
		
		for(int i = 1; i < count.length; i++){
			if(count[i] == 4){
				return true;
			}
		}
		return false;
	}
	
	public boolean flush(Card[] hand){
		int[] count = new int[4];
		for(int i = 0; i < hand.length; i++){
			switch(hand[i].getSuit()){
			case "Hearts":
				count[0]++;
				break;
			case "Diamonds":
				count[1]++;
				break;
			case "Clubs":
				count[2]++;
				break;
			default:
				count[3]++;
			}		
			
		}
		for(int i = 0; i < count.length; i++){
			if(count[i] == 5){
				return true;
			}
		}
		return false;
	}
	
	public boolean straight(Card[] hand){
		int[] count = new int[14];
		for(int i = 0; i < hand.length; i++){
			
			switch(hand[i].getFace()){
			case "Ace":
				count[1]++;
				break;
			case "Deuce":
				count[2]++;
				break;
			case "Three":
				count[3]++;
				break;
			case "Four":
				count[4]++;
				break;
			case "Five":
				count[5]++;
				break;
			case "Six":
				count[6]++;
				break;
			case "Seven":
				count[7]++;
				break;
			case "Eight":
				count[8]++;
				break;
			case "Nine":
				count[9]++;
				break;
			case "Ten":
				count[10]++;
				break;
			case "Jack":
				count[11]++;
				break;
			case "Queen":
				count[12]++;
				break;
			default:
				count[13]++;
			}
		}
		
		for(int i = 1; i < count.length; i++){
			if(count[i] == 1){
				if(i + 4 < count.length){
					for(int j = 1; j < 5; j++){
						if(count[i + j] != 1)
							return false;
					}
					return true;
				}
			}
		}
		
		return false;
	
	}
	
	public boolean fullHouse(Card[] hand){
		if(pair(hand, 1) && three(hand)){
			return true;
		}else{
			return false;
		}
	}
}
