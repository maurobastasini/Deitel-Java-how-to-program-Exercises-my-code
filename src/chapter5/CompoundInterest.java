package chapter5;
//complete and functional
public class CompoundInterest {

	public static void main(String[] args) {
		double amount; //result
		double capital = 1000; //start amount of capital
		double rate = 0.05; // % of interest
		
		System.out.printf("%s%30s%n", "Year", "Amount on deposit");
		
		for (int i = 1; i <= 6; i++){
			amount = capital * Math.pow(1.0 + rate, i);
			rate += 0.01;
			System.out.printf("%d%,30.2f%n", i, amount);
		}

	}

}
