package chapter7;
//done done
public class TurtleGraphics {
	private static final int side = 20; 
	private static int[] position = new int[2];
	private static int[][] floor = new int[side][side];
	private enum Directions {RIGHT, DOWN, LEFT, UP};
	private static boolean pen = false;
	private static Directions direction;
	
	
	public TurtleGraphics(){
		direction = Directions.RIGHT;
	}
	
	public static void getPositionDirectionPen(){
		System.out.printf("Position: (%d;%d).%nDirection: %s.%nPen is %s.%n%n",
				position[0], position[1], direction, (pen)? "UP":"DOWN");
		 
	}
	
	public static void penUp(){
		pen = false;
	}
	
	public static void penDown(){
		pen = true;
	}
	
	public static void turnRight(){
		switch(direction){
		case RIGHT:
			direction = Directions.DOWN;
			break;
		case DOWN:
			direction = Directions.LEFT;
			break;
		case LEFT:
			direction = Directions.UP;
			break;
		case UP:
			direction = Directions.RIGHT;
		
		}
		
	}
	
	public static void turnLeft(){
		switch(direction){
		case RIGHT:
			direction = Directions.UP;
			break;
		case UP:
			direction = Directions.LEFT;
			break;
		case LEFT:
			direction = Directions.DOWN;
			break;
		case DOWN:
			direction = Directions.RIGHT;
		}
		
	}

	public static void move(int distance){
		
		switch(direction){
		case RIGHT:
			if(pen){
				for(int i = 0; position[1] < floor[position[0]].length && i < distance; i++){
					floor[position[0]][position[1]] = 1;
					position[1] += 1; 
				}
			}else if(position[1] + distance < floor[position[0]].length){
				position[1] += distance;
			}else{
				position[1] = floor[position[0]].length - 1;
			}
			break;
		case DOWN:
			if(pen){
				for(int i = 0; position[0] < floor.length && i < distance; i++){
					floor[position[0]][position[1]] = 1;
					position[0] += 1;
				}
			}else if(position[0] + distance < floor.length){
				position[0] += distance;
			}else{
				position[0] = floor.length - 1;
			}
			break;
		case LEFT:
			if(pen){
				for(int i = 0; position[1] > 0 && i < distance; i++){
					floor[position[0]][position[1]] = 1;
					position[1] -= 1;
				}
			}else if(position[1] - distance >= 0){
				position[1] -= distance;
			}else{
				position[1] = 0;
			}
			break;
		case UP:
			if(pen){
				for(int i = 0; position[0] > 0 && i < distance; i++){
					floor[position[0]][position[1]] = 1;
					position[0] -= 1;
				}
			}else if(position[0] - distance >= 0){
				position[0] -= distance;
			}else{
				position[0] = 0;
			}
		}
		
	}
	
	public static void display(){
		
		for(int[] row : floor){
			for(int element : row){
				if(element == 0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void reset(){
		
		for(int i = 0; i < floor.length; i++){
			for(int j = 0; j < floor[i].length; j++){
				floor[i][j] = 0;
			}
		}
		position[0] = position[1] = 0;
		
		
	}
	
	public static void menu(){
		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
				"0) Current position and direction of the turtle.",
				"1) Set pen up.",
				"2) Set pen down",
				"3) Turn right",
				"4)Turn left",
				"5) Move a distance",
				"6) Display the floor",
				"7) Clean the floor",
				"9) Exit");
	}
	
}
