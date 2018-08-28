package chapter3;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee()
	{
		this.firstName = "John Doe";
		this.lastName = "John Doe";
		this.monthlySalary = 0.0;
	}
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	
	public String getFirstName(){
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
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0.0) {
			this.monthlySalary = monthlySalary;
		}
	}
	
	public String toString() {
		String s = String.format("First Name: %s, Last Name: %s and Monthly Salary: %.2f.%n",
				firstName, lastName, monthlySalary);
		return s;
	}


}
