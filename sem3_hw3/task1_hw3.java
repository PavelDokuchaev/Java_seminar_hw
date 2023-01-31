/*Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа. */

package sem3_hw3;

import java.util.ArrayList;
import java.util.Random;

public class task1_hw3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) {
                list2.add(x);
            }
            System.out.println(list);
            System.out.println(list2);
        }
    }
}
