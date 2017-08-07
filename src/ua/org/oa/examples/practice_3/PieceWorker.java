package ua.org.oa.examples.practice_3;

public class PieceWorker extends Employee {

	private int output = 0;
	private double outputPaymant = 0;

	public PieceWorker(String name, int output, double outputPaymant) {
		super(name);
		this.output = output;
		this.outputPaymant = outputPaymant;
	}

	public double paymant() {
		double salary = output * outputPaymant;
		System.out.println(salary);
		return salary;
	}
}
