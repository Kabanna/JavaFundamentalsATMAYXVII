package ua.org.oa.examples.home_work_1;

public class TestFlat {
	/**
	 * Создать java-программу, удовлетворяющую следующим требованиям:
	 * 1. Создать класс, описывающий заданный объект. В каждом классе:
	 * 	- Определить минимум 5 полей трех различных типов характеризующих
	 * 	  заданный предмет;
	 * 	- Создать метод, выполняющий вычисление параметров на основании
	 * 	  значений полей объекта;
	 * 	- Определить метод для вывода информации об объекте на экран.
	 * 2. Каждый класс, поле, метод должен иметь название, отражающее его
	 * 	 суть и коментарии, описывающие их предназначение.
	 * 3. На этапе составления программы должны быть использованы соглашения
	 *    из java code convention.
	 * 4. Протестировать созданный вами класс, создав несколько экземпляров
	 *    класса (в методе main()), описывающего предмет, провести инициализацию
	 *    переменных-атрибутов каждого экземпляра и вызвать его методы.
	 * 5. Имя пакета в котором создается класс/классы должно иметь формат
	 *    ua.org.oa.<Jira Login>.
	 * 6. Индивудуальная папка в SVN репозатарии для сохранения выполненных
	 *    заданий располжена по адресу http://oracle-academy.org.ua/svn/<Имя
	 *    проекта>/<Jira login>
	 * Объект: Квартира
	 */
	public static void main(String[] args) {

		Flat premiumFlat = new Flat();
		premiumFlat.setFlatName("Premium");
		premiumFlat.setPriceForSqM(1000);
		premiumFlat.setSquareSqM(125);
		premiumFlat.setElevatorAvailability(true);
		premiumFlat.setDistanceFromSubway(150);
		premiumFlat.setDistrictName("centre");
		premiumFlat.setRoomCount(5);

		premiumFlat.displayFlatInformation();

		Flat cheapFlat = new Flat();
		cheapFlat.setFlatName("Cheap");
		cheapFlat.setPriceForSqM(500);
		cheapFlat.setSquareSqM(45);
		cheapFlat.setElevatorAvailability(false);
		cheapFlat.setDistanceFromSubway(2000);
		cheapFlat.setDistrictName("saltovka");
		cheapFlat.setRoomCount(2);

		cheapFlat.displayFlatInformation();
	}

}
