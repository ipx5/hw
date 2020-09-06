package hw2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        if (value > 0) {
            value++;
            System.out.println("Инкремент положительного числа: " + value);
        } else if (value < 0) {
            value -= 2;
            System.out.println("Декремент отрицательного числа: " + value);
        } else if (value == 0) {
            value = 10;
            System.out.println("Результат замены: " + value);
        }
    }
}
