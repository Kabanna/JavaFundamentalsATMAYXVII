package ua.org.oa.examples.practice_1;

/*8) Имея три переменных типа int a, b, c выведите на экран “true”, если
 *  сумма значений двух любых из этих переменных равна значению третьей.*/
public class Task8 {
	private int a = 0;
	private int b = 0;
	private int c = 0;

	public Task8(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void methodTask8() {
		if (a + b == c || a + c == b || c + b == a)
			System.out.println((a + b == c || a + c == b || c + b == a));
		else
			System.out.println((a + b == c || a + c == b || c + b == a));
	}
}
