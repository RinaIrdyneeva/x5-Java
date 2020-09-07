package homework.w2;

import java.util.HashMap;
import java.util.Map;

import static homework.w2.Utils.displayPrint;
import static homework.w2.Utils.getLongFromConsole;

/**
 * 7. Написать программу, вычисляющую стоимость 10
 * минутного междугороднего разговора в зависимости
 * от кода города. ( Москва(905) - 4.15руб. Ростов(194) -
 * 1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
 * руб. ). Пользователь в консоли должен ввести код
 * города, а в ответ от программы получить, например,
 * при вводе кода 905, - «Москва. Стоимость разговора:
 * 41.5»
 */
public class Case7 {

    public static void main(String[] args) {
        Map<Long, Double> tariffs = new HashMap<>();
        tariffs.put(905l, 41.5);
        tariffs.put(194l, 1.98);
        tariffs.put(491l, 2.69);
        tariffs.put(800l, 5.00);

        Map<Long, String> tariffCities = new HashMap<>();
        tariffCities.put(905l, "Москва");
        tariffCities.put(194l, "Ростов");
        tariffCities.put(491l, "Краснодар");
        tariffCities.put(800l, "Киров");

        Long number = getLongFromConsole();

        if(tariffs.containsKey(number)) {
            Double price = 10 * tariffs.get(number);
            displayPrint(tariffCities.get(number) + ". Стоимость разговора: " + price);
        } else {
            displayPrint("Город с таким кодом " +number+ " не определен");
        }
    }

}
