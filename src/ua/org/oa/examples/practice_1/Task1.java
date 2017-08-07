package ua.org.oa.examples.practice_1;


public class Task1 {
	private byte byteVar;
	private short shortVar;
	private int intVar;
	private long longVar;
	private char charVar;
	private float floatVar;
	private double doubleVar;
	private boolean booleanVar;

	public void methodTask1() {
		System.out.println("Default meaning of bite var.: " + byteVar);
		System.out.println("Default meaning of short var.: " + shortVar);
		System.out.println("Default meaning of int var.: " + intVar);
		System.out.println("Default meaning of long var.: " + longVar);
		System.out.println("Default meaning of char var.: " + charVar);
		System.out.println("Default meaning of float var.: " + floatVar);
		System.out.println("Default meaning of double var.: " + doubleVar);
		System.out.println("Default meaning of boolean var.: " + booleanVar);
		byte byteLocalVar = byteVar;
		short shortLocalVar = shortVar;
		int intLocalVar = intVar;
		long longLocalVar = longVar;
		char charLocalVar = charVar;
		float floatLocalVar = floatVar;
		double doubleLocalVar = doubleVar;
		boolean booleanLocalVar = booleanVar;
		System.out.println("Default meaning of bite var.: " + byteLocalVar);
		System.out.println("Default meaning of short var.: " + shortLocalVar);
		System.out.println("Default meaning of int var.: " + intLocalVar);
		System.out.println("Default meaning of long var.: " + longLocalVar);
		System.out.println("Default meaning of char var.: " + charLocalVar);
		System.out.println("Default meaning of float var.: " + floatLocalVar);
		System.out.println("Default meaning of double var.: " + doubleLocalVar);
		System.out.println("Default meaning of boolean var.: "
				+ booleanLocalVar);

	}

}