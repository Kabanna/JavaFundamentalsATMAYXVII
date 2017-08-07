package ua.org.oa.examples.home_work_4;

public class TestFoto {
	/**
	 * 1. Создать иерархию классов, описывающую заданные объекты
	 * 2. Поля каждого из создаваемых классов должны быть инкапсулированы
	 * 3. Предусмотреть инициализацию полей на этапе создания объектов класса
	 * 4. При необходимости переопределить специфические методы в дочерних классах
	 * 5. Все объекты, указанные в задании, должны быть объединены в один массив
	 * 	  или ArrayList.
	 * 6. На этапе составления программы должны быть использованы соглашения из java
	 * 	  code convention.
	 * 8. Имя пакета в котором создается класс/классы должно иметь формат
	 * 	  ua.org.oa.<Jira Login>.
	 * 9. Выполненное задание переслать в SVN репозатарий по адресу
	 * 	  http://oracle-academy.org.ua/svn/<Имя проекта>/<Jira login>

	 * Задание: Создать классы, описывающие Фототехнику (цифровые фотоаппараты,
	 * зеркальные, со сменной оптикой). Создать 5 объектов различных типов. Определить
	 * методы для вывода информации о фототехнике:
	 * - все цифровые фотоаппараты, имеющие количество пикселей в матрице больше
	 *   указанного значения
	 * - все зеркальные фотоаппараты, которые являются полноформатными
	 * - со сменной оптикой, которые находятся в определенном ценовом диапазоне
	 */

	public static void main(String[] args) {

		// создание объектов камер
		Foto canonCompact = new DigitalCompactCamera("Canon", 2000, "compact",
				true, 6400, 14, 5);
		Foto pentaxCompact = new DigitalCompactCamera("Pentax", 2500, "crop",
				true, 1600, 10, 3);
		Foto nikonDslr = new DigitalWithLensesDslr("Nikon", 10000, "fullframe",
				false, 25600, 24, "N-mount", "Semi-Pro");
		Foto sonyWithLenses = new DigitalWithLensesCompact("Sony", 5000,
				"crop", true, 9600, 18, "A-mount");
		Foto canonDslr = new DigitalWithLensesDslr("Canon", 12500, "fullframe",
				true, 102000, 22, "EF-mount", "Pro");

		// добавление объектов в лист
		Foto.addFoto(canonCompact);
		Foto.addFoto(nikonDslr);
		Foto.addFoto(sonyWithLenses);
		Foto.addFoto(pentaxCompact);
		Foto.addFoto(canonDslr);
		// вывод инфо о всех камер
		Foto.showAllCamera();
		// вывод камер с количеством мегапикселей больше 15
		Foto.showMoreMpx(15);
		// вывод всех полнокадровых камер
		Foto.showFullFrameCamera();
		// вывод камер со сменной оптикой в ценовом дипазоне от 2100 до 9000
		Foto.showCameraWithLensesAndPrice(2100, 9000);

	}

}
