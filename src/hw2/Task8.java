package hw2;

public class Task8 {

    public static void main(String[] args) {

        int[] array = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        System.out.println("Максимальное значение " + getMaxValue(array));
        System.out.println("Сумма положительных элементов " + getSumPositive(array));
        System.out.println("Сумма чётных отрицательных элементов " + getSumEvenNegative(array));
        System.out.println("Количество положительных элементов " + getCountPositive(array));
        System.out.println("Среднее арифметическое отрицательных элементов " + getArithmeticMeanNegative(array));
    }

    private static int getMaxValue(int[] array) {

        int max = array[0];
        for (int el : array) {
            if (el <= max) {
                continue;
            }
            max = el;
        }

        return max;
    }

    private static int getSumEvenNegative(int[] array) {

        int sum = 0;
        for (int el : array) {
            if (el % 2 == 0 && el < 0) {
                sum += el;
            }
        }

        return sum;
    }

    private static int getSumPositive(int[] array) {

        int sum = 0;
        for (int el : array) {
            if (el > 0) {
                sum += el;
            }
        }

        return sum;
    }

    private static int getCountPositive(int[] array) {

        int count = 0;
        for (int el : array) {
            if (el > 0) {
                count++;
            }
        }

        return count;

    }

    private static double getArithmeticMeanNegative(int[] array) {

        int sum = 0;
        double count = 0;
        for (int el : array) {
            if (el < 0) {
                sum += el;
                count++;
            }
        }

        return sum / count;
    }
}
