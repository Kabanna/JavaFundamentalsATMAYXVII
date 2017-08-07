package ua.org.oa.examples.practice_2;

public class TestPZ2 {
	public static void main(String[] args) {
		System.out.println("-----------------First Task ---------------------");
		Task1 objectTask1 = new Task1("DDima", "EEvlash");
		objectTask1.methodTask1();
		System.out
				.println("-----------------Second Task ---------------------");
		Task2 objectTask2 = new Task2("Solving");
		objectTask2.methodTask2();
		System.out.println("-----------------Third Task ---------------------");
		Task3 objectTask3 = new Task3("HelloWord");
		objectTask3.methodTask3();
		System.out
				.println("-----------------Fourth Task ---------------------");
		Task4 objectTask4 = new Task4("Hello Word");
		objectTask4.methodTask4();
		System.out.println("-----------------Fifth Task ---------------------");
		Task5 objectTask5 = new Task5("bob is bab");
		objectTask5.methodTask5();
		System.out.println("-----------------Sixth Task ---------------------");
		Task6 objectTask6 = new Task6("th*is is sum*mer");
		objectTask6.methodTask6();
		System.out
				.println("-----------------Seventh Task ---------------------");
		Task7 objectTask7 = new Task7("mama is this summer or winter");
		objectTask7.methodTask7();
		System.out
				.println("-----------------Eighth Task ---------------------");
		Task8 objectTask8 = new Task8("mama is this summer or winter", "is");
		objectTask8.methodTask8();
	}

}

class Task1 {
	private String st1 = null;
	private String st2 = null;
	private String st3 = null;

	public Task1(String st1, String st2) {
		this.st1 = st1;
		this.st2 = st2;
	}

	public void methodTask1() {
		System.out.println("First string: " + st1);
		System.out.println("Second string: " + st2);
		st3 = st1.substring(1) + st2.substring(1);
		System.out.println("First + Second string: " + st3);
	}

}

class Task2 {

	private String st1 = null;
	private String st3 = null;

	public Task2(String st1) {
		this.st1 = st1;
	}

	public void methodTask2() {
		if (st1.length() >= 3) {
			System.out.println("String: " + st1);
			st3 = st1.substring(st1.length() / 2 - 1, st1.length() / 2 + 2);
			System.out.println("New string: " + st3);
		} else
			System.out.println("Uncorrect input");
	}
}

class Task3 {
	private String st1 = null;
	private String st3 = null;

	public Task3(String st1) {
		this.st1 = st1;
	}

	public void methodTask3() {
		if (st1.length() >= 3) {
			System.out.println("String: " + st1);
			st3 = st1.substring(st1.length() - 2)
					+ st1.substring(0, st1.length() - 2);
			System.out.println("New string: " + st3);
		} else
			System.out.println("Uncorrect input");
	}
}

class Task4 {
	private String st1 = null;
	private String st3 = null;

	public Task4(String st1) {
		this.st1 = st1;
	}

	public void methodTask4() {
		StringBuilder strBld1 = new StringBuilder(st1);
		System.out.println("Old String: " + strBld1);
		for (int i = 0; i < strBld1.length(); i += 2) {
			strBld1 = strBld1.insert(i, strBld1.charAt(i));
		}
		st3 = strBld1.toString();
		System.out.println("New string: " + st3);
	}
}

class Task5 {
	private String st1 = null;

	public Task5(String st1) {
		this.st1 = st1;
	}

	public void methodTask5() {

		int j = 0;
		for (int i = 0; i < st1.length() - 2; i++) {
			if (st1.charAt(i) == 'b' && st1.charAt(i + 2) == 'b')
				j++;
		}
		System.out.println("String: " + st1);
		System.out.println("Number of b*b in the string: " + j);
	}
}

class Task6 {
	private String st1 = null;
	private String st3 = null;

	public Task6(String st1) {
		this.st1 = st1;
	}

	public void methodTask6() {
		StringBuilder strBld1 = new StringBuilder(st1);
		System.out.println("String: " + st1);
		for (int i = 1; i < strBld1.length() - 1; i++) {
			if (strBld1.charAt(i) == '*') {
				strBld1 = strBld1.delete(i - 1, i + 2);
			}
		}
		st3 = strBld1.toString();
		System.out.println("New string: " + st3);
	}
}

class Task7 {
	private String st1 = null;

	public Task7(String st1) {
		this.st1 = st1;
	}

	public void methodTask7() {
		System.out.println("String: " + st1);
		int j = 0;
		for (int i = 0; i < st1.length(); i++) {
			if (st1.charAt(i) == ' '
					&& (st1.charAt(i - 1) == 'a' || st1.charAt(i - 1) == 's'))
				j++;
		}
		System.out
				.println("Number of the words in the text which end with 'a' or 's' is "
						+ j);
	}
}

class Task8 {
	private String st1 = null;
	private String st2 = null;
	private String st3 = null;

	public Task8(String st1, String st2) {
		this.st1 = st1;
		this.st2 = st2;
	}

	public void methodTask8() {
		System.out.println("String1: " + st1);
		System.out.println("String2: " + st2);
		st3 = st1.replace(st2, "");
		System.out.println("New string: " + st3);
	}
}