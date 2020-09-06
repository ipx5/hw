package hw2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        String desc = "Вы ввели ";

        System.out.println("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        if (value == 0) {
            desc += "нулевое ";
        } else {
            if (value > 0) {
                desc += "положительное ";
            } else {
                desc += "отрицательное ";
            }
            if (value % 2 == 0) {
                desc += "четное ";
            } else {
                desc += "нечетное ";
            }
        }
        System.out.println(desc + "число");
    }
}
