package ua.org.oa.examples.home_work_3;

public class EqualsString {
	/** первый способ поиска вхожденийс */
	public void checkEquals(String str1, String str2) {

		String s1 = new String(str1);

		String s2 = new String(str2);

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.regionMatches(true, i, s2, 0, s2.length())) { // сравниваем
				// указанную
				// часть
				// строки с
				// другой
				// строкой
				// или ее
				// частью
				// игнорируя
				// регистр
				// символов,
				// согласно
				// задания
				count++;
			}

		}

		System.out.println(count);
	}

	public void checkEquals2(String str1, String str2) { // выделяем из исходной
		// строки подстроку
		// начинающуюся с
		// одинакового
		// символа
		// и длиной искомой
		// строку и
		// сравниваем две
		// строки

		String s1 = new String(str1);

		String s2 = new String(str2);
		s1 = s1.toLowerCase(); // приводим обе строки к нижнему регистру
		s2 = s2.toLowerCase();

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == s2.charAt(0)) {

				if (s2.equals(s1.substring(i, i + s2.length()))) {
					count++;

				}

			}

		}

		System.out.println(count);

	}

	public void checkEquals3(String str1, String str2) { // ищем номер символа
		// первого вхождения
		// искомой подстроки
		// в исходном тексте
		// "передвигая"
		// счетчик на конец
		// первого входения
		String s1 = new String(str1);
		String s2 = new String(str2);

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		int count = 0;
		int i = 0;

		while ((s1.indexOf(s2, i)) != -1) { // завершаем цикл когда вхождения
			// больше нет

			i = i + s1.indexOf(s2, i) + s2.length();
			count++;

		}

		System.out.println(count);

	}
}
