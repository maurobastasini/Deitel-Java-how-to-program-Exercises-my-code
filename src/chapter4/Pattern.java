package chapter4;
//complete and functional
public class Pattern {

	public static void main(String[] args) {
		int row = 0;
		int column;
		while (row < 8){
			column = 0;
			while (column < 7){
				System.out.print("* ");
				column++;
			}				
			System.out.println();
			if (row % 2 == 0){
				System.out.print(" ");
			}
			row++;
		}
		
	}

}
