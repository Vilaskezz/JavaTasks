import java.util.Scanner;

public class ProgramForTask7 {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		int z = 100;
		boolean arrayContainsConstants = false;
		System.out.print("Введите размер массива (целое число больше 0): ");
		Scanner in = new Scanner(System.in);
		int arraySize  = in.nextInt();
		if (arraySize > 0){
			int[] Array = new int[arraySize];
			for(int i = 0; i < arraySize; i++){
				System.out.printf("Введите целое число для элемента №%d массива: ", i+1);
				Array[i]  = in.nextInt();
				if (!arrayContainsConstants && (x == Array[i] || y == Array[i] || z == Array[i]) ){
					arrayContainsConstants = true;
				}
			}
			if (arrayContainsConstants){
				System.out.println("Данное значение имеется в константах");
			}
		}
		else{
			System.out.println("Вы ввели некорректый размер массива!");
		}
	}
}
/*
Напишите программу:
1. Пользователь вводит размер массива и данные с клавиатуры в массив
2. Сравнить элементы массива с заранее заданными константами x, y, z.
3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
Выполненное задания нужно залить в гит и оставить ссылку здесь в поле "Ответ". Задание автоматически уйдет на оценку преподавателю
*/