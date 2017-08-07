package ua.org.oa.examples.practice_3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		double sumPaimant = 0;
		
		staff.add(new Boss("Pypkin Vasiliy Ivanovich", 3, 300));
		staff.add(new HourlyWorker("Ivanov Dmitriy Vladimirovich", 150, 50, 40, 80));
		staff.add(new HourlyWorker("Petrov Sergei Ivanovich", 130, 50, 20, 70));
		staff.add(new PieceWorker("Sergeev Ivan Dmitrievich", 700, 5));
		staff.add(new PieceWorker("Davidenkov Anatoliy Petrovich", 540, 5));
		staff.add(new CommissionWorker("Lozina Inna Grigorievna",1500, 25000, 10));
		staff.add(new CommissionWorker("Cvetkova Galina sergeevna", 1500, 37000, 10));
		
		for (Employee employee : staff) {
			employee.getName();
			sumPaimant+=employee.paymant();
			System.out.println();
		}
		System.out.println("���� ���������� �����: " + sumPaimant);

	}

}
