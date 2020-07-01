
public class CommissionedEmployee extends Employee {
	private double totalSale;
	private double commission;
	public CommissionedEmployee(String name, String ssn, int age, double totalSale, double commission) {
		super(name, ssn, age);
		this.totalSale = totalSale;
		this.commission = commission;
	}
	public double getTotalSale() {
		return totalSale;
	}
	public void setTotalSale(double totalSale) {
		this.totalSale = totalSale;
	}
	public double getCommision() {
		return commission;
	}
	public void setCommision(double commision) {
		this.commission = commision;
	}
	public double wage() {
		return totalSale * commission;
	}
	public String toString() {
		return super.toString() + String.format(", Total Sale: $%.2f, Commission: %.2f", totalSale, commission);
	}
}
