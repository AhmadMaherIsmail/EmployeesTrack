
public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	public PartTimeEmployee(String name, String ssn, int age, int hoursWorked, double hourlyRate) {
		super(name, ssn, age);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double wage() {
		return hoursWorked * hourlyRate;
	}
	public String toString() {
		return super.toString() + String.format(", Hours Worked: %d, Hourly Rate: $%.2f", hoursWorked, hourlyRate);
	}
}
