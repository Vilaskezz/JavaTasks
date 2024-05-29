import java.util.Scanner;
import java.util.Locale;

public class ProgramForTask11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		System.out.print("Введите первое десятичное число: ");
		String numberString1 = in.next();
		double numberDouble1 = Double.parseDouble(numberString1);
		System.out.print("Введите второе целое число: ");
		int numberInt2 = in.nextInt();
		if (numberDouble1 > numberInt2) {
			System.out.println("Первое число является большим: " + numberString1);
		}
		else if (numberDouble1 < numberInt2){
			System.out.printf("Второе число является большим: %d%n", numberInt2);
		}
		else System.out.printf("Числа одинаковые!", numberInt2);
		if (numberDouble1 != numberInt2) {
			System.out.printf("А вот и меньшее число: %.3f%n", Math.min(numberDouble1, numberInt2));
		}
	}
}

/*
Инструкция
Напишите программу:
1. Ввести первое число с клавиатуры и записать его в строковую переменную.
2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
3. Сравнить 2 числа и вывести большее на экран
4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/