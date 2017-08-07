package ua.org.oa.examples.practice_3;

public class HourlyWorker extends Employee {
	private int mainHours = 0;
	private int overtimeHours = 0;
	private double mainPaymant = 0;
	private double overtimePaymant = 0;

	public HourlyWorker(String name, int mainHours, double mainPaymant,
			int overtimeHours, double overtimePaymant) {
		super(name);
		this.mainHours = mainHours;
		this.mainPaymant = mainPaymant;
		this.overtimeHours = overtimeHours;
		this.overtimePaymant = overtimePaymant;
	}

	public double paymant() {
		double salary = mainHours * mainPaymant + overtimeHours
				* overtimePaymant;
		System.out.println(salary);
		return salary;
	}
}
