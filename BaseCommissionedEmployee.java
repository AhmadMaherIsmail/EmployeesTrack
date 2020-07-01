
public class BaseCommissionedEmployee extends CommissionedEmployee {
	private double baseSalary;
	public BaseCommissionedEmployee(String name, String ssn, int age, double totalSale, double commission, double baseSalary) {
		super(name, ssn, age, totalSale, commission);
		this.baseSalary = baseSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public double wage() {
		return super.wage() + baseSalary;
	}
	public String toString() {
		return super.toString() + String.format(", Base Salary: $%.2f", baseSalary);
	}
}
