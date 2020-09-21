package hw6.task1;

import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> stringArray = new ArrayList<>();

        int elementCount = 5;
        int deleteIndex = 2;
        int findIndex = 1;

        for (int i = 0; i < elementCount; i++) {
            stringArray.add(UUID.randomUUID().toString());
        }
        System.out.println("-------------");
        System.out.println("Размер коллекции: " + stringArray.size());
        System.out.println("элементы:");
        for (String x : stringArray) {
            System.out.print(x + "\n");
        }

        stringArray.remove(deleteIndex);

        System.out.println("-------------");
        System.out.println("Размер коллекции после удаления элемента по индексу: " + stringArray.size());
        System.out.println("элементы:");
        for (String x : stringArray) {
            System.out.print(x + "\n");
        }

        String deletedObject = stringArray.get(findIndex);
        stringArray.remove(deletedObject);

        System.out.println("-------------");
        System.out.println("Размер коллекции после удаления элемента по элементу: " + stringArray.size());
        System.out.println("элементы:");
        for (String x : stringArray) {
            System.out.print(x + "\n");
        }

        stringArray.clear();
        System.out.println("-------------");
        System.out.println("Размер коллекции после очистки: " + stringArray.size());
        for (String x : stringArray) {
            System.out.print(x + "\n");
        }
    }
}
