package chapter4;

import java.util.Scanner;
//complete and functional
public class SalesComitionCalculator {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int basic = 200;
		double percentage = 9;
		double totalSold = 0;
		double item1 = 239.99;
		double item2 = 129.75;
		double item3 = 99.95;
		double item4 = 350.89;
		
		System.out.print("Enter the item sold (0 finishes): ");
		int item = input.nextInt();
		while (item != 0){
			switch (item){
			case 1:
				totalSold += item1;
				break;
			case 2:
				totalSold += item2;
				break;
			case 3:
				totalSold += item3;
				break;
			case 4:
				totalSold += item4;
				break;
			}
			
			System.out.print("Enter the item sold (0 finishes): ");
			item = input.nextInt();
					
			
		}
		
		double salary = basic + (totalSold * (percentage / 100));
		System.out.println("The salary is: " + salary);
		

	}

}
