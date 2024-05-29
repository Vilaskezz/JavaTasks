import java.util.Scanner;

public class ProgramForTask10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите количество строк матрицы: ");
		int numberOfMatrixRows  = in.nextInt();
		System.out.print("Введите количество столбцов матрицы: ");
		int numberOfMatrixColumns  = in.nextInt();
		double arraySum = 0;
		if (numberOfMatrixRows > 0 && numberOfMatrixColumns > 0){
			double[][] Matrix = new double[numberOfMatrixRows][numberOfMatrixColumns];
			for(int r = 0; r < numberOfMatrixRows; r++){
				System.out.printf("Заполняется строка №%d матрицы: %n", r+1);
				for(int c = 0; c < numberOfMatrixColumns; c++) {
					System.out.printf("Введите десятичное число для столбца №%d матрицы: ", c + 1);
					Matrix[r][c] = in.nextDouble();
					if (r == 0) {
						Matrix[r][c] = Matrix[r][c];
					}
				}
			}
			System.out.printf("Обновленная первая строка матрицы: {%f",Matrix[0][0] * 3);
			for(int c = 1; c < numberOfMatrixColumns; c++){
				System.out.printf(", %f",Matrix[0][c] * 3);
			}
			System.out.print("}.");
		}
		else{
			System.out.println("Вы ввели некорректные размеры матрицы!");
		}
	}
}

/*
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, 
  где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
*/