package chapter5;
//It works but repeat values for side 1 and 2 swapped
//page 197 (Pythagorean Triples)
public class __PythagoreanTriples {

	public static void main(String[] args) {
		
		int side1;
		int side2;
		int hypotenuse;
		
		System.out.printf("%10s%10s%15s%n", "SIde 1", "Side 2", "Hypotenuse");
		for (int i = 1; i <= 500; i++){
			for (int j = 1; j <= 500; j++){
				for (int k = 1; k <= 500; k++){
					if (Math.pow(k, 2) + Math.pow(j, 2) == Math.pow(i, 2)){
						System.out.printf("%10d%10d%15d%n", k, j, i);
					}
				}
					
			}
		}
		
		

	}

}
