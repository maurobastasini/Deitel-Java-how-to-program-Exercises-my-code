package chapter4;

import java.util.Scanner;
//complete and functional
public class CreditLimitCalculator {

	public static void main(String[] args) {
		int accountNumber = 0;
		int beginningBalance;
		int charges;
		int credits;
		int allowedCreditLimit;
		int newBalance;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the account number (-1 finalize): ");
		accountNumber = input.nextInt();
		
		while (accountNumber >= 0){
			System.out.print("Enter the beginning balance: ");
			beginningBalance = input.nextInt();
			System.out.print("Enter the charges: ");
			charges = input.nextInt();
			System.out.print("Enter the credits: ");
			credits = input.nextInt();
			System.out.print("Enter the allowed credit limit: ");
			allowedCreditLimit = input.nextInt();
			newBalance = beginningBalance + charges - credits;
			System.out.printf("The new balance is: %d.%n", newBalance);
			if (newBalance < -allowedCreditLimit){
				System.out.println("Credit limit exceeded");
			}
			
			System.out.print("Enter the account number (-1 finalize): ");
			accountNumber = input.nextInt();			
			
		}

	}

}
