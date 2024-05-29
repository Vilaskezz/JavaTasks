import java.util.Random;

public class ProgramForTask14 {
	public static void main(String[] args) {
		int[] arrayInt = new int[15];
		Random randomObj = new Random();
		System.out.print("Сформирован массив из следующих чисел: { ");
		for (int i = 0 ; i < arrayInt.length; i++){
			arrayInt[i] = randomObj.nextInt(21) - randomObj.nextInt(21);
			if(i+1 != arrayInt.length){
				System.out.print(arrayInt[i] + ", ");
			}
			else {
				System.out.println(arrayInt[i] + " }");
			}
		}
		int minValue = 20;
		int maxValue = -20;
		for(int arrayItem : arrayInt) {
			if(minValue > arrayItem) {
				minValue = arrayItem;
			}
			if(maxValue < arrayItem) {
				maxValue = arrayItem;
			}		
		}
		System.out.printf("Минимальное значение в массиве: %d%n", minValue);
		System.out.printf("Максимальное значение в массиве: %d%n", maxValue);
		System.out.printf("Наибольшее по модулю значение в массиве: %d%n", Math.max(Math.abs(maxValue),Math.abs(minValue)));
	}
}

/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
1. Выведите максимальный и минимальный элемент массива.
2. Из максимального и минимального значения выведите наибольшее по модулю.
*/