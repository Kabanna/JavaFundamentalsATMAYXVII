package ua.org.oa.examples.practice_1;
/*10) Написать программу расчета обязательных платежей кредитора при
 *  пользовании банковским кредитом.
 *  Задание:
 *  а) Для каждого месяца вывести на экран сумму к оплате по телу кредита
 *   и начисленные проценты
 *  б) Суммарное значение выплаченных процентов за период пользования
 *  кредитом.
 *  Исходные данные: Сумма кредита, процентная ставка, срок кредитования.*/

public class Task10 {

	private double amountCredit;
	private double taxCredit;
	private int periodCredit;

	public Task10(double amountCredit, double taxCredit, int periodCredit) {
		this.amountCredit = amountCredit;
		this.taxCredit = taxCredit;
		this.periodCredit = periodCredit;
	}

	public void methodTask10 () {
		double percent_summ = 0;
		double all_debt = amountCredit;
		double percent;
		double debt_summ = 0;
		double summ = 0;
		final double part_debt = amountCredit / periodCredit;
		System.out.println("Месяц" + "\t" +"Задолж. по кредиту" + "\t" + "Начисленные %" + "\t" + "Тело кредита" + "\t" + "Сумма очередн. платежа");
		for (int i = 1; i <= periodCredit; i++) {
			percent = (all_debt * taxCredit/100/12);
			percent_summ += percent;
			debt_summ += part_debt;
			summ += percent + part_debt;
			System.out.printf(i + "\t" + "%.2f" + "\t" + "\t" + "\t" + "%.2f" + "\t" + "\t" + "%.2f" + "\t" + "\t" + "\t" + "%.2f", all_debt, percent, part_debt, (part_debt + percent));
			System.out.println();
			all_debt = all_debt - part_debt;
		}
		System.out.printf("ИТОГО выплачено процентов" + "\t" + "%.2f", percent_summ);
		System.out.println();
		System.out.printf("ИТОГО выплачено тела кредита" + "\t" + "%.2f", debt_summ);
		System.out.println();
		System.out.printf("ИТОГО выплачено" + "\t" + "\t" + "\t" + "%.2f", summ);

	}

}
