package chapter7;

import java.security.SecureRandom;
//done... does not break when find a solution... another problem is that counter finishes on 65 not 64...
// do it cyclic.
public class RMK_KnightsTour {
	private static final SecureRandom rand = new SecureRandom();
	private static int[][] chessBoard = new int[8][8];
	private static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
	private static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
	private static int[][] accesibility = {{2, 3, 4, 4, 4, 4, 3, 2},
											{3, 4, 6, 6, 6, 6, 4, 3},
											{4, 6, 8, 8, 8, 8, 6, 4},
											{4, 6, 8, 8, 8, 8, 6, 4},
											{4, 6, 8, 8, 8, 8, 6, 4},
											{4, 6, 8, 8, 8, 8, 6, 4},
											{3, 4, 6, 6, 6, 6, 4, 3},
											{2, 3, 4, 4, 4, 4, 3, 2}};
	private static int currentRow = 0;
	private static int currentColumn = 0;
	private static int counter;
	private static int maxCounter = 0;
	
	public static void main(String[] args) {
		boolean attemp = false;
	
		for(int allRows = 0; allRows < 5; allRows++){
			for(int allColumns = 0; allColumns < 5; allColumns++){
				currentRow = allRows;
				currentColumn = allColumns;
				counter = 1;
				reset();
				
				for(int i = 0; i < 100; i++){
					
					for(int x = 0; x < 64; x++){
						attemp = move();
						if(attemp)
							continue;
						else{
							for(int j = 0; j < 8; j++){
								attemp = move();
								if(attemp)
									break;
							}
						}
					}
					
					if(counter > 64){
						System.out.println("achieved");
						display();
						System.out.println(counter);
						break;
					}
				
					if(counter > maxCounter){
						maxCounter = counter;
					}
							
				}
				
						
			}
		}
		System.out.println(counter);
	}
	
	public static boolean move(){
		int minAccesibility = 100;
		int movement = 10;
		
		for(int i = 0; i < 8; i++){
			int nextRow = currentRow + vertical[i];
			int nextColumn = currentColumn + horizontal[i];
			
			if(nextRow < 8 && nextRow > -1){
				if(nextColumn < 8 && nextColumn > -1){
					if(chessBoard[nextRow][nextColumn] == 0){
						if(accesibility[nextRow][nextColumn] < minAccesibility){
							minAccesibility = accesibility[nextRow][nextColumn];
							movement = i;
						}
					}
				}
			}
			
			
		}
		if(movement != 10){
			currentRow += vertical[movement];
			currentColumn += horizontal[movement];
			chessBoard[currentRow][currentColumn] = counter++;
			for(int i = 0; i < accesibility.length; i++){
				int nextRow = currentRow + vertical[i];
				int nextColumn = currentColumn + horizontal[i];
				if(nextRow < 8 && nextRow > -1){
					if(nextColumn < 8 && nextColumn > -1){
						accesibility[nextRow][nextColumn] -= 1;
					}
				}
			}
			return true;
		}
		return false;
	}
	
	public static void display(){
		for(int i = 0; i < chessBoard.length; i++){
			for(int j = 0; j < chessBoard[i].length; j++){
				System.out.printf("%2d ", chessBoard[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void reset(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				chessBoard[i][j] = 0;
				
			}
		}
			
	}

}
