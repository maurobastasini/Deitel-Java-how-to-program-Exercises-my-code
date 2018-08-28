package chapter5;

import java.security.SecureRandom;

public class SecureRandomTest {

	public static void main(String[] args) {
		SecureRandom randGenerator = new SecureRandom();
		
		int num1 = 1 + randGenerator.nextInt(2);
		int num2 = 1 + randGenerator.nextInt(100);
		int num3 = randGenerator.nextInt(10);
		int num4 = 1000 + randGenerator.nextInt(13);
		int num5 = -1 + randGenerator.nextInt(3);
		int num6 = -3 + randGenerator.nextInt(15);
		
		int num7 = 2 + 2 * randGenerator.nextInt(5);
		int num8 = 3 + 2 * randGenerator.nextInt(5);
		int num9 = 6 + 4 * randGenerator.nextInt(5);

		
	}

}
