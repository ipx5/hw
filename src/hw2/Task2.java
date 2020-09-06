package hw2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int sum = 0;

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        char[] digits = value.toCharArray();

        for (char digit : digits) {
            sum += Integer.parseInt(String.valueOf(digit));
        }

        System.out.println("Сумма цифр этого числа: " + sum);
    }
}
