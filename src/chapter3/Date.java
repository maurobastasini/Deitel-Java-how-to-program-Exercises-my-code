package chapter3;

public class Date {
	private int day,
				month,
				year;
	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		String s = String.format("%d/%d/%d%n", day, month, year);
		return s;
	}

}
