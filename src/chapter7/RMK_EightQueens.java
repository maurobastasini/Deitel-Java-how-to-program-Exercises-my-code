package chapter7;

import java.security.SecureRandom;
//done but you cant start in a different position or: two 2's are puttin in the same column or 7 queens in total..
/*
 * (Eight Queens: Brute-Force Approaches) In this exercise, you’ll develop several brute-force
approaches to solving the Eight Queens problem introduced in Exercise 7.24.
a) Use the random brute-force technique developed in Exercise 7.23 to solve the Eight
Queens problem.
b) Use an exhaustive technique (i.e., try all possible combinations of eight queens on the
chessboard) to solve the Eight Queens problem.
c) Why might the exhaustive brute-force approach not be appropriate for solving the
Knight’s Tour problem?
d) Compare and contrast the random brute-force and exhaustive brute-force approaches.
 * 
 */

public class RMK_EightQueens {
	private static int[][] chessBoard = new int[8][8];
	private static int[][] accesibility = {{22, 22, 22, 22, 22, 22, 22, 22},
											{22, 24, 24, 24, 24, 24, 24, 22},
											{22, 24, 26, 26, 26, 26, 24, 22},
											{22, 24, 26, 28, 28, 26, 24, 22},
											{22, 24, 26, 28, 28, 26, 24, 22},
											{22, 24, 26, 26, 26, 26, 24, 22},
											{22, 24, 24, 24, 24, 24, 24, 22},
											{22, 22, 22, 22, 22, 22, 22, 22}};
	private static final SecureRandom rand = new SecureRandom();
	private static int counterQueens = 0;
	
	public static void main(String[] args) {
		int[] positions = new int[2];
		newAccesibility();
		
	
		for(int j = 0; j < 300 || counterQueens == 8; j++){
			for(int i = 0; i < 8; i++){
				counterQueens = 0;
				positions = bestPosition();
				putQueen(positions[0], positions[1]);
				newAccesibility();
				
			}
		}
		display(chessBoard);
		
	
	}
	
	public static int[] bestPosition(){

		int minAccesibility = accesibility[0][0];
		int[] position = {2, 0};
		for(int i = 0; i < accesibility.length; i++){
			for(int j = 0; j < accesibility[i].length; j++){
				if(chessBoard[i][j] == 0){
					if(accesibility[i][j] < minAccesibility){
						minAccesibility = accesibility[i][j];
						position[0] = i;
						position[1] = j;
					}
				}
			}
		}
		return position;
	}
	
	
	
	public static void putQueen(int positionX, int positionY){
		chessBoard[positionX][positionY] = 2;
		for(int i = 0; i < chessBoard.length; i++){
			for(int j = 0; j < chessBoard[i].length; j++){
				if(chessBoard[positionX][j] == 0)
					chessBoard[positionX][j] = 1;
				if(chessBoard[i][positionY] == 0)
					chessBoard[i][positionY] = 1;
				if((i - j == positionX - positionY || i + j == positionX + positionY) && chessBoard[i][j] != 2){
					chessBoard[i][j] = 1;
				}
			}
		}
		counterQueens++;
		
	}
	
	public static void display(int[][] chessBoard){
		for(int i = 0; i < chessBoard.length; i++){
			for(int j = 0; j < chessBoard[i].length; j++){
				System.out.printf("%2d ", chessBoard[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void newAccesibility(){
		for(int i = 0; i < chessBoard.length; i++){
			for(int j = 0; j < chessBoard.length; j++){
				if(chessBoard[i][j] == 0){
					int counter = 0;
					for(int k = 0; k < chessBoard.length; k++){
						for(int l = 0; l < chessBoard.length; l++){
							if(chessBoard[k][l] == 0 && (i + j == k + l || i - j == k - l)){
								counter++;
							}
							else if(chessBoard[k][l] == 0 && k == i){
								counter++;
							}
							else if(chessBoard[k][l] == 0 && l == j){
								counter++;
							}
						}
					
					}
					accesibility[i][j] = counter;
				}
			}
		}
	}
	
	public static void reset(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				chessBoard[i][j] = 0;
				
			}
		}
			
	}
}
