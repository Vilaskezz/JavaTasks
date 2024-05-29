import java.util.Scanner;

public class ProgramForTask18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String openingStr = "Отгадайте загадку";
		String enigmaStr = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
		String correctlyStr = "Правильно";
		String thinkAgainStr = "Подумай еще!";
		String repeatStr = "Повторю загадку!";
		String loserStr = "Обидно, приходи в другой раз";
		String helpRequestStr = "Подсказка";
		String helpAnswerStr = "Это загадка от Айтишников-безопасников!";
		String answerNow = "После подсказки, только одна попытка!";
		String noHelpAnswerStr = "Подсказка уже недоступна!";
		String answerStr = "Заархивированный вирус";
		System.out.println(openingStr);
		System.out.println(enigmaStr);
		boolean wrongAnswerBool = true;
		int t = 4;
		int i = 1;
		for(; i < t; i++){
			String tryStr  = in.nextLine();
			if(wrongAnswerBool && tryStr.equalsIgnoreCase(answerStr)){
				System.out.println(correctlyStr);
				wrongAnswerBool = false;
				break;
			}
			else if(i == 1 && tryStr.equalsIgnoreCase(helpRequestStr)){
				System.out.println(helpAnswerStr);
				t = 3;
				System.out.println(answerNow);
			}
			else if( i > 1 && tryStr.equalsIgnoreCase(helpRequestStr)){
				System.out.println(noHelpAnswerStr);
			}
			else if (i < 3 ){
				System.out.println(thinkAgainStr);
				System.out.println(repeatStr);
				System.out.println(enigmaStr);
			}
		}
		if (wrongAnswerBool){
			System.out.println(loserStr);
		}
	}
}
/*
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
Ответ: “Заархивированный вирус”.
1. У пользователя есть 3 попытки, чтобы отгадать загадку.
2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
5. Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны. 
     Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. 
	 Если на 2 и 3, вывести “Подсказка уже недоступна”.
6. Если пользователь, использовавший подсказку, ошибется, вывести “Обидно, приходи в другой раз” и завершить работу.
*/