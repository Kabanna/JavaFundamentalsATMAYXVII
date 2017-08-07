package ua.org.oa.examples.practice_1;

/*7) Подсчитать сумму простых чисел в диапазоне от 1 до 20.*/
public class Task7 {
	private int a = 0;
	private int b = 0;

	public Task7(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void methodTask7() {
		int sum = 0;
		System.out.println("This is the list of prime numbers in rang from "
				+ a + " to " + b);
		for (int i = a; i <= b; i++) {
			if (i > 1 && (factorial(i - 1) + 1) % i == 0) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of prime numbers from " + a + " to " + b
				+ " is " + sum);

	}

	public long factorial(long n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}
