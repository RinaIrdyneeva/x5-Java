package homework.w2;

import java.util.Arrays;
import java.util.Scanner;

public final class Utils {
    private Utils() {}

    public static String getStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        displayPrint("Введите строку");
        return scanner.nextLine();
    }

    public static Long getLongFromConsole() {
        Scanner scanner = new Scanner(System.in);
        displayPrint("Введите число");
        return scanner.nextLong();
    }

    public static void displayPrint(Object outString) {
        System.out.println(outString);
    }

    public static void displayPrintArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void displayPrintInLine(Object outString) {
        System.out.print(outString+" ");
    }

}
