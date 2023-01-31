/*Создать список целых чисел (заполнить случайными числами).
Найти минимальное, максимальное и среднее из этого списка. */

package sem3_hw3;

import java.util.ArrayList;
import java.util.Random;

public class task2_hw3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
        Integer maxNum = list.get(0);
        Integer maxMin = list.get(0);
        Double sum = (double) 0;
        for (int i = 0; i < list.size(); i++) {
            // Integer mmaxNum = 0;
            if (maxNum < list.get(i)) {
                maxNum = list.get(i);
            }
            if (maxMin > list.get(i)) {
                maxMin = list.get(i);
            }
            sum += list.get(i);
        }
        double average = sum / list.size();

        System.out.println(list);
        System.out.println("Максимальное число: " + maxNum);
        System.out.println("Минимальное число: " + maxMin);
        System.out.println("Среднее число: " + average);
    }

}
