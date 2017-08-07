package ua.org.oa.examples.practice_1;

/*3) Создайте переменную типа short. Инициализаируйте ее результатом
 *  выполнения следующих операций:
	- суммой двух целых чисел;
	- суммой целого и дробного чисел;
	- суммой значений переменных типов float и int;
	- суммой значений переменных типа byte + short;
	- суммой значений переменных типа float + double;*/
public class Task3 {
	private short shortVar1 = 1 + 2;
	private short shortVar2 = (short) (1 + 2.7);
	private short shortVar3 = (short) (2.7f + 2);
	private byte byteVar = 3;
	private short shortVar = 3;
	private short shortVar4 = (short) (byteVar + shortVar);
	private float floatVar = 2.5f;
	private double doubleVar = 2.4;
	private short shortVar5 = (short) (floatVar + doubleVar);

	public void methodTask3() {
		System.out.println("Meaning of the shortVar1: " + shortVar1);
		System.out.println("Meaning of the shortVar2: " + shortVar2);
		System.out.println("Meaning of the shortVar3: " + shortVar3);
		System.out.println("Meaning of the shortVar4: " + shortVar4);
		System.out.println("Meaning of the shortVar5: " + shortVar5);
	}
}
