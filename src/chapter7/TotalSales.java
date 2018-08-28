package chapter7;

import java.util.Scanner;
import java.util.Random;


public class TotalSales {
	private static final int numberProducts = 6;
	private static final int numberEmploys = 5;
	private static double[][] sales = new double[numberProducts][numberEmploys];
	private static final Random rand = new Random();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int salesPersonNumber;
		int productNumber;
		double productValue;
		
		System.out.println("**** WELCOME ****");
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 6; j++){
					
				System.out.print("Enter the sales person number(0 to finish): ");
				salesPersonNumber = input.nextInt();
				if(salesPersonNumber == 0)
					break;
				System.out.print("Enter the product number: ");
				productNumber = input.nextInt();
				System.out.print("Enter the product value: ");
				productValue = input.nextDouble();
				try{
					sales[productNumber][salesPersonNumber] += productValue;
				}catch(IndexOutOfBoundsException e){
					System.out.println(e);
				}
			
			}
			
		}
		
		generateRandom();
		sumarize();
		display();
		
		

		System.out.printf("%n%n**** Thanks for use my app :) ****");

	}
	public static void sumarize(){
		
		for(int i = 1; i < sales.length; i++){
			for(int j = 1; j < sales[i].length; j++){
				sales[i][0] += sales[i][j];
				sales[0][j] += sales[i][j];
			}
			
		}		
		
	}
	
	public static void generateRandom(){
		
		for(int i = 1; i < sales.length; i++){
			for(int j = 1; j < sales[i].length; j++){
				sales[i][j] = rand.nextInt(9999);
				
				
			}
		}
		
		
	}
	
	public static void display(){
		
		System.out.printf("%15d%15d%15d%15d%15s%n", 1, 2, 3, 4, "TOTAL");
		
		for(int i = 1; i < sales.length; i++){
			System.out.printf("%d", i);
			for(int j = 1; j < sales[i].length; j++){
				
				System.out.printf("%14.2f", sales[i][j]);
			}
			System.out.printf("%15.2f%n", sales[i][0]);
		}
		System.out.printf("TOTAL %9.2f", sales[0][1]);
		
		for(int i = 2;  i < sales[0].length; i++){
			System.out.printf("%14.2f", sales[0][i]);
		}
	}
	
}
