package ua.org.oa.examples.home_work_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/** класс извлечения и вывода текста из файла */
public class ReadFromFile {

	public String ReadFile(String fileName) { // на вход расположение и имя
		// файла

		String s = null;
		File file = new File(fileName);
		StringBuilder contents = new StringBuilder();
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;

			while ((text = reader.readLine()) != null) {
				contents.append(text).append(
						System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		s = contents.toString();
		return s; // возврат строки с текстом из файла
	}

}
