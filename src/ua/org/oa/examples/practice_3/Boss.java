package ua.org.oa.examples.practice_3;

public class Boss extends Employee {

	private int weeks = 0;
	private double weekPaymant = 0;

	public Boss(String name, int weeks, double weekPaymant) {
		super(name);
		this.weeks = weeks;
		this.weekPaymant = weekPaymant;
	}

	public double paymant() {
		double salary = weeks * weekPaymant;
		System.out.println(salary);
		return salary;
	}
}
