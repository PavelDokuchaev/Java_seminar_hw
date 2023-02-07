/*Создать LinkedList целых чисел (заполнить случайными числами).
Реализуйте метод, который вернет “перевернутый” список. */

package sem4_hw4;

import java.util.LinkedList;
import java.util.Random;

public class task1_hw4 {

    static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.addFirst(list.remove(i));
        }
        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list);
        System.out.println(reverse(list));
    }

}
