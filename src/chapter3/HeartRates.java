package chapter3;


//maximum rate = 220 - person's age
//target heart rate is = maximum rate *0.50 to 0.85 - person's age
public class HeartRates {
	
	private String firstName,
				lastName;
	private int day,
				month,
				year;
	
	public HeartRates() {
		
		this.firstName = "";
		this.lastName = "";
		this.day = 0;
		this.month = 0;
		this.year = 0;
		
	}

	public HeartRates(String firstName, String lastName, int day, int month, int year) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 0 && day < 32) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 0 && month < 13) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1900 && year < 2020) {
			this.year = year;
		}
	}
	
	public int calculateAge(int actualDay, int actualMonth, int actualYear) {
		int age = actualYear - year;
		if (actualMonth-month < 0) {
			--age;
		}
		if (actualMonth - month == 0){
			if (actualDay - day <= 0) {
				--age;
			}
		}
		return age;
	}
	
	public int calculateMaxHR(int age) {
		
		return 220 - age;
		
	}
	
	public String calculateTargetHR(int maxHeartRate) {
		double min = maxHeartRate * 0.5;
		double max = maxHeartRate * 0.85;
		String s = String.format("The target Heart Rate is between %.2f and %.2f",
				min, max);
		return s;
		
	}
	
	public String toString() {
		String s = String.format("First Name: %s, Last Name: %s, Date of birth: %d/%d/%d.",
				firstName, lastName, day, month, year);
		return s;
		
	}
	
	
	
	
}
