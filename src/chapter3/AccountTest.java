package chapter3;

import java.util.Scanner;

public class AccountTest
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //new Scanner object for input
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.18);
		
		//display initial instance variable's values
		displayAccount(account1);
		displayAccount(account2);
		
		//deposit an amount to account1
		System.out.printf("Enter the amount to deposit in %s's account: ", account1.getName());
		double depositAmount = input.nextDouble();
		System.out.printf("Depositing %.2f amount...%n", depositAmount);
		account1.deposit(depositAmount);
		
		//display the current instance variable's values
		displayAccount(account1);
		displayAccount(account2);
		
		//deposit an amount to account2
		System.out.printf("Enter the amount to deposit in %s's account: ", account2.getName());
		depositAmount = input.nextDouble();
		System.out.printf("Depositing %.2f amount...%n", depositAmount);
		account2.deposit(depositAmount);
		
		//display the current instance variable's values
		displayAccount(account1);
		displayAccount(account2);
		
		//Withdraw an amount from account2
		System.out.printf("Enter the amount to withdraw in %s's account: ", account2.getName());
		double withdrawAmount = input.nextDouble();
		System.out.printf("Withdrawing %.2f amount...%n", withdrawAmount);
		account2.withdraw(withdrawAmount);
		
		//display the current instance variable's values
		displayAccount(account1);
		displayAccount(account2);
		
	}
	
	//Displays the name and balance of the account passed as argument
	public static void displayAccount(Account accountToDisplay) {
		
		System.out.printf("Account name: %s, balance: %.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
		
	}

}
