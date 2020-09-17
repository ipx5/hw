package hw5.logger;

import hw5.logger.calc.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите первую цифру: ");
        Scanner a = new Scanner(System.in);
        double x = a.nextDouble();

        System.out.println("Введите вторую цифру: ");
        Scanner b = new Scanner(System.in);
        double y = b.nextDouble();

        System.out.println("Какую операцию выполнить? (+-/*)");
        Scanner sc = new Scanner(System.in);
        String operator;

        switch (sc.nextLine()) {
            case "+": {
                operator = "ADDITION";
                break;
            }
            case "-": {
                operator = "SUBTRACTION";
                break;
            }
            case "*": {
                operator = "MULTIPLICATION";
                break;
            }
            case "/": {
                operator = "DIVISION";
                break;
            }
            default:
                operator = null;
        }

        OperationType type = null;

        try {
            type = OperationType.valueOf(operator);

        } catch (Exception e) {
            System.out.println("Нет такого типа операции");
            System.exit(0);
        }

        Calculator operation = null;
        StringBuilder message = new StringBuilder();

        switch (type) {
            case ADDITION: {
                operation = new Addition();
                message.append(x + " + " + y) ;
                break;
            }
            case DIVISION: {
                operation = new Division();
                message.append(x + " / " + y);
                break;
            }
            case MULTIPLICATION: {
                operation = new Multiplication();
                message.append(x + " * " + y);
                break;
            }
            case SUBTRACTION: {
                operation = new Subtraction();
                message.append(x + " - " + y);
                break;
            }
        }

        if (operation != null) {
            double result = operation.Result(x, y);
            System.out.println("Результат: " + result);
            message.append(" = " + result);
            Logger logger = operation.calculate();
            logger.log(message.toString());
        }
    }
}