package chapter6;

import java.util.Scanner;
import java.security.SecureRandom;
//done done
public class MAD_ComputerAssistedInstruction {
	private static final SecureRandom rand = new SecureRandom();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correctAnswer;
		int userAnswer;
		int counterCorrectAnswers = 0;
		int quantityOfQuestions = 10;
		int average;
		boolean nextStudent;
		int level;
		int operation;
		
		System.out.println("**** WELCOME ****");
		
		do{
			System.out.printf("Enter operation:%n%s%n%s%n%s%n%s", 
					"1 for addition", "2 for substraction",
					"3 for multiplication", "4 for division");
			operation = input.nextInt();
			System.out.println("Enter level (1, 2, 3...):");
			level = input.nextInt();
			
			for(int i = 0; i < quantityOfQuestions; i++){
				correctAnswer = generateQuestion(level, operation);
				userAnswer = input.nextInt();
			
	
				if(userAnswer == correctAnswer){
					randomResponse(true);
					counterCorrectAnswers += 1;
				}else{
					randomResponse(false);
				}
			}
		
			average = counterCorrectAnswers * 100 / quantityOfQuestions;
		
			if(average >= 75){
				System.out.println("Congratulations, you are ready to go to the next level!");
			}else{
				System.out.println("Please ask your teacher for extra help.");
			}
			
			System.out.println("Type true, to continue or false, to stop");
			nextStudent = input.nextBoolean();
			
		}while(nextStudent);
		
		System.out.println("\n**** Thanks for use my app :) ****");

	}
	
	public static int generateQuestion(int level, int operation){
		int max = (int) Math.pow(10, level) - 1;
		int a = 1 + rand.nextInt(max);
		int b = 1 + rand.nextInt(max);
		switch(operation){
		case 1:
			System.out.printf("How much is %d + %d?: ", a, b);
			return a + b;
		case 2:
			System.out.printf("How much is %d - %d?: ", a, b);
			return a - b;
		case 3:
			System.out.printf("How much is %d * %d?: ", a, b);
			return a * b;
		default:
			System.out.printf("How much is %d / %d?: ", a, b);
			return a / b;
		}
	}
	
	public static void randomResponse(boolean correct){
		int option = rand.nextInt(4);
		if(correct){
			switch(option){
			case 0:
				System.out.println("Very good!");
				break;
			case 1:
				System.out.println("Excellent");
				break;
			case 2:
				System.out.println("Nice work!");
				break;
			default:
				System.out.println("Keep up the good work!");
			}
		}else{
			switch(option){
			case 0:
				System.out.println("No. Please try again.");
				break;
			case 1:
				System.out.println("Wrong. Try once more.");
				break;
			case 2:
				System.out.println("Don't give up!");
				break;
			default:
				System.out.println("No. Keep trying.");
			}
			
		}
		
	}
}
