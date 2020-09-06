package hw2;

public class Task9 {

    public static void main(String[] args) {

        int[] array = new int[]{15, 10, 51, -6, -5, 3, -10, 34, 0, 32, 56, -12, 24, -52};

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}