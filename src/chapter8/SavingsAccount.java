package chapter8;
//done done
public class SavingsAccount {
	private static double annualInterestRate = 1;
	private double savingsBalance;
	
	public SavingsAccount(){
		this(0);
	}
	
	public SavingsAccount(double balance){
		savingsBalance = balance;
	}
	
	public double getSavingsBalance(){
		return savingsBalance;
	}
	
	public void setSavingBalance(double savingBalance){
		this.savingsBalance = savingBalance;
	}
	
	
	public void calculateMonthlyInterest(){
		savingsBalance += savingsBalance * annualInterestRate / 12;
	}
	
	public static void modifyInterestRate(double interestRate){
		annualInterestRate = interestRate; 
	}
}
