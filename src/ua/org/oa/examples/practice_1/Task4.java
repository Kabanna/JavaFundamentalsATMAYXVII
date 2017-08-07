package ua.org.oa.examples.practice_1;

/*4) Заданы значения 2-х катетов и гипотенузы треугольника. Проверить
 * является ли данный треугольник прямоугольным. Вычисления записать
 * выражением, состоящим из одной строки (используя оператор “?:”).*/
public class Task4 {
	private int a = 0;
	private int b = 0;
	private int c = 0;

	public Task4(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void methodTask4() {
		System.out.println((c * c == a * a + b * b) ? "This is right triangle"
				: "This is not right triangle");

	}
}
