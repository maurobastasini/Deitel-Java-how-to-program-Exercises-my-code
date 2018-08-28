package chapter3;

//Remember to create a method that display the current values for its parameter and its caller.
public class Account
{
	private String name;
	private double balance;
	
	
	public Account(String name, double balance)
	{	
		this.name = name;
		if (balance > 0.0)	this.balance = balance;

	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)	balance = balance + depositAmount;
	}
	
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount > balance)	
			System.out.println("Withdrawal amount exceeded account balance.");
		else
			balance = balance - withdrawAmount;
	}

}
