import java.util.Scanner;

public class ProgramForTask13 {

	public static boolean isLatinWord(String word) {
		boolean returnValue = false;
		int latinCharsCounter = 0;
		for (int i = 0; i < word.length(); i++) {
			char letterChar = (word.toLowerCase()).charAt(i);
			if (letterChar >= 'a' && letterChar <= 'z') {
				latinCharsCounter++;
			}
		}
		if (latinCharsCounter > 0 && latinCharsCounter == word.length()) {
			returnValue = true;
		}
		return returnValue;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите строку (например 'I love java 8 Я люблю java 14 core1'): ");
		String workStr = in.nextLine();
		String[] strArray = workStr.split(" ");
		int latinWordsCounter = 0;
		if (!workStr.isEmpty()){
			for (String wordStr : strArray) {
				//System.out.println(wordStr);
                if (isLatinWord(wordStr)){
					latinWordsCounter++;
					if (latinWordsCounter == 1) {
						System.out.println("Найдены следующие слова состоящие только из латиницы:");
					}
					System.out.println("  - " + wordStr);
				}
			}
			System.out.printf("Всего найдено слов состоящих только из латиницы: %d", latinWordsCounter);
		}
		else {
			System.out.println("Вы ввели пустую строку!");
		}
	}
}

/*
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
1. Выведите слова, состоящие только из латиницы.
2. Выведите количество этих слов.
*/