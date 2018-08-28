package chapter8;
//done done
public enum TrafficLight{
	RED(60), YELLOW(5), GREEN(55);
	private int secondsOfDuration;
	
	TrafficLight(int secondsOfDuration){
		if(secondsOfDuration < 0){
			throw new IllegalArgumentException("Seconds " + secondsOfDuration + 
					" must be greater than 0");
		}
		
		this.secondsOfDuration = secondsOfDuration;
	}
	
	public int getSecondsOfDuration(){
		return secondsOfDuration;
	}
}
