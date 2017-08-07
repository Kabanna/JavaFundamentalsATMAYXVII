package ua.org.oa.examples.practice_1;
/*7) Подсчитать сумму простых чисел в диапазоне от 1 до 20.*/
public class Task7_1 {
	private int a = 0;
	private int b = 0;

	public Task7_1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void methodTask7_1() {
		int sum = 0;
		boolean simple = true;
		System.out.println("This is the list of prime numbers in rang from "
				+ a + " to " + b);
		for (int i = a; i <= b; i++) {
			for (int j = 2; j < i; j++) {
				if ((j != i) && (i % j == 0)) {
					simple = false;
					break; }
			}
			if ((i != 1) & (simple == true)) {
				sum += i;//sum = sum + i;
				System.out.println(i);
			}
			simple = true;
		}
		System.out.println("Sum of prime numbers from " + a + " to " + b
				+ " is " + sum);
	}
}

