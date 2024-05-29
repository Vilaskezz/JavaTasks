import java.util.Scanner;

public class ProgramForTask4 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите значение x: ");
		double x = in.nextDouble();
		System.out.println("Введите значение y: ");
		double y = in.nextDouble();
		System.out.println("Введите значение z: ");
		double z = in.nextDouble();

		double arithmeticMean = (x + y + z) / 3;
		System.out.printf("Среднее арифметическое от x, y, z: %.3f%n", arithmeticMean);

		double remainderOfDivision = arithmeticMean%2.0;
		System.out.printf("Остаток от деления на 2: %.3f%n", remainderOfDivision);
		double result3 = (arithmeticMean-remainderOfDivision)/2;
		System.out.printf("Результат деления на 2 после округления: %.0f%n", result3);
		
		if (result3 > 3) {
			System.out.println("Программа выполнена корректно");
		}
    }
}

/*
Написать программу, которая будет выполнять следующие действия:
1. Ввести три числа с клавиатуры x, y, z
2. Найти и вывести в консоль среднее арифметическое этих чисел
3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
Выполненное задания нужно залить в гит и оставить ссылку здесь в поле "Ответ". Задание автоматически уйдет на оценку преподавателю
*/