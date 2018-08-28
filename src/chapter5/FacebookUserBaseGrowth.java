package chapter5;
//complete and functional
public class FacebookUserBaseGrowth {

	public static void main(String[] args) {
		
		double users = 1000000000;
		double totalUsers = 1000000000;
		double growth = 0.04;
		int months1 = 0;
		int months2 = 0;
		
		while (totalUsers <= 1500000000)	{
			totalUsers = users + Math.pow(1.0 + growth, months1);
			months1 ++;
		}
		months2 = months1;
		while (totalUsers <= 2000000000)	{
			totalUsers = users + Math.pow(1.0 + growth, months2);
			months2 ++;
		}
		
		System.out.printf("Months to achieve 1.5 billions: %d. Months to achieve 2 billions: %d",
				months1, months2);

	}

}
