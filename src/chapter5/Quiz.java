package chapter5;

import java.util.Scanner;
//incomplete but functional
public class Quiz {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int question1;
		int question2;
		int question3;
		int question4;
		int question5;
		int score = 0;
		
		System.out.println("Welcome to the Harry Potter Quiz");
		
		do{
			System.out.printf("%s%n", "Which is the thirds Harry Potter book name?");
			System.out.printf("%15s%15s%15s%15s%n", "1) HP and the philosophal stone ", 
					"2) HP and the order of phoenix ", "3) HP and the prisioner of askaban ",
					"4) HP and the goblet of fire");
			question1 = keyboard.nextInt();
			if (question1 < 0 || question1 > 4){ //you can apply this if to every input
				System.out.printf("%s%n", "Invalid option");
			}
		}while(question1 < 0 || question1 > 4);
		
		do{
			System.out.printf("%s%n", "Which is the thirds Harry Potter book name?");
			System.out.printf("%15s%15s%15s%15s%n", "1) HP and the philosophal stone ", 
					"2) HP and the order of phoenix ", "3) HP and the prisioner of askaban ",
					"4) HP and the goblet of fire");
			question2 = keyboard.nextInt();
		}while(question2 < 0 || question2> 4);
		
		do{
			System.out.printf("%s%n", "Which is the thirds Harry Potter book name?");
			System.out.printf("%15s%15s%15s%15s%n", "1) HP and the philosophal stone ", 
					"2) HP and the order of phoenix ", "3) HP and the prisioner of askaban ",
					"4) HP and the goblet of fire");
			question3 = keyboard.nextInt();
		}while(question3 < 0 || question3 > 4);
		
		do{
			System.out.printf("%s%n", "Which is the thirds Harry Potter book name?");
			System.out.printf("%15s%15s%15s%15s%n", "1) HP and the philosophal stone ", 
					"2) HP and the order of phoenix ", "3) HP and the prisioner of askaban ",
					"4) HP and the goblet of fire");
			question4 = keyboard.nextInt();
		}while(question4 < 0 || question4 > 4);
		
		do{
			System.out.printf("%s%n", "Which is the thirds Harry Potter book name?");
			System.out.printf("%15s%15s%15s%15s%n", "1) HP and the philosophal stone ", 
					"2) HP and the order of phoenix ", "3) HP and the prisioner of askaban ",
					"4) HP and the goblet of fire");
			question5 = keyboard.nextInt();
		}while(question5 < 0 || question5 > 4);
		
				
		System.out.println("Answers");
		System.out.println();
		
		//Question 1
		System.out.printf("%s%n", "Which is the thirds Harry Potter book name?");
		System.out.printf("%s%n", "3) HP and the prisioner of askaban ");
		switch(question1){
		case 3:
			System.out.printf("%s%n", "Correct!");
			score++;
			break;
		default:
			System.out.printf("%s%n", "Incorrect");
		}

		//All questions and their respective answers
		//...
				
		switch(score){
		case 5:
			System.out.println("Excelent!");
			break;
		case 4:
			System.out.println("Very good");
			break;
		default:
			System.out.println("Time to brush up on your knowledge of Harry Pooter");
		}
		
		
		
	}

	

}
