package hw2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int lastDigit = scanner.nextInt() % 10;
        System.out.println("Последняя цифра введенного числа: " + lastDigit);

    }
}
