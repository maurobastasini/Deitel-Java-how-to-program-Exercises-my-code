package chapter7;

public class DeckOfCardsTest {
	private static DeckOfCards myDeck = new DeckOfCards();
	
	public static void main(String[] args) {		
		String winner = "";
		myDeck.suffle();
		
		Card[] player1Hand = dealHand(5);
		Card[] player2Hand = dealHand(5);
		
		display(player1Hand);
		display(player2Hand);
		
		int value1 = analize(player1Hand);
		int value2 = analize(player2Hand);
				
		System.out.printf("Player one has a %s.%n" , analizeString(value1));
		System.out.printf("Player two has a %s.%n" , analizeString(value2));
		
		if(value1 > value2){
			winner = "Player one wins!";
		}else if(value1 < value2){
			winner = "Player two wins!";
		}else{
			winner = "It is a tie :).";
		}
		
		System.out.println(winner);
	}
	
	public static Card[] dealHand(int quantity){
		Card[] playerHand = new Card[quantity];
		
		for(int i = 0; i < playerHand.length; i++){
			playerHand[i] = myDeck.dealCard();
		}
		return playerHand;
	}
	
	public static int analize(Card[] hand){
		if(myDeck.fullHouse(hand)){
		return 6;
		}else if(myDeck.pair(hand, 2)){
			return 2;
		}else if(myDeck.pair(hand, 1)){
			return 1;
		}else if(myDeck.three(hand)){
			return 3;
		}else if(myDeck.straight(hand)){
			return 4;
		}else if(myDeck.flush(hand)){
			return 5;
		}else if(myDeck.four(hand)){
			return 7;
		}else{
			return 0;
		}
			
	}
	
	public static String analizeString(int value){
		String playerString = "Bust";
		
		switch(value){
		case 0:
			break;
		case 1:
			playerString = "pair";
			break;
		case 2:
			playerString = "double pair";
			break;
		case 3:
			playerString = "three of a kind";
			break;
		case 4:
			playerString = "straight";
			break;
		case 5:
			playerString = "flush";
			break;
		case 6:
			playerString = "full house";
			break;
		case 7:
			playerString = "poker";
			break;
		}
		
		return playerString;
		
	}
	
	public static void display(Card[] hand){
		for(int i = 0; i < hand.length; i++){
			System.out.printf("%-20s", hand[i]);
		}
		System.out.println();
		
	}
}
