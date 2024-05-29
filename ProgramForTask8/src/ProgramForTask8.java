import java.util.Scanner;

public class ProgramForTask8 {

	public static void main(String[] args) {
        int sum = 0;
		System.out.print("Введите любое целое положительное число: ");
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		if (n > 0){
			for (int i = 1; i < n + 1; i += 2) {
					sum += i;
			}
			System.out.printf("Результат суммирования нечетных чисел по число %d: %d", n, sum);
		}
		else{
			System.out.println("Вы ввели некорректное число!");
		}
	}
}

/*
Инструкция
Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
Выполненное задания нужно залить в гит и оставить ссылку здесь в поле "Ответ". Задание автоматически уйдет на оценку преподавателю
*/