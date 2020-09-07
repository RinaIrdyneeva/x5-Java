package homework.w2;

import static homework.w2.Utils.displayPrint;
import static homework.w2.Utils.getLongFromConsole;

/**
 * 3. Ввести целое число в консоли. Если оно является
 * положительным, то прибавить к нему 1, в противном
 * случае не изменять его. Вывести полученное число.
 */
public class Case3 {

    public static void main(String[] args) {
        Long number = getLongFromConsole();
        if (number < 0) {
            number += 1;
        }
        displayPrint(number);
    }

}
