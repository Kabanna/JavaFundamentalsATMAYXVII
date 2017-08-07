package ua.org.oa.examples.practice_1;

/*2) Создайте несколько переменных типа float. Присвойте этим переменным
 * следующие значения:
	- >1.<;
	- >1<;
	- >0x1<;
	- >0b1<;
	->1.0e1<;
	- >01<;*/
public class Task2 {
	private float floatVar1 = 1.f;
	private float floatVar2 = 1;
	private float floatVar3 = 0x1f;
	private float floatVar4 = 0b1;
	private float floatVar5 = 1.0e1f;
	private float floatVar6 = 01;

	public void methodTask2() {
		System.out.println("Meaning of the floatVar1: " + floatVar1);
		System.out.println("Meaning of the floatVar2: " + floatVar2);
		System.out.println("Meaning of the floatVar3: " + floatVar3);
		System.out.println("Meaning of the floatVar4: " + floatVar4);
		System.out.println("Meaning of the floatVar5: " + floatVar5);
		System.out.println("Meaning of the floatVar6: " + floatVar6);
	}
}
