package chapter5;
//complete and functional
public class Factorial {

	public static void main(String[] args) {
		long factorial = 1;
		System.out.printf("Number%30s%n", "Factorial");
		for (int i = 1; i <= 20; i++){
			factorial *= i;
			System.out.printf("%6d%,30d%n", i, factorial);
		}
		
		
	}

}
