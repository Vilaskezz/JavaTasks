public class ProgramForTask3 {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        int lastArrayIndex = Array.length - 1;
        int interimValue = Array[0];
        Array[0] = Array[lastArrayIndex];
        Array[lastArrayIndex] = interimValue;
        int middleIndex = lastArrayIndex / 2;
        int Sum = Array[0] + Array[middleIndex];
        System.out.println("Сумма первого и среднего элемента равна: " + Sum);
    }
}

/*
Выполните следующие действия с массивом:
1. Задайте массив из 5 любых целых чисел
2. Поменяйте местами первый и последний элемент в массиве
3. Вывести в консоль результат суммы первого и среднего элемента
Примечание: Для получения последнего и среднего элементов в массиве используйте свойство length.
Выполненное задания нужно залить в гит и оставить ссылку здесь в поле "Ответ". Задание автоматически уйдет на оценку преподавателю
*/