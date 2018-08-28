package chapter8;

import java.util.EnumSet;
//done done
public class TrafficLightTest {

	public static void main(String[] args) {
		for(TrafficLight light: TrafficLight.values()){
			System.out.printf("%-10s%-10d%n", light, light.getSecondsOfDuration());
		}
	}

}
