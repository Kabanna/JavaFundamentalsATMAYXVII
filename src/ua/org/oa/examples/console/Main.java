package ua.org.oa.examples.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public void inputScaner() {
		System.out.println("Work with Scaner ~~~~~~~~~~~~~~~~~~~~~");
		Scanner bufferScaner = new Scanner(System.in);
		String string = "";
		while (!string.equals("q")) {
			System.out
					.println("Введите значение в коммандной строке, для выхода введите \"q\"");
			string = bufferScaner.next();
			System.out.println("Вы ввели: " + string);
		}
	}

	public void inputBufferedReader() throws IOException {
		System.out.println("Work with BufferedReader ~~~~~~~~~~~~~~~~~~~~~");
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		String string = "";
		while (!string.equals("q")) {
			System.out
					.println("Введите значение в коммандной строке, для выхода введите \"q\"");
			string = bufferReader.readLine();
			System.out.println("Вы ввели: " + string);
		}
	}

	public static void main(String[] args) throws IOException {
		Main InputConsole = new Main();
		InputConsole.inputScaner();
		InputConsole.inputBufferedReader();
	}

}