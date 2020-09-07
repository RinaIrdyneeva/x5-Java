package homework.w2;

import static homework.w2.Utils.displayPrint;
import static homework.w2.Utils.getLongFromConsole;

/**
 * 1. Ввести целое число в консоли и вывести на экран
 * последнюю цифру введенного числа.
 */
public class Case1 {

    public static void main(String[] args) {
        Long number = getLongFromConsole();
        String stringNumber = number.toString();
        int lastCharPosition = stringNumber.length() - 1;
        displayPrint(stringNumber.charAt(lastCharPosition));
    }

}
