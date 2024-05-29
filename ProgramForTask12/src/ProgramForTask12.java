import java.util.Scanner;

public class ProgramForTask12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите строку (желательно 'I like Java!!!'): ");
		String workStr = in.nextLine();
		int i = 0;
        if (workStr.contains("Java")) {
			System.out.printf("Строка \"%s\" содержит слово \"Java\".%n", workStr);
			i++;
		}
        if (workStr.startsWith("I like")) {
			System.out.printf("Строка \"%s\" начинается с фразы: \"I like\".%n", workStr);
			i++;
		}
        if (workStr.endsWith("!!!")) {
			System.out.printf("Строка \"%s\" заканчивается: \"!!!\".%n", workStr);
			i++;
		}

		if (i == 3) {
			System.out.println(workStr.toUpperCase());
		}

		String resultStr = workStr.replace('a', 'o');
		int startIndexJovo = resultStr.indexOf("Jovo");
		if(startIndexJovo > -1) {
			System.out.println(resultStr.substring(startIndexJovo, startIndexJovo + 4));
		}
		else System.out.println("Подстрока \"Jovo\" отсутствует!");
	}
}


/*
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
*/