package chapter5;
//complete and functional
public class DeMorgansLawTest {

	public static void main(String[] args) {
		String expresion1 = "!(x < 5) && !(y >= 7)";
		String expresion2 = "!(a == b) || !(g != 5)";
		String expresion3 = "!((x <= 8) && (y > 4))";
		String expresion4 = "!((i > 4) || (j <= 6))";
		
		String deMorgan1 = "!((x < 5) || (y >= 7))";
		String deMorgan2 = "!((a == b) && (g != 5))";
		String deMorgan3 = "!(x <= 8) || !(y > 4)";
		String deMorgan4 = "!(i > 4) && !(j <= 6)";
		
		System.out.printf("%-25s%-30s%n", "First expresion" , "De Morgan's Law applied");
		System.out.println();
		System.out.printf("%-25s%-30s%n", expresion1, deMorgan1);
		System.out.printf("%-25s%-30s%n", expresion2, deMorgan2);
		System.out.printf("%-25s%-30s%n", expresion3, deMorgan3);
		System.out.printf("%-25s%-30s%n", expresion4, deMorgan4);
		



	}

}
