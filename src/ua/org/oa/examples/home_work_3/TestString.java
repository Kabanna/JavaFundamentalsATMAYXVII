package ua.org.oa.examples.home_work_3;

public class TestString {

	/**
	 * Создать java класс, обрабатывающий текст согласно вашему заданию и
	 * удовлетворяющий следующим требованиям:
	 * 1. Каждый класс, поле, метод должен иметь название, отражающее его суть и
	 * 	  комментарии, описывающие их предназначение.
	 * 2. На этапе составления программы должны быть использованы соглашения из
	 * 	  java code convention.
	 * 3. Для задания входного текста можно использовать переменную типа String,
	 * 	  содержащую не менее 5 строк текста (>400 символов), разбитого минимум на
	 * 	  3 предложения. Альтернативно (предпочтительнее, но по желанию) - считать
	 * 	  текст из файла на жестком диске.
	 * 4. Важно! Задания могут быть решены несколькими способами. Предложите
	 * 	  минимум 2 способа решения поставленной задачи.
	 * 5. Протестировать предложенное решение, продемонстрировать корректность
	 * 	  решения задачи каждым способом.
	 * 6. Имя пакета в котором создается класс/классы должно иметь формат
	 * 	  ua.org.oa.<Jira Login>.
	 * 7. Индивидуальная папка в SVN репозатарии для сохранения выполненных заданий
	 * 	  расположена по адресу http://oracle-academy.org.ua/svn/<Имя
	 * 	  проекта>/<Jira login>
	 *
	 * Задание: Определить количество вхождений заданного слова в текст, игнорируя
	 * регистр символов.
	 */
	public static void main(String[] args) {

		EqualsString eq1 = new EqualsString();
		ReadFromFile read = new ReadFromFile();
		/** раположение файла с текстом */
		String fileName = "testfile.txt";
		/** заданное(искомое слово) слово */
		String searchText = "ОРФО";

		System.out.println("Текст содержащийся в файле: " + fileName);
		System.out.println("-----------------------------------------------");
		System.out.println(read.ReadFile(fileName)); // вывод теста на экран
		System.out.println("-----------------------------------------------");

		System.out.println("Количество вхождений слова - " + searchText
				+ " используя первый способ поиска:");
		/** поиск вхождений по первому способу */
		eq1.checkEquals(read.ReadFile(fileName), searchText);
		System.out.println("Количество вхождений слова - " + searchText
				+ " используя второй способ поиска:");
		/** поиск вхождений по второму способу */
		eq1.checkEquals2(read.ReadFile(fileName), searchText);
		System.out.println("Количество вхождений слова - " + searchText
				+ " используя третий способ поиска:");
		/** поиск вхождений по третьему способу */
		eq1.checkEquals3(read.ReadFile(fileName), searchText);

	}

}
