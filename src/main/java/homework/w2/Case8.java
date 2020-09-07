package homework.w2;

import static homework.w2.Utils.displayPrint;

/**
 * 8. Дан массив целых чисел:
 * [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
 * массива найти и вывести на экран:
 * - максимальное значение
 * - сумму положительных элементов
 * - сумму четных отрицательных элементов
 * - количество положительных элементов
 * - среднее арифметическое отрицательных элементов
 */
public class Case8 {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int sumPoloj = 0;
        int sumOtric = 0;
        int sumChetOtric = 0;
        int countPoloj = 0;
        int countOtric = 0;
        int[] intArray = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};

        for (int element: intArray) {
            if (element > max) max = element;
            if (element >= 0) {
                sumPoloj += element;
                countPoloj++;
            } else {
                if (element % 2 == 0) sumChetOtric += element;
                sumOtric += element;
                countOtric++;
            }
        }

        int ariphmeticAverageOtric = sumOtric / countOtric;
        displayPrint("максимальное значение: " + max);
        displayPrint("сумма положительных элементов: " + sumPoloj);
        displayPrint("сумма четных отрицательных элементов: " + sumChetOtric);
        displayPrint("количество положительных элементов: " + countPoloj);
        displayPrint("среднее арифметическое отрицательных элементов: " + ariphmeticAverageOtric);
    }
}
