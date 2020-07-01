
public abstract class Employee {
	protected String ssn;
	protected String name;
	protected int age;
	public Employee(String ssn, String name, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract double wage();
	public String toString() {
		return String.format("Name: %s, SSN: %s, Age: %d", name, ssn, age);
	}
}
