package chapter3;

public class Prueba {

	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		while (count <= 10){
			sum += count++;
		}
		
		System.out.printf("The sum is : %d%n", sum);
	}

}
