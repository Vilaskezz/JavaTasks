import java.util.Scanner;

public class ProgramForTask15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите курс рублей к доллару: ");
		Double currencyRateDouble = in.nextDouble();
		System.out.print("Введите сумму рублей для обмена (целое положительное число): ");
		int sumRubInt = in.nextInt();
		if(currencyRateDouble <= 0){
			System.out.print("Курс обмена должен быть больше нуля!");
		}
		else if (sumRubInt <= 0){
			System.out.print("Сумма для обмена должна быть больше нуля!");
		}
		else {
			System.out.printf("Курс доллара: %.2f%n", currencyRateDouble);
			System.out.printf("Сумма для обмена в рублях: %d%n", sumRubInt);
			System.out.printf("Сумма к получению в долларах после обмена: %.2f%n", (sumRubInt / currencyRateDouble));
			}
	}
}

/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. 
Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
Пример для теста работы программы:
- Курс доллара: 67,55
- Количество рублей: 1000
- Итого: 14,80 долларов
*/