package chapter3;

public class HealthProfile {
	
	private String firstName,
					lastName,
					gender;
	private int dayBirth,
				monthBirth,
				yearBirth,
				height,
				weight;
	

	
	public HealthProfile(String firstName, String lastName, String gender, int dayBirth, int monthBirth, int yearBirth,
			int height, int weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dayBirth = dayBirth;
		this.monthBirth = monthBirth;
		this.yearBirth = yearBirth;
		this.height = height;
		this.weight = weight;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public int getDayBirth(){
		return dayBirth;
	}
	
	public void setDayBirth(int dayBirth){
		this.dayBirth = dayBirth;
	}
	
	public int getMonthBirth(){
		return monthBirth;
	}
	
	public void setMonthYear(int monthBirth){
		this.monthBirth = monthBirth;
	}
	
	public int getYearBirth(){
		return yearBirth;
	}
	
	public void setYearBirth(int yearBirth){
		this.yearBirth = yearBirth;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	public int calculateAge(int currentDay, int currentMonth, int currentYear){
		int age = currentYear - yearBirth;
		if (currentMonth - monthBirth < 0){
			age--;
		}
		if (currentMonth-monthBirth == 0){
			if (currentDay - dayBirth < 0){
				age--;
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
	
	public int calculateBMI(){
		int BMI = (weight * 703) / (height * height);
		return BMI;
	}
	
	public String toString() {
		String s = String.format("First Name: %s, Last Name: %s, Date of birth: %d/%d/%d and Gender: %s%n",
				firstName, lastName, dayBirth, monthBirth, yearBirth, gender);
		return s;
		
	}
	
	
	
	
	
				

}
