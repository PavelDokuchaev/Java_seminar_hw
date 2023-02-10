/*Пусть дан список сотрудников:
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Иван Савин
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.

Иван 4, ...

 */

package sem5_hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task2_hw5 {
    public static void main(String[] args) {

        String str = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        System.out.println(sortedNames(str));
    }

    public static Map sortedNames(String str) {
        String strNew[] = str.split(", ");
        HashMap<String, Integer> names = new HashMap<>();
        for (String it : strNew) {
            String name = it.split(" ")[0];
            if (names.containsKey(name)) {
                names.replace(name, names.get(name) + 1);
            } else {
                names.put(name, 1);
            }
        }

        TreeMap<Integer, List<String>> names2 = new TreeMap<>();
        for (String i : names.keySet()) {
            if (names2.containsKey(names.get(i))) {
                names2.get(names.get(i)).add(i);
            } else {
                List<String> list = new ArrayList<>();
                list.add(i);
                names2.put(names.get(i), list);
            }

        }
        return names2.descendingMap();
    }

}
