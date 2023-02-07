/*Создать очередь с помощью LinkedList и реализовать следующие методы:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
Вызвать полученные методы и убедиться в их работоспособности.

 */

package sem4_hw4;

import java.util.LinkedList;
import java.util.Queue;

public class task2_hw4 {

    static void dequeue(LinkedList<Integer> queue) {

        System.out.println("Первый элемент очереди: " + queue.getFirst());
        queue.removeFirst();
        System.out.println("Первый элемент очереди удален: " + queue);
    }

    static void first(LinkedList<Integer> queue) {

        System.out.println("Первый элемент очереди: " + queue.getFirst());
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.add(2);
        queue.add(5);
        System.out.println(queue);
        dequeue((LinkedList<Integer>) queue);
        first((LinkedList<Integer>) queue);
    }

}
