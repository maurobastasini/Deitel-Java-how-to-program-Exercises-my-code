package chapter5;
//complete and functional
//variable names in Spanish
//You can evade last if, if you get off the first iteration of the switch 
public class TheTwelveDaysOfChrismasSong {

	public static void main(String[] args) {
		String start = "On the ";
		String finish = " day of Christmas my true love sent to me";
		String renglon0;
		String day1 = "First";
		String day2 = "Second";
		String day3 = "Third";
		String day4 = "Fourth";
		String day5 = "Fifth";
		String day6 = "Sixth";
		String day7 = "Seventh";
		String day8 = "Eighth";
		String day9 = "Nineth";
		String day10 = "Tenth";
		String day11 = "eleventh";
		String day12 = "Twelveth";
		String renglon1 = "a partridge in a pear tree.";
		String renglon2 = "Two turtle doves,";
		String renglon3 = "Three French hens,";
		String renglon4 = "Four calling birds,";
		String renglon5 = "Five golden rings,";
		String renglon6 = "Six geese a-laying,";
		String renglon7 = "Seven swans a-swimming,";
		String renglon8 = "Eight maids a-milking,";
		String renglon9 = "Nine ladies dancing,";
		String renglon10 = "Ten lords a-leaping,";
		String renglon11 = "Eleven pipers piping,";
		String renglon12 = "Twelve drummers drumming,";
		

		for (int i = 1; i <= 12; i++){
			switch (i){
			case 1:
				renglon0 = start + day1 + finish;
				break;
			case 2:
				renglon0 = start + day2 + finish;
				break;
			case 3:
				renglon0 = start + day3 + finish;
				break;
			case 4:
				renglon0 = start + day4 + finish;
				break;
			case 5:
				renglon0 = start + day5 + finish;
				break;
			case 6:
				renglon0 = start + day6 + finish;
				break;
			case 7:
				renglon0 = start + day7 + finish;
				break;
			case 8:
				renglon0 = start + day8 + finish;
				break;
			case 9:
				renglon0 = start + day9 + finish;
				break;
			case 10:
				renglon0 = start + day10 + finish;
				break;
			case 11:
				renglon0 = start + day11 + finish;
				break;
			default:
				renglon0 = start + day12 + finish;
			}
			
			System.out.println(renglon0);
			switch (i){
			case 12:
				System.out.println(renglon12);		
			case 11:
				System.out.println(renglon11);
			case 10:
				System.out.println(renglon10);
			case 9:
				System.out.println(renglon9);
			case 8:
				System.out.println(renglon8);
			case 7:
				System.out.println(renglon7);
			case 6:
				System.out.println(renglon6);
			case 5:
				System.out.println(renglon5);
			case 4:
				System.out.println(renglon4);
			case 3:
				System.out.println(renglon3);
			case 2:
				System.out.println(renglon2);
			case 1:
				System.out.println(renglon1);			
			
			}
			System.out.println();
			
			if (i == 1){
				renglon1 = "and a partridge in a pear tree.";
			}
		}
		
		
		
		
		
		

	}

}
