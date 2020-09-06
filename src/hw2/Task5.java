package hw2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        System.out.println("Введите три целых числа: ");
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int value = scanner.nextInt();
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Наименьшее из введенных чисел: " + min);
    }
}
