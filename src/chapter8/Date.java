/*
 *       Filename:  SetOfIntegers.java
 *
 *    Description:  Exercise 8.14 - Date Class
 *
 *        @Author:  Mauro Bastasini - maurobastasiniprof@gmail.com
 *       @Version:  1.0
 *       
 */


package chapter8;

public class Date {

	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // any year
	
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] MONTHS_OF_YEAR = { "", "January", "February", "March", "April", 
			"May", "June", "July", "August", "September", "October", "November", "December" };
	
	public Date(int month, int day, int year){
		if(year < 0){
			throw new IllegalArgumentException("year (" + year + ") must be greater than 0");
		}
		
		if (month <= 0 || month > 12){
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		}
		if (day <= 0 ||	(day > daysPerMonth[month] && !(month == 2 && day == 29))){
			throw new IllegalArgumentException("day (" + day +
			") out-of-range for the specified month and year");
		}
		if(month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
			throw new IllegalArgumentException("day (" + day + 
					") out-of-range for the specified month and year");
		}
		this.month = month;
		this.day = day;
		this.year = year;
			
		System.out.printf("Date object constructor for date %s%n", this);
	}
	
	public Date(){
		this(1, 1, 1990);
	}
	
	@Override
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
	
	public void nextDay(){
		if(day < daysPerMonth[month] - 1){
			day++;
		}else if(month < 12){
			month++;
			day = 1;
		}else{
			year++;
			month = 1;
			day = 1;
		}
	}
	
	public String toFormat1(){
		//   MM/DD/YYYY
		return String.format("%d/%d/%d", month, day, year);
	}
			
	public String toFormat2(){
		//   June 14, 1992
		return String.format("%s %d, %d", MONTHS_OF_YEAR[month], day, year);
	}
	
	public String toFormat3(){
		//   DDD YYYY
		int acumulatedDays = 0;
		for(int i = 1; i < month; i++){
			acumulatedDays += daysPerMonth[i];
		}
		acumulatedDays += day;
		
		return String.format("%d %d", acumulatedDays, year);
	}
	
}
