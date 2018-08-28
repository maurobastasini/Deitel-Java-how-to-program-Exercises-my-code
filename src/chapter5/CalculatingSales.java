package chapter5;

import java.util.Scanner;
//complete and functional
//somethings to learn about do while, hasNext and structured programming.
public class CalculatingSales {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double product1 = 2.98;
		double product2 = 4.50;
		double product3 = 9.98;
		double product4 = 4.49;
		double product5 = 6.87;
		double total = 0;
		int option;
		int quantity;
		
		
		do{
			//validate option between 0-5 
			do{
				System.out.print("Enter the product (0 to finish, 1-5): ");
				option = input.nextInt();
			}while ((option < 0) || (option > 5));
			
			//breaks if user input 0
			if (option == 0)
				break;
			
			//validate quantity higher than 0
			do{
				System.out.print("Quantity: ");
				quantity = input.nextInt();
			}while(quantity < 1);
			
			//calculate total based on item and quantity in this iteration
			switch(option){
				case 1:
					total += (product1 * quantity);
					break;
				case 2:
					total += (product2 * quantity);
					break;
				case 3:
					total += (product3 * quantity);
					break;
				case 4:
					total += (product4 * quantity);
					break;
				case 5:
					total += (product5 * quantity);
					break;
			}
			
			
		}while(option != 0);
		
		
		//Print result
		System.out.printf("Total: $%.2f", total);

	}

}
