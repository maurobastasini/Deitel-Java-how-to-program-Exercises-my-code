package chapter8;
//done done
public class Time2Test {

	public static void main(String[] args) {
		Time2 clock1 = new Time2(23, 59, 50);
		Time2 clock2 = new Time2();
		clock2.setHour(8);
		clock2.setMinute(5);
		clock1.setSecond(5);
		clock1.setSecond(26);
		
		System.out.println(clock1);
		System.out.println(clock2);
		
		clock1.tick();
		clock1.incrementMinute();
		clock1.incrementHour();
		
		System.out.println(clock1);
	}

}
