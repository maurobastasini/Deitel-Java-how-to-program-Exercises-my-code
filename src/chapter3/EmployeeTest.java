package chapter3;
//It works fine...
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("John", "Doe", 5000);
		Employee employee2 = new Employee("Jane", "Doe", 8400);
		Employee employee3 = new Employee();
		
		System.out.printf("First employee %s. His yearly salary is: %.2f.%n",
				employee1.toString(), (employee1.getMonthlySalary()*12));
		
		System.out.printf("Second employee %s. His yearly salary is: %.2f.%n",
				employee2.toString(), (employee2.getMonthlySalary()*12));
		
		employee1.setMonthlySalary(employee1.getMonthlySalary()*1.1);
		employee2.setMonthlySalary(employee2.getMonthlySalary()*1.1);
		
		System.out.printf("First employee %s. His yearly salary is: %.2f.%n",
				employee1.toString(), (employee1.getMonthlySalary()*12));
		
		System.out.printf("Second employee %s. His yearly salary is: %.2f.%n",
				employee2.toString(), (employee2.getMonthlySalary()*12));

	}

}
