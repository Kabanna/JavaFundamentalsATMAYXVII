package ua.org.oa.examples.practice_1;

/*5) Подсчитать сумму целых чисел от 1 до 20.*/
public class Task5 {
	private int a = 0;
	private int b = 0;

	public Task5(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void methodTask5() {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println("Sum of integer numbers from " + a + " to " + b
				+ " is " + sum);

	}
}
