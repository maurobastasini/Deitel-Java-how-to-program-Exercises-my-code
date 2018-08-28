package chapter5;
//complete and functional
public class PatternTriangles {

	public static void main(String[] args) {
		int space = 0;
		//first Triangle
		for (int i = 1; i <= 10; i++){
			for (int j = 1; j <= i; j++){
				System.out.print("*");
			}	
			System.out.println();
		}
		
		//separation
		System.out.println();

		//second Triangle		
		for (int i = 1; i <= 10; i++){
			for (int j = 10; j >= i; j--){
				System.out.print("*");
			}	
			System.out.println();
		}
		
		//separation
		System.out.println();
		
		//third Triangle		
		for (int i = 0; i < 10; i++){
			for (int k = 0; k < i ; k++){
				System.out.print(" ");
			}
			for (int j = 10; j > i; j--){
				System.out.print("*");
			}	
			System.out.println();

		}
		
		//separation
		System.out.println();
		
		//fourth Triangle		
				for (int i = 0; i < 10; i++){
					for (int j = 10; j > i; j--){
						System.out.print(" ");
					}
					for (int k = 0; k < i ; k++){
						System.out.print("*");
					}	
					System.out.println();
				}

	}

}
