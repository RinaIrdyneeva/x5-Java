package homework.w2;

import static homework.w2.Utils.displayPrint;
import static homework.w2.Utils.displayPrintInLine;
import static homework.w2.Utils.getLongFromConsole;

/**
 * 6. Ввести целое число в консоли. Вывести его строку-
 * описание вида «отрицательное четное число»,
 * «нулевое число», «положительное нечетное число»
 */
public class Case6 {
    public static void main(String[] args) {
        Long number = getLongFromConsole();

        if (number == 0) {
            displayPrint("нулевое число");
            return;
        } else if (number > 0) {
            displayPrintInLine("положительное");
        } else {
            displayPrintInLine("отрицательное");
        }

        if (number % 2 == 0 ) {
            displayPrintInLine("четное число");
        } else {
            displayPrintInLine("нечетное число");
        }
    }
}
