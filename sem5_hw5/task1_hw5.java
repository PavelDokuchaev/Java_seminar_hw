/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/

package sem5_hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1_hw5 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Иванов");
        nameBook.put(1, "Петров");
        nameBook.put(2, "Сидоров");

        phoneBook.put(0, new ArrayList<String>());
        phoneBook.get(0).add("89271234567; 89271234568");
        phoneBook.put(1, new ArrayList<String>());
        phoneBook.get(1).add("891798765678");
        phoneBook.put(2, new ArrayList<String>());
        phoneBook.get(2).add("89371234587; 89273456568");

        System.out.println("Телефонная книга: ");
        for (int i = 0; i < nameBook.size(); i++) {
            System.out.println(nameBook.get(i) + ": " + phoneBook.get(i));
        }

    }

}
