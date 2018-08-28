package chapter4;

import java.util.Scanner;
//complete and functional
public class Criptography {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number= -1;
		int digit0;
		int digit1;
		int digit2;
		int digit3;
		int comodin;
		
		
		while(number < 999 || number > 9999){
			System.out.print("Enter the number to encript(4 digits): ");
			number = input.nextInt();
		}
		digit0 = number % 10;
		digit1 = (number / 10) % 10;
		digit2 = (number / 100) % 10;
		digit3 = (number / 1000) % 10;
		
		//Encriptation
		digit0 = (digit0 + 7) % 10; 
		digit1 = (digit1 + 7) % 10;
		digit2 = (digit2 + 7) % 10;
		digit3 = (digit3 + 7) % 10;
		
		comodin = digit0;
		digit0 = digit2;
		digit2 = comodin;
		
		comodin = digit1;
		digit1 = digit3;
		digit3 = comodin;
		
		System.out.printf("%d%d%d%d", digit3,digit2,digit1,digit0);
		
	}

}
