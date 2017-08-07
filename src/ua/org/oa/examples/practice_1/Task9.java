package ua.org.oa.examples.practice_1;

/*9) Две переменные типа int, имеют положительные значения int a - начало
 *  диапазона, int b - конец диапазона, a>b. Вычислить среднее значение
 *  чисел в заданном диапазоне.*/
public class Task9 {
	private int a = 0;
	private int b = 0;

	public Task9(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void methodTask9() {
		if (a > b) {
			int sum = 0;
			for (int i = a; i >= b; i--)
				sum += i;
			System.out.println("Rang numbers average value: " + sum / (a - b+1));
		} else
			System.out.println("Wrong rang");
	}
}
