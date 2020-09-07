package homework.w2;


import static homework.w2.Utils.displayPrint;
import static homework.w2.Utils.displayPrintArray;

/**
 * 10. Дан массив целых чисел:
 * [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить
 * нули в конец массива. Вывести результат в консоль
 */
public class Case10 {

    public static void main(String[] args) {
        int[] originalArray = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int[] modifiedArray = new int[originalArray.length];
        int index = 0;

        for (int element: originalArray) {
            if (element != 0) {
                modifiedArray[index] = element;
                index++;
            }
        }

        displayPrintArray(originalArray);
        displayPrint(modifiedArray);
    }

}
