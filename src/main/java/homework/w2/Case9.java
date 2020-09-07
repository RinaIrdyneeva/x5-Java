package homework.w2;


import static homework.w2.Utils.displayPrintArray;

/**
 * 9. Дан массив целых чисел:
 * [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
 * Переставить элементы массива в обратном порядке.
 * Вывести результат в консоль
 */
public class Case9 {

    public static void main(String[] args) {
        int[] originalArray = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int[] reversedArray = new int[originalArray.length];
        int index = originalArray.length -1;

        for (int element: originalArray) {
            reversedArray[index] = element;
            index--;
        }

        displayPrintArray(originalArray);
        displayPrintArray(reversedArray);
    }

}
