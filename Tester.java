import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> a = new ArrayList<Employee>();
		while (true) {
			System.out.println("1. Add an employee\n2. Delete an employee\n3. Compute wage\n4. Display all\n"
					+ "5. Exit\n-------\nEnter your choice:");
			int num = scan.nextInt();
			if (num == 5) {
				System.out.println("So long!");
				break;
			} else if (num == 1) {
				System.out.println("A. Add a full time employee\nB. Add a part time employee"
						+ "\nC. Add a commisssioned employee\nD. Add a Base commissioned employee\n"
						+ "E. Return to main menu");
				System.out.println("Enter employee");
				String s = scan.next();
				if (s.equalsIgnoreCase("E")) {
					continue;
				} else if (s.equalsIgnoreCase("A")) {
					System.out.println("Enter SSN, name, age, salary");
					String ssn = scan.next();
					scan.nextLine();
					String name = scan.nextLine();
					int age = scan.nextInt();
					double salary = scan.nextDouble();
					a.add(new FullTimeEmployee(ssn, name, age, salary));
				} else if (s.equalsIgnoreCase("B")) {
					System.out.println("Enter SSN, name, age, hours worked, rate");
					String ssn = scan.next();
					scan.nextLine();
					String name = scan.nextLine();
					int age = scan.nextInt();
					int hours = scan.nextInt();
					double rate = scan.nextDouble();
					a.add(new PartTimeEmployee(ssn, name, age, hours, rate));
				} else if (s.equalsIgnoreCase("C")) {
					System.out.println("Enter SSN, name, age, total sales, commission rate");
					String ssn = scan.next();
					scan.nextLine();
					String name = scan.nextLine();
					int age = scan.nextInt();
					double total = scan.nextDouble();
					double rate = scan.nextDouble();
					a.add(new CommissionedEmployee(ssn, name, age, total, rate));
				} else if (s.equalsIgnoreCase("D")) {
					System.out.println("Enter SSN, name, age, hours worked, rate, base salary");
					String ssn = scan.next();
					scan.nextLine();
					String name = scan.nextLine();
					int age = scan.nextInt();
					double total = scan.nextDouble();
					double rate = scan.nextDouble();
					double base = scan.nextDouble();
					a.add(new BaseCommissionedEmployee(ssn, name, age, total, rate, base));
				} else {
					System.out.println("Output Error!");
					continue;
				}
			} else if (num == 2) {
				System.out.println("Enter the SSN:");
				String ssn = scan.next();
				for (Employee e : a) {
					if (e.getSsn().equals(ssn)) {
						a.remove(e);
						break;
					}
				}
			} else if (num == 3) {
				System.out.println("Enter the SSN:");
				String ssn = scan.next();
				for (Employee e : a) {
					if (e.getSsn().equals(ssn)) {
						System.out.println(e.wage());
						break;
					}
				}
			} else if (num == 4) {
				for (Employee e : a) {
					System.out.printf("%s Wage: $%.2f\n", e, e.wage());
				}
			} else {
				System.out.println("Output error!");
				continue;
			}
		}

	}
}
