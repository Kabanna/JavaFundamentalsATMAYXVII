package ua.org.oa.examples.practice_3;

public abstract class Employee {

	private String name = null;

	public Employee(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println(name);
	}

	abstract public double paymant();
}
