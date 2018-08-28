package chapter6;

public class TableBinaryOctarHex {

	public static void main(String[] args) {
		
		System.out.printf("%10s%10s%10s%10s%n", "Decimal", "Binary", "Octal", "Hex");
		for(int i = 0; i <= 255; i++){
			System.out.printf("%10d%10s%10s%10s%n", i, Integer.toBinaryString(i),
					Integer.toOctalString(i), Integer.toHexString(i));
		}
		

	}

}
