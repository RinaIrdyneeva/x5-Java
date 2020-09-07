package homework.w2;

import static homework.w2.Utils.displayPrint;
import static homework.w2.Utils.getLongFromConsole;

/**
 * 2. Ввести целое трехзначное число в консоли и найти
 * сумму цифр этого трехзначного числа
 */
public class Case2 {

    public static void main(String[] args) {
        Long number = getLongFromConsole();
        String stringNumber = number.toString();
        if (stringNumber.length() == 3) {
            char[] chars = stringNumber.toCharArray();
            int sumNumbers = 0;
            for (char c: chars){
                sumNumbers += Long.valueOf(String.valueOf(c));
            }
            displayPrint(sumNumbers);
        } else {
            displayPrint("Число не трехзначное");
        }
    }

}
