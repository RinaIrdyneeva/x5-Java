package homework.w2;


import static homework.w2.Utils.displayPrint;
import static homework.w2.Utils.getLongFromConsole;

/**
 * 4. Ввести целое число в консоли. Если оно является
 * положительным, то прибавить к нему 1; если
 * отрицательным, то вычесть из него 2; если нулевым,
 * то заменить его на 10. Вывести полученное число.
 */
public class Case4 {

    public static void main(String[] args) {
        Long number = getLongFromConsole();
        if (number < 0) {
            number -= 2;
        } else if (number > 0) {
            number +=1;
        } else {
            number = 10l;
        }
        displayPrint(number);
    }

}
