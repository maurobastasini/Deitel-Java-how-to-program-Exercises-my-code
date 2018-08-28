package chapter5;

import java.util.Scanner;
//complete functional and parameterized
public class PatternDiamond {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int space;
		int asterisk = 1;
		int rows;
		
		do{
			System.out.print("Enter the number of rows: ");
			rows = input.nextInt();
		}while(rows % 2 == 0);
		space = rows / 2;
		for (int i = 1; i <= rows; i++){
			
			for (int j = 1; j <= rows; j++){
				
				if (j <=  space || j > space + asterisk){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
				
			}
			
			if (i <= rows / 2){
				space -= 1;
				asterisk += 2;
			}
			else{
				space += 1;
				asterisk -= 2;
			}
			
			System.out.println();		
		}
				

	}

}
