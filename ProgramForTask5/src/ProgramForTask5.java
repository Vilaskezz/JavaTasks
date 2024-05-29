import java.util.Scanner;

public class ProgramForTask5 {
    public static void main(String[] args) {
		double result = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число (целое или десятичную дробь): ");
		double x = in.nextDouble();
		System.out.println("Введите второе число (целое или десятичную дробь): ");
		double y = in.nextDouble();
		System.out.println("Введите одно из действий миникалькулятора ‘+’, ‘-’, ‘*’ или ‘/’: ");
		String calcOperator = in.next();
		boolean calculateResult = true;
				switch (calcOperator){
			case "+":
				result = x + y;
				break;
			case "-":
				result = x - y;
				break;
			case "*":
				result = x * y;
				break;
			case "/":
				result = x / y;
				break;
			default:
				System.out.println("Вы что-то ввели некорректно");
				calculateResult = false;
		}
		if (calculateResult) {
			System.out.printf("Результат расчета: %.10f%n", result);
		}

    }
}

/*
Напишите простой калькулятор:
1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
Выполненное задания нужно залить в гит и оставить ссылку здесь в поле "Ответ". Задание автоматически уйдет на оценку преподавателю
*/