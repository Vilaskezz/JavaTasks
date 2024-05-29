import java.util.Scanner;

public class ProgramForTask17 {

	public static int countsUniqueCharacters(String wordStr) {
		int uniqueCharCounterInt = 0;
		wordStr = wordStr.toLowerCase();
		for (int i = 0; i < wordStr.length(); i++) {
			String letterStr = String.valueOf(wordStr.charAt(i));
			wordStr = wordStr.replaceAll(letterStr, "");
            uniqueCharCounterInt = i;
		}
		return uniqueCharCounterInt;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество строк: ");
        int rowsNumberInt = in.nextInt();
		in.nextLine();
		if (rowsNumberInt >0) {
			String[] rowsArrayStr = new String[rowsNumberInt];

			System.out.println("Начинайте вводить строки:");
			int maxUniqueCharCounterInt = 0;
			int maxIndexInt = 0;
			for (int i = 0; i < rowsNumberInt; i++) {
				System.out.printf("строка №%d: ", i + 1);
				rowsArrayStr[i] = in.nextLine();
				int[] uniqueCharCounterArrayInt = new int[rowsNumberInt];
				uniqueCharCounterArrayInt[i] = countsUniqueCharacters(rowsArrayStr[i]);
				if (maxUniqueCharCounterInt < uniqueCharCounterArrayInt[i]) {
					maxUniqueCharCounterInt = uniqueCharCounterArrayInt[i];
					maxIndexInt = i;
				}
			}
			System.out.print("Ответ: " + rowsArrayStr[maxIndexInt]);
		}
		else {
			System.out.println("Количество строк должно быть целым положитеным числом!");
		}
	}
}


/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. 
Среди данных строк найти строку с максимальным количеством различных символов. 
Если таких строк будет много, то вывести первую.
Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
*/