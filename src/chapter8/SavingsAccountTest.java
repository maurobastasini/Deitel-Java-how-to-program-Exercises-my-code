package chapter8;
//done done
public class SavingsAccountTest {
	
	public static void main(String[] args){
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		System.out.printf("%5s%10s%10s%n", "Month", "Account 1", "Account 2");
		
		for(int i = 0; i < 13; i++){
			System.out.printf("%5d%10.2f%10.2f%n",
					i, saver1.getSavingsBalance(), saver2.getSavingsBalance());
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
		}
		
		SavingsAccount.modifyInterestRate(0.05);
		System.out.printf("%5d%10.2f%10.2f%n",
				13, saver1.getSavingsBalance(), saver2.getSavingsBalance());
		
		
	}
}
