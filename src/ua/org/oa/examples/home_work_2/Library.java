package ua.org.oa.examples.home_work_2;

import java.util.ArrayList;

public class Library {

	private double targetPrice; // цена для порога
	private double averagePriceAllBooks; // средняя остаточная стоимость книг
	private double sumPriceAllBooks;
	static ArrayList<Book> myBooks = new ArrayList<Book>();// массив хранения
	// объектов книг

	public double getTargetPrice() {
		return targetPrice;
	}

	public void setTargetPrice(double targetPrice) {
		this.targetPrice = targetPrice;
	}

	public void calculateAveragePriceAllBooks()// подсчет средней осточной
	// стоимости книг
	{

		sumPriceAllBooks = 0;
		for (Book el : myBooks) {
			sumPriceAllBooks += el.getDepreciatedCost();
		}
		averagePriceAllBooks = sumPriceAllBooks / myBooks.size();
		System.out.println("Средняя остаточная стоимость книг библиотеки:");
		System.out.printf("%4.2f", averagePriceAllBooks);
		System.out.println();
	}

	public void showAllBooksAboveAvarege() {
		System.out
				.println("Книги остаточная стоимость которых выше средней по библиотеке:");

		for (Book el : myBooks) {
			if (el.getDepreciatedCost() > averagePriceAllBooks) {

				System.out.println(el.getBookName());
				System.out.println(el.getAuthor());
				System.out.printf("%4.2f", el.getNewBookPrice());
				System.out.println();
				System.out.printf("%4.2f", el.getDepreciatedCost());
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}

	public void showAllBooksBelowAvarege() {
		System.out
				.println("Книги остаточная стоимость которых ниже средней по библиотеке:");

		for (Book el : myBooks) {
			if (el.getDepreciatedCost() < averagePriceAllBooks) {

				System.out.println(el.getBookName());
				System.out.println(el.getAuthor());
				System.out.printf("%4.2f", el.getNewBookPrice());
				System.out.println();
				System.out.printf("%4.2f", el.getDepreciatedCost());
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}

	public void showAllAboveInput() {
		System.out
				.print("Книги остаточная стоимость которых выше введеной цены:");
		System.out.printf("%4.2f", targetPrice);
		System.out.println();

		for (Book el : myBooks) {
			if (el.getDepreciatedCost() > targetPrice) {

				System.out.println(el.getBookName());
				System.out.println(el.getAuthor());
				System.out.printf("%4.2f", el.getNewBookPrice());
				System.out.println();
				System.out.printf("%4.2f", el.getDepreciatedCost());
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}

	public void showAllBelowInput() {
		System.out
				.print("Книги остаточная стоимость которых ниже введеной цены:");
		System.out.printf("%4.2f", targetPrice);
		System.out.println();

		for (Book el : myBooks) {
			if (el.getDepreciatedCost() < targetPrice) {

				System.out.println(el.getBookName());
				System.out.println(el.getAuthor());
				System.out.printf("%4.2f", el.getNewBookPrice());
				System.out.println();
				System.out.printf("%4.2f", el.getDepreciatedCost());
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}

	public void showAllBooks() {
		for (Book el : myBooks) {
			System.out.println("------------------------");
			System.out.println(el.getBookName());
			System.out.println(el.getAuthor());
			System.out.printf("%4.2f", el.getNewBookPrice());
			System.out.println();
			System.out.printf("%4.2f", el.getDepreciatedCost());
			System.out.println();

		}

	}

	public void addBookToLibrary(Book addingBook)// добавление книги в
	// массив(библиотеку)
	{

		myBooks.add(addingBook);
	}

}
