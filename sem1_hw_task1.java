import java.util.Scanner;

/*Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n */

public class sem1_hw_task1 {
    static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите целое число: ");
            int userNumber = Integer.parseInt(iScanner.nextLine());
            System.out.println("Сумма чисел от 1 до равна: " + sum(userNumber));
            System.out.println("Факториал числа равен: " + factorial(userNumber));
            iScanner.close();
        } catch (Exception e) {
            System.out.println("Ошибка ввода, введите целое число!");
        }
    }
}
