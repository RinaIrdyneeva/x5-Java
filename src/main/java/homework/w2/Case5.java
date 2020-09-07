package homework.w2;

import static homework.w2.Utils.displayPrint;
import static homework.w2.Utils.getLongFromConsole;

/**
 * 5. Ввести три целых числа с консоли. Вывести на
 * экран наименьшее из них.
 */
public class Case5 {
    public static void main(String[] args) {
        Long minNumber = Long.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            Long number = getLongFromConsole();
            if (minNumber > number) {
                minNumber = number;
            }
        }
        displayPrint(minNumber);
    }
}
