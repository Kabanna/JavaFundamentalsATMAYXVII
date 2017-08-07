package ua.org.oa.examples.home_work_2;

import java.util.Scanner;

public class TestLibraryBook {

	/**
	 Для решения задачи создать java программу, удовлетворяющую следующим
	 требованиям:
	 1. Спроектировать базовый класс, содержащий в качестве полей другие
	 классы.
	 2. Предусмотреть возможность создания объектов с указанием различных
	 параметров инициализации.
	 3. Каждый класс, поле, метод должен иметь название, отражающее его суть
	 и комментарии, описывающие их предназначение.
	 4. Продемонстрировать использование перегруженных методов и конструкторов,
	 массивов.
	 5. При инициализации полей классов проверять корректность введенных данных.
	 6. Создать класс демонстрирующий корректность работы разработанной java
	 программы.
	 7. На этапе составления программы должны быть использованы соглашения из
	 java code convention.
	 8. Имя пакета в котором создается класс/классы должно иметь формат
	 ua.org.oa.<Jira Login>.
	 9. Индивудуальная папка в SVN репозатарии для сохранения выполненных заданий
	 располжена по адресу http://oracle-academy.org.ua/svn/<Имя проекта>/<Jira
	 login>
	 10. Опционально: организовать ввод данных с консоли

	 Задание: Создать классы библиотека и книги. В классе библиотека создать методы
	 для вычисления  средней остаточной стоимости книг, и определить методы  для
	 вывода на экран всех книг, стоимость которых:
	 - выше средней по данной библиотеке;
	 - выше определенной суммы;
	 - ниже среднего по данной библиотеке;
	 - ниже определенной суммы.
	 */
	public static void main(String[] args) {

		Library myLibrary = new Library(); // создание объекта библиотеки

		Book dictionaryBook = new Book("Slovar", "Ivanov", 15.50, 2000);// создание
		// книг
		// с
		// параметрами

		Book programmingBook = new Book("Program", "Petrov", 30.75, 2008);

		Book cookBook = new Book("Cooking", "Sidorov", 20.00, 1000);

		Book bibliyaBook = new Book("Bibliya", "Iisus", 105.00, 2001);

		Book technicBook = new Book("Techica", "Smith", 2.33, 2011);

		myLibrary.addBookToLibrary(dictionaryBook);// добавление книг в
		// библиотеку
		myLibrary.addBookToLibrary(programmingBook);
		myLibrary.addBookToLibrary(cookBook);
		myLibrary.addBookToLibrary(bibliyaBook);
		myLibrary.addBookToLibrary(technicBook);

		System.out.println("Количество книг в библиотеке: "
				+ myLibrary.myBooks.size());// вывод количества книг в
		// библиотеке

		myLibrary.calculateAveragePriceAllBooks();// расчет средней остаточной
		// стоимости всех книг в
		// библиотеке

		System.out.println("Выбирете пункт:");
		System.out.println("1. Вывести все книги в библиотеке");
		System.out
				.println("2. Вывести книги с остаточной стоимсотью выше средней");
		System.out
				.println("3. Вывести книги с остаточной стоимсотью ниже средней");
		System.out
				.println("4. Вывести книги с остаточной стоимсотью выше введенной (будет запрошена цена)");
		System.out
				.println("5. Вывести книги с остаточной стоимсотью ниже введенной (будет запрошена цена)");
		System.out.println("6. Добавить еще одну книгу к библиотеке");

		Scanner input2 = new Scanner(System.in);
		int inputItem = input2.nextInt();

		switch (inputItem) {
			case 1: {
				myLibrary.showAllBooks();
			}
			break;
			case 2: {
				myLibrary.showAllBooksAboveAvarege();
			}
			break;
			case 3: {
				myLibrary.showAllBooksBelowAvarege();
			}
			break;
			case 4: {
				System.out.println("Введите пороговую цену:"); // ввод стоимости
				// книги для выбора
				// книг выше или
				// ниже этой границы
				Scanner input = new Scanner(System.in);
				double inputCap = input.nextDouble();
				if (inputCap <= 0) {
					System.out.println("Введенное число должно быть больше нуля");
				} else {
					myLibrary.setTargetPrice(inputCap);
					myLibrary.showAllAboveInput();
				}
			}
			break;
			case 5: {
				System.out.println("Введите пороговую цену:"); // ввод стоимости
				// книги для выбора
				// книг выше или
				// ниже этой границы
				Scanner input = new Scanner(System.in);
				double inputCap = input.nextDouble();
				if (inputCap <= 0) {
					System.out.println("Введенное число должно быть больше нуля");
				} else {
					myLibrary.setTargetPrice(inputCap);
					myLibrary.showAllBelowInput();
				}
			}
			break;
			case 6: {
				Book emptyBook = new Book();// создание книги без параметров
				myLibrary.addBookToLibrary(emptyBook);
				System.out.println("Книга добавлена");
				myLibrary.showAllBooks();

			}
			break;

			default:
				System.out.println("Вы ввели неверное значение!");
				break;
		}

	}

}
