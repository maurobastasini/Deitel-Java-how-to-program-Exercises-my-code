package chapter7;

import java.util.Scanner;
//done done
public class TurtleGraphicsTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TurtleGraphics turtle = new TurtleGraphics();
		int option;
		
		do{
					
			turtle.menu();
			option = input.nextInt();
			switch(option){
			case 0:
				turtle.getPositionDirectionPen();
				break;
			case 1:
				turtle.penUp();
				break;
			case 2:
				turtle.penDown();
				break;
			case 3:
				turtle.turnRight();
				break;
			case 4:
				turtle.turnLeft();
				break;
			case 5:				
				turtle.move(input.nextInt());
				break;
			case 6:
				turtle.display();
				break;
			case 7:
				turtle.reset();
				
			}
				
		}while(option != 9);
		

	}

}
