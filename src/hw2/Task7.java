package hw2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        int duration = 10;

        double moscow = 4.15;
        double rostov = 1.98;
        double krasnodar = 2.69;
        double kirov = 5.0;

        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);

        int code = scanner.nextInt();

        switch (code) {
            case 905: {
                System.out.println("Стоимость " + duration + " минут разговора с Москвой: " + moscow * duration);
                break;
            }
            case 194: {
                System.out.println("Стоимость " + duration + " минут разговора с Ростовом: " + rostov * duration);
                break;
            }
            case 491: {
                System.out.println("Стоимость " + duration + " минут разговора с Краснодаром: " + krasnodar * duration);
                break;
            }
            case 800: {
                System.out.println("Стоимость " + duration + " минут разговора с Кировом: " + kirov * duration);
                break;
            }
        }
    }
}
