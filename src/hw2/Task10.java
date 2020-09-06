package hw2;

public class Task10 {

    public static void main(String[] args) {

        int[] array = new int[]{5, 10, 0, -6, 5, 3, 0, -34, 0, 32, 56, 0, 24, -52};

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                for (int j = i; j < array.length - 1 && array[j + 1] != 0; j++) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
            }
        }
        for (int el : array) {
            System.out.println(el);
        }
    }
}
