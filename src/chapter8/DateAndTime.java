package chapter8;

//done done

public class DateAndTime {
	private Time2 time;
	private Date date;
	
	public DateAndTime(Time2 time, Date date){
		this.time = time;
		this.date = date;
	}
	
	public DateAndTime(){
		this(new Time2(), new Date());
	}
	
	public Time2 getTime() {
		return time;
	}

	public Date getDate() {
		return date;
	}

	public void setTime(Time2 time) {
		this.time = time;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public String toUniversalString() {
		return String.format("Date: %s. Time: %s", date.toString(), time.toUniversalString());
	}
	
	@Override
	public String toString() {
		return String.format("Date: %s. Time: %s", date.toString(), time.toString());
	}
	
	public void incrementHour(){
		time.incrementHour();
		if(time.getHour() == 0){
			date.nextDay();
		}
	}
	
	
	
	
}
