package chapter6;

import java.util.Scanner;
//complete and functional
public class Exponentiation {
	private static int base;
	private static int exponent;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("********WELCOME********");
		do{
			System.out.print("Enter Base number (-1 to finish): ");
			base = input.nextInt();
			if (base >= 0){
				System.out.print("Enter exponent number: ");
				exponent = input.nextInt();
				System.out.printf("Base: %d, Exponent: %d, Result: %d.%n", 
						base, exponent, integerPower(base,exponent));
			}
		}while(base >= 0);
		System.out.print("Thanks for use the app :)");
		
	}
	
	public static int integerPower(int base, int exponent){
		int result = 1;
		
		for (int i = 0; i < exponent; i++){
			result *= base;
		}
		return result;
		
	}

	/* Alternative online method (recursive) but bug with exponentiation to 0)...
    public static int integerPower(int base, int exponent){
        // base condition
        if(exponent <= 1)
            return base;

        // call self after calculating power with reduced exponent
        return base * integerPower(base, --exponent);
    }
    */
}
