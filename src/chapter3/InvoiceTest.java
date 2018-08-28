package chapter3;

import java.util.Scanner;
import javax.swing.JOptionPane;
//Complete exercise with 1 bug commented but nicely implemented
public class InvoiceTest {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Invoice anInvoice;
		JOptionPane.showMessageDialog(null, "Welcome to the Invoice management software");
		System.out.print("Do you want to create an Invoice manually? 1: Yes, 2: No");
		int option1 = input.nextInt();
		System.out.println();
		
		//A problem with the enter(?) pass the number entering...
		if (option1 == 1)
		{
			System.out.println("Enter the number: ");
			String aNumber = input.nextLine();
			System.out.println("Enter a description");
			String aDescription = input.nextLine();
			System.out.println("Enter the quantity");
			int aQuantity = input.nextInt();
			System.out.println("Enter the price");
			double aPrice = input.nextDouble();		
						
			anInvoice = new Invoice(aNumber, aDescription, aQuantity, aPrice);
		}
		else
			anInvoice = new Invoice();
		
		//display Invoice's information
		String message = anInvoice.toString();
		System.out.printf("Current values: %s%n", message);
		
		System.out.println("Calculating the total amount...");
		double amount = anInvoice.getInvoiceAmount();
		System.out.printf("Total amount is: %.2f%n", amount);
		
	}

}
