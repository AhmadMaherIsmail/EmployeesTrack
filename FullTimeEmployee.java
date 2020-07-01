
public class FullTimeEmployee extends Employee {
	private double salary;
	public FullTimeEmployee(String name, String ssn, int age, double salary) {
		super(name, ssn, age);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double wage() {
		return salary;
	}
	public String toString() {
		return super.toString() + String.format(", Salary: %%.2f", salary);
	}
}
