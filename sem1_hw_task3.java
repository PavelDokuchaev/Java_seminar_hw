/*Задание 3.
Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
Ответ: Такой операции нет */

import java.util.Scanner;

public class sem1_hw_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите число 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите операцию: ");
        String operator = scanner.next();

        int result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.print("Такой операции нет!");
                return;
        }

        System.out.println("Ответ: " + result);
        scanner.close();
    }
}
