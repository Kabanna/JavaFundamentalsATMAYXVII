package ua.org.oa.examples.practice_1;

/*6) Подсчитать сумму четных целых цисел от 1 до 20.*/
public class Task6 {
	private int a = 0;
	private int b = 0;

	public Task6(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void methodTask6() {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println("Sum of even numbers from " + a + " to " + b
				+ " is " + sum);

	}
}