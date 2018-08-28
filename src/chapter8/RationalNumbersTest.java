package chapter8;
//done done
public class RationalNumbersTest {

	public static void main(String[] args) {
	
		RationalNumbers num1 = new RationalNumbers(2, 4);
		RationalNumbers num2 = new RationalNumbers(-2, 4);
		RationalNumbers num3 = new RationalNumbers(-1, 3);
		RationalNumbers num4 = new RationalNumbers(2, 8);
		
		System.out.println("Num 1 is: " + num1);
		System.out.println("Num 2 is: " + num2);
		System.out.println("Num 3 is: " + num3);
		System.out.println("Num 4 is: " + num4);
		
		System.out.println();
				
		System.out.printf("%s: %s%n", "num1 + num2", RationalNumbers.add(num1, num2));
		System.out.printf("%s: %s%n", "num1 - num2", RationalNumbers.substract(num1, num2));
		System.out.printf("%s: %s%n", "num3 - num4", RationalNumbers.substract(num3, num4));
		System.out.printf("%s: %s%n", "num1 * num2", RationalNumbers.multiply(num1, num2));
		System.out.printf("%s: %s%n", "num2 / num3", RationalNumbers.divide(num2, num3));
		
		System.out.println();
		
		System.out.println("Num 1 is: " + num1.toFloatingPointFormat(2));
		System.out.println("Num 2 is: " + num2.toFloatingPointFormat(3));
		System.out.println("Num 3 is: " + num3.toFloatingPointFormat(4));
		System.out.println("Num 4 is: " + num4.toFloatingPointFormat(5));

	}

}
