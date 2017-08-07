package ua.org.oa.examples.practice_3;

public class CommissionWorker extends Employee {
	private double salary = 0;
	private double sale = 0;
	private double percent = 0;

	public CommissionWorker(String name, double salary, double sale,
			double percent) {
		super(name);
		this.salary = salary;
		this.sale = sale;
		this.percent = percent;
	}

	public double paymant() {
		double salary = this.salary + sale * percent / 100;
		System.out.println(salary);
		return salary;
	}
}
