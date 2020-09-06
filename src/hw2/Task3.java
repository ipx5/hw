package hw2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        if (value > 0) {
            value++;
            System.out.println("Инкремент положительного числа: " + value);
        } else {
            System.out.println("Вы ввели число: " + value);
        }

    }
}
