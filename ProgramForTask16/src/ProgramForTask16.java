import java.util.Scanner;

public class ProgramForTask16 {
	public static int solveEquation(char equationOperation, char equationChar1, char equationChar3, char equationChar5) {
		int resultInt = 0;
		
		if (equationChar5 == 'x'){
			int equationInt1 = Character.getNumericValue(equationChar1);
			int equationInt3 = Character.getNumericValue(equationChar3);
			if (equationOperation == '-'){
				resultInt = equationInt1 - equationInt3;
			}
			else if (equationOperation == '+'){
				resultInt = equationInt1 + equationInt3;
			}
		}
		else if (equationChar1 == 'x'){
			int equationInt3 = Character.getNumericValue(equationChar3);
			int equationInt5 = Character.getNumericValue(equationChar5);
			if (equationOperation == '-'){
				resultInt = equationInt5 + equationInt3;
			}
			else if (equationOperation == '+'){
				resultInt = equationInt5 - equationInt3;
			}
		}
		else if (equationChar3 == 'x'){
			int equationInt1 = Character.getNumericValue(equationChar1);
			int equationInt5 = Character.getNumericValue(equationChar5);
			if (equationOperation == '-'){
				resultInt =  equationInt1 - equationInt5;
			}
			else if (equationOperation == '+'){
				resultInt = equationInt5 - equationInt1;
			}
		}
        return resultInt;
		
	}

	public static boolean controlEquationElements(String  maybeEquationStr) {
		String maybeEquationStrLower = maybeEquationStr.toLowerCase();
		char equationOperation = maybeEquationStrLower.charAt(1);
		char equationChar1 = maybeEquationStrLower.charAt(0);
		char equationChar3 = maybeEquationStrLower.charAt(2);
		char equationChar5 = maybeEquationStrLower.charAt(4);
		int i = 0;    

		if (equationChar1 == 'x') i++;
		if (equationChar3 == 'x') i++;
		if (equationChar5 == 'x') i++;
		
		boolean returnValueBoolean = false;
		if (maybeEquationStrLower.charAt(3) != '='){
			System.out.println("Введен некорректный формат уравнения, на четвертой позиции должен быть знак '='");
		}
		else if (equationOperation != '+' && equationOperation != '-'){
			System.out.println("Введен некорректный формат уравнения, на второй позиции должен быть знак '+' или '-'");
		}
		else if (!(Character.isDigit(equationChar1)) && equationChar1 != 'x'){
			System.out.println("Введен некорректный формат уравнения, на первой позиции должно быть число от 0 до 9 или 'x'");
		}
		else if (!(Character.isDigit(equationChar3)) && equationChar3 != 'x'){
			System.out.println("Введен некорректный формат уравнения, на третьей позиции должно быть число от 0 до 9 или 'x'");
		}
		else if (!(Character.isDigit(equationChar5)) && equationChar5 != 'x'){
			System.out.println("Введен некорректный формат уравнения, на пятой позиции должно быть число от 0 до 9 или 'x'");
		}
		else if (i == 0){
			System.out.println("Введен некорректный формат уравнения, отсутствует символ 'x' на любой одной из трех позиций: первой, третьей или пятой");
		}
		else if (i > 1){
			System.out.println("Введен некорректный формат уравнения, символ 'x' должен быть представлен только в одной из трех позиций: первой, третьей или пятой!");
		}
		else {
			returnValueBoolean = true;
		}
		return returnValueBoolean;
	}

	public static void main(String[] args) {
		int equationResultInt = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Вводная информация: ");
		System.out.println("- программа принимает на вход строку длиной лишь 5 символов;");
		System.out.println("- второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’;");
		System.out.println("- первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.");
		System.out.print("Введите уравнение (например 1+x=5): ");
		String inputStr = in.nextLine();
		if (controlEquationElements(inputStr)) {
			equationResultInt = solveEquation(inputStr.charAt(1), inputStr.charAt(0), inputStr.charAt(2), inputStr.charAt(4));
			System.out.printf("Вывод: %d%n", equationResultInt);
		} else {
			System.out.print("Введите корректное уравнение!");
		}
	}
}

/*
Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
Нужно найти неизвестное.
Пример для теста работы программы:
- Ввод: x+5=7
- Вывод: 2
- Ввод: 3-x=9
- Вывод: -6
- Ввод: 3-3=x
- Вывод: 0
*/

