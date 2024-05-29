import java.util.Scanner;

public class ProgramForTask9 {

	public static void main(String[] args) {
		System.out.print("Введите размер массива (целое число больше 0): ");
		Scanner in = new Scanner(System.in);
		int arraySize  = in.nextInt();
		double arraySum = 0;
		if (arraySize > 0){
			double[] Array = new double[arraySize];
			for(int i = 0; i < arraySize; i++){
				System.out.printf("Введите десятичное число для элемента №%d массива: ", i+1);
				Array[i]  = in.nextDouble();
				arraySum += Array[i];
			}
			double arithmeticMean = arraySum / arraySize;
			System.out.printf("Рассчитан новый массив: {%f", Array[0] * arithmeticMean);
			for(int i = 1; i < arraySize; i++){
				System.out.printf(", %f", Array[i] * arithmeticMean);
			}
			System.out.print("}.");
		}
		else{
			System.out.println("Вы ввели некорректный размер массива!");
		}
	}
}

/*
Напишите программу:
1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
2. Посчитайте среднее арифметическое элементов массива.
3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
Выполненное задания нужно залить в гит и оставить ссылку здесь в поле "Ответ". Задание автоматически уйдет на оценку преподавателю
*/