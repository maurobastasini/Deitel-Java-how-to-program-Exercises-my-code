package chapter5;

import java.util.Scanner;
//complete and functional
public class CalculatingPI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long terms;
		double pi = 0;
		long increment = 1;
		
		System.out.printf("Enter the number of terms to calculate (0 to do %,d times): ", Integer.MAX_VALUE);
		terms = input.nextInt();
		if (terms == 0){
			terms = Long.MAX_VALUE / 2 - 100000;
		}
		
		for(int i = 0; i < terms; i++){
			if (i % 2 == 0){
				pi += 4 / (float)increment;
			}
			else{
				pi -= 4 / (float)increment;
			}
			increment += 2;
		}
		
		System.out.print("PI: " + pi);
		

	}

}
