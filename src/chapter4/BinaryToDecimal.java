package chapter4;

import java.util.Scanner;
//complete and functional
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		int binaryNumber= input.nextInt();
		int decimalNumber = 0;
		int pow = 1;
		while (binaryNumber > 0){
			decimalNumber += (binaryNumber % 10) * pow;
			pow *= 2;			
			binaryNumber /= 10;
		}
		System.out.printf("Decimal: %d.%n", decimalNumber);
		
	}

}
