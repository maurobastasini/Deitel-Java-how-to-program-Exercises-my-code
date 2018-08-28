package chapter7;

import java.util.Scanner;
//done done
public class SalesCommition {
	
	private static double base = 200;
	private static double bonus = 0.09;
	private static int sales;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] salesCounter = new int[11];
		
		System.out.println("**** WELCOME ****");
		
		do{		
			System.out.print("Enter sales: ");
			sales = input.nextInt();
			int salary = (int)(base + bonus * sales);
			if(salary > 1000)
				salary = 1000;
			
			salesCounter[salary / 100]++;			
			System.out.print("0 to stop, 1 to continue: ");
							
		}while((input.nextInt() > 0)? true: false);
		
		System.out.printf("%8s%6s%8s%n", "Salaries", "Num", "Graph");
		
		for(int i = 2; i < salesCounter.length; i++){
			if(i == 10){
				System.out.printf("1000+:     %3d ", salesCounter[i]);
				for(int j = 0; j < salesCounter[i]; j++){
					System.out.print("*");
				}
			}else{
				System.out.printf("%d00-%d99:   %3d   ", i, i,
						salesCounter[i]);
				for(int j = 0; j < salesCounter[i]; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("**** Thanks for use my app :) ****");
	}

}
