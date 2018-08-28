package chapter8;

public class ComplexTest {
//done done
	public static void main(String[] args) {
		Complex number1 = new Complex(2, -2);
		Complex number2 = new Complex(3, -1);
		
		System.out.printf("%s add to %s is %s%n", number1, number2, Complex.add(number1, number2));
		System.out.printf("%s substract %s is %s", number1, number2, Complex.substract(number1, number2));
	}

}
