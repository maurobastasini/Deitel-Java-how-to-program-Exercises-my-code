package chapter7;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] t = new int[2][3];
		for(int i = 0; i < t.length; i++){
			for(int j = 0; j < t[i].length; j++){
				System.out.printf("Enter the value of row %d and column %d:", i, j);
				t[i][j] = input.nextInt();
			}
		}
		
		int smallest = t[0][0];
		for(int i = 0; i < t.length; i++){
			for(int j = 0; j < t[i].length; j++){
				if(t[i][j] < smallest){
					smallest = t[i][j];
				}

			}
		}
		System.out.print("Smallest: " + smallest);
		System.out.println();
		System.out.printf("%d%d%d", t[0][0], t[0][1], t[0][2]);
		int total = t[0][2] + t[1][2];

		
		System.out.print(" ");
		for(int i = 0; i < t[0].length; i++){
			System.out.printf("%5d", i);
		}
		System.out.println();
		for(int i = 0; i < t.length; i++){
			System.out.print(i);
			for(int j = 0; j < t[i].length; j++){
				System.out.printf("%5d", t[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
