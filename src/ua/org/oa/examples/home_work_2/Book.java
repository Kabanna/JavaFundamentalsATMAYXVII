package ua.org.oa.examples.home_work_2;

import java.util.Scanner;

public class Book {

	private String bookName;
	private String author;
	private double newBookPrice;
	private double depreciatedCost;// остаточная стоимость
	private int bookRealeseYear;// год выпуска книги
	private int nowYear = 2013;// текущий год
	private int ageOfBookLimit = 20;// срок древности книги

	public double getNewBookPrice() {
		return newBookPrice;
	}

	public void setNewBookPrice(double newBookPrice) {
		this.newBookPrice = newBookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {

		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookRealeseYear() {
		return bookRealeseYear;
	}

	public void setBookRealeseYear(int bookRealeseYear) {
		this.bookRealeseYear = bookRealeseYear;
	}

	public double getDepreciatedCost() {
		return depreciatedCost;
	}

	public void setDepreciatedCost(double depreciatedCost) {
		this.depreciatedCost = depreciatedCost;
	}

	public Book()// переопределенный конструктор добавления новой книги
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Введите название книги:");
		setBookName(in.nextLine());
		System.out.println("Введите автора книги:");
		setAuthor(in.nextLine());
		System.out.println("Введите цену книги:");
		setNewBookPrice(in.nextDouble());
		System.out.println("Введите год выпуска книги:");
		setBookRealeseYear(in.nextInt());

		this.calcDepreciatedCost();
	}

	public Book(String bookName, String author, double newBookPrice,
				int bookRealeseYear)// добавление новой книги
	{
		setBookName(bookName);
		setAuthor(author);
		setNewBookPrice(newBookPrice);
		setBookRealeseYear(bookRealeseYear);

		this.calcDepreciatedCost();
	}

	public void calcDepreciatedCost()// расчет остаточной стоимости книги
	{

		if ((nowYear - bookRealeseYear) >= ageOfBookLimit) {
			depreciatedCost = newBookPrice - 0.99 * newBookPrice;
		} else {
			depreciatedCost = newBookPrice
					- ((nowYear - bookRealeseYear) / (double) ageOfBookLimit)
					* newBookPrice;
		}

	}

}
