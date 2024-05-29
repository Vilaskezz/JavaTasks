import java.util.Scanner;

public class ProgramForTask6 {
	public static void distanceMeasuresConvert(int measureUnit, double userDigit) {
		//константы расстояния
		final double MILLIMETER_RATIO = 0.001;
		final double CENTIMETRE_RATIO = 0.01;
		final double KILOMETRE_RATIO = 1000;
		final double INCH_RATIO = 0.0254;
		final double FOOT_RATIO = 0.3048;
		final double YARD_RATIO = 0.9144;
		final double MILE_RATIO = 1609.34;

		double metreResult = 0;
		switch (measureUnit) {
			case 1: //выбран метр
				metreResult = userDigit;
				break;
			case 2: //выбрана миля
				metreResult = userDigit * MILE_RATIO;
				break;
			case 3: //выбран ярд
				metreResult = userDigit * YARD_RATIO;
				break;
			case 4: //выбран фут
				metreResult = userDigit * FOOT_RATIO;
				break;
			case 5: //выбран дюйм
				metreResult = userDigit * INCH_RATIO;
				break;
			case 6: //выбран миллиметр
				metreResult = userDigit * MILLIMETER_RATIO;
				break;
			case 7: //выбран сантиметр
				metreResult = userDigit * CENTIMETRE_RATIO;
				break;
			case 8: //выбран километр
				metreResult = userDigit * KILOMETRE_RATIO;
				break;
		}
		if (measureUnit > 0 && measureUnit < 9) {
			double mileResult = metreResult / MILE_RATIO;
			double yardResult = metreResult / YARD_RATIO;
			double footResult = metreResult / FOOT_RATIO;
			double inchResult = metreResult / INCH_RATIO;
			double millimeterResult = metreResult / MILLIMETER_RATIO;
			double centimetreResult = metreResult / CENTIMETRE_RATIO;
			double kilometreResult = metreResult / KILOMETRE_RATIO;
			System.out.println("Результат:");
			System.out.printf("Метры: %.3f%n", metreResult);
			System.out.printf("Мили: %.3f%n", mileResult);
			System.out.printf("Ярды: %.3f%n", yardResult);
			System.out.printf("Футы: %.3f%n", footResult);
			System.out.printf("Дюймы: %.3f%n", inchResult);
			System.out.printf("Миллиметры: %.3f%n", millimeterResult);
			System.out.printf("Сантиметры: %.3f%n", centimetreResult);
		}
	}

	public static void massMeasuresConvert(int measureUnit, double userDigit) {
		//константы веса
		final double OUNCE_RATIO = 28.3495231251;
		final double POUND_RATIO = 453.59;
		final double STONE_RATIO = 6350;
		final double KILOGRAMME_RATIO = 1000;
		final double TONNE_RATIO = 1000000;
		double grammeResult = 0;

		switch (measureUnit) {
			case 1: //выбрана унция
				grammeResult = userDigit * OUNCE_RATIO;
				break;
			case 2: //выбран фунт
				grammeResult = userDigit * POUND_RATIO;
				break;
			case 3: //выбран стоун
				grammeResult = userDigit * STONE_RATIO;
				break;
			case 4: //выбран грамм
				grammeResult = userDigit;
				break;
			case 5: //выбран килограмм
				grammeResult = userDigit * KILOGRAMME_RATIO;
				break;
			case 6: //выбрана тонна
				grammeResult = userDigit * TONNE_RATIO;
				break;
		}
		if (measureUnit > 0 && measureUnit < 7) {
			double ounceResult = grammeResult / OUNCE_RATIO;
			double poundResult = grammeResult / POUND_RATIO;
			double stoneResult = grammeResult / STONE_RATIO;
			double kilogrammeResult = grammeResult / KILOGRAMME_RATIO;
			double tonneResult = grammeResult / TONNE_RATIO;
			System.out.println("Результат:");
			System.out.printf("Унции: %.3f%n", ounceResult);
			System.out.printf("Фунты: %.3f%n", poundResult);
			System.out.printf("Стоуны: %.3f%n", stoneResult);
			System.out.printf("Граммы: %.3f%n", grammeResult);
			System.out.printf("Килограммы: %.3f%n", kilogrammeResult);
			System.out.printf("Тонны: %.3f%n", tonneResult);
		}
	}

	public static void main(String[] args) {
		//переменные
		double metreResult = 0;
		double grammeResult = 0;
		int measureUnit;
		double userDigit;

		System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
		Scanner in = new Scanner(System.in);
		int massOrDistanceSelect = in.nextInt();
		if (massOrDistanceSelect == 1) {
			System.out.println("Выберите единицу измерения: 1 - унция, 2 - фунт, 3 - стоун, 4 - грамм, 5 - килограмм, 6 - тонна");
			measureUnit = in.nextInt();
			if (measureUnit > 0 && measureUnit < 7) {
				System.out.println("Введите число:");
				userDigit = in.nextDouble();
				massMeasuresConvert(measureUnit, userDigit);
			}
			else {
				System.out.println("Сожалеем, но единица измерения с таким номером отсутствует!");
			}
		}
		else if (massOrDistanceSelect == 2) {
			System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут, 5 - дюйм, 6 - миллиметр, 7 - сантиметр, 8 - километр");
			measureUnit = in.nextInt();
			if (measureUnit > 0 && measureUnit < 9) {
				System.out.println("Введите число:");
				userDigit = in.nextDouble();
				distanceMeasuresConvert(measureUnit, userDigit);
			}
			else {
				System.out.println("Сожалеем, но единица измерения с таким номером отсутствует!");
			}
		}
		else{
			System.out.println("Сожалеем, но конвертер переводит только массу и расстояние!");
		}
	}
}


/*
Напишите программу конвертер физических величин:
1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
*/