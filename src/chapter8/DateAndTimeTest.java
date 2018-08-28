package chapter8;

//done done
public class DateAndTimeTest {

	public static void main(String[] args) {
		Time2 clock = new Time2(21, 9, 53);
		Date date1 = new Date(11, 25, 2017);
		DateAndTime dateTime = new DateAndTime(clock, date1);
		
		System.out.println(dateTime.toString());
		for(int i = 0; i < 32; i++){
			dateTime.incrementHour();
		}
		System.out.println(dateTime.toString());

	}

}
