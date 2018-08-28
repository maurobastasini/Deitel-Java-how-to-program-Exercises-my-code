package chapter8;
//done done
public class Time2 {
	private int seconds;
	
	public Time2(){
		seconds = 0;
	}
	
	public Time2(int hour){
		this(hour, 0, 0);
	}
	
	public Time2(int hour, int minute){
		this(hour, minute, 0);
	}
	
	public Time2(Time2 time){
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	public Time2(int hour, int minute, int second){
		if(hour < 0 || hour >= 24){
			throw new IllegalArgumentException("Hour must be between 0 and 24");
		}
		if(minute < 0 || minute >= 60){
			throw new IllegalArgumentException("Minutes must be between 0 and 24");
		}
		if(second < 0 || second >= 60){
			throw new IllegalArgumentException("Minutes must be between 0 and 24");
		}
		
		minute += hour * 60;
		second += minute * 60;
		this.seconds = second;
	}
	
	public void setTime(int hour, int minute, int second){
		if(hour < 0 || hour >= 24){
			throw new IllegalArgumentException("Hour must be between 0 and 24");
		}
		if(minute < 0 || minute >= 60){
			throw new IllegalArgumentException("Minutes must be between 0 and 24");
		}
		if(second < 0 || second >= 60){
			throw new IllegalArgumentException("Minutes must be between 0 and 24");
		}
		
		minute += hour * 60;
		second += minute * 60;
		this.seconds = second;
	}
	
	public int getHour(){
		return seconds / 3600;
	}
	
	public void setHour(int hour){
		if(hour < 0 || hour >= 24){
			throw new IllegalArgumentException("Hour must be between 0 and 24");
		}
		seconds += hour * 3600 - getHour();
	}
	

	public int getMinute(){
		return (seconds % 3600) / 60;
	}
	
	public void setMinute(int minute){
		if(minute < 0 || minute >= 60){
			throw new IllegalArgumentException("Minute must be between 0 and 60");
		}
		seconds += minute * 60 - getMinute();
	}
	
	public int getSecond(){
		return seconds % 60;
	}
	
	public void setSecond(int second){
		if(second < 0 || second >= 60){
			throw new IllegalArgumentException("Second must be between 0 and 60");
		}
		seconds += second - getSecond();
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d %s", getHour() % 12, getMinute(), getSecond(),
				(getHour() < 12)? "a.m." : "p.m.");
	}
	
	public void tick(){
		seconds++;
		validateSeconds();
		
	}
	
	public void incrementMinute(){
		seconds += 60;
		validateSeconds();
	}
	
	public void incrementHour(){
		seconds += 3600;
		validateSeconds();
	}
	
	public void validateSeconds(){
		if(seconds > 86400){
			seconds -= 86400;
		}
	}
}
