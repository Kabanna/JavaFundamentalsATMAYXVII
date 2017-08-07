package ua.org.oa.examples.practice_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Weather {

	/**
	 * Реализовать программу учета среднесуточной температуры на протяжении
	 * месяца. Ввод данных реализовать с консоли. Вначале должен быть выведен
	 * запрос названия месяца, затем значений температуры для каждого числа.
	 * Количество дней в месяце программа должна определять автоматически.
	 * Значения хранить в ArrayList. При вводе реализовать проверку корректности
	 * вводимых данных, если данные введены не корректно - запросить ввод
	 * повторно. После введения данных вывести среднемесячную температуру, дату
	 * когда была максимальная температура и минимальная с указанием ее
	 * значения.
	 */
	private String month = null;
	private int dayQuantity = 0;
	private boolean correctMonth = false;
	private double averageTemperature = 0;

	public void averageTemperature() {
		Scanner scaner = new Scanner(System.in);
		do {
			System.out.println("Введите месяц.");
			month = scaner.nextLine();
			switch (month) {
				case "Январь":
				case "Март":
				case "Май":
				case "Июль":
				case "Август":
				case "Октябрь":
				case "Декабрь":
					dayQuantity = 30;
					correctMonth = true;
					break;
				case "Апрель":
				case "Июнь":
				case "Сентябрь":
				case "Ноябрь":
					dayQuantity = 31;
					correctMonth = true;
					break;
				case "Февраль":
					dayQuantity = 29;
					correctMonth = true;
					break;
				default:
					System.out
							.println("Название месяца введено не корректно, повторите ввод:");
					break;
			}
		} while (!correctMonth);

		ArrayList<Double> temperature = new ArrayList<>();
		double temp = 0;
		double maxTemp = -50;
		double minTemp = 50;
		int maxTempDay = 0;
		int minTempDay = 0;
		double sumTemp = 0;
		for (int i = 0; i < dayQuantity;) {
			i++;
			System.out.println("Введите температуру для " + i + "-го числа");
			temp = scaner.nextDouble();
			if (-50 < temp && temp < 50) {
				temperature.add(temp);
				sumTemp += temp;
				if (maxTemp < temp) {
					maxTemp = temp;
					maxTempDay = i;
				}
				if (minTemp > temp) {
					minTemp = temp;
					minTempDay = i;
				}
			} else {
				System.out
						.println("Введено не корректное значение температуры, повторите ввод:");
				i--;
			}
		}
		scaner.close();
		averageTemperature = sumTemp / dayQuantity;
		System.out.println("Среднемесячная температура: " + averageTemperature);
		System.out.println("Максимальная температура была " + maxTempDay
				+ "-го и составила " + maxTemp + " градусов");
		System.out.println("Минимальная температура была " + minTempDay
				+ "-го и составила " + minTemp + " градусов");
	}

}
