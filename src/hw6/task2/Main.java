package hw6.task2;

public class Main {

    public static void main(String[] args) {

        Fruit apple = new Apple();
        Fruit apple1 = new Apple(1.5f);
        Fruit apple2 = new Apple(2.0f);

        Fruit orange = new Orange();
        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();

        Box box_apple = new Box();
        Box box_orange = new Box();
        Box box_empty = new Box();

        box_apple.addFruit(apple);
        box_apple.addFruit(apple1);
        box_apple.addFruit(apple2);

        System.out.println("В коробке лежат: ");
        box_apple.printBox();
        box_apple.addFruit(orange);

        box_orange.addFruit(orange);
        box_orange.addFruit(orange1);
        box_orange.addFruit(orange2);

        System.out.println("В коробке лежат: ");
        box_orange.printBox();
        box_orange.addFruit(apple);

        System.out.println("Вес коробки с яблоками: " + box_apple.getWeight());

        System.out.println("Вес коробки с апельсинами: " + box_orange.getWeight());

        if (box_apple.compare(box_orange)) {
            System.out.println("Вес коробок одинаковый");
            System.out.println("------------");
        } else {
            System.out.println("Коробки разного веса");
            System.out.println("------------");
        }

        System.out.println("Из коробки с яблоками пересыпаем в коробку с апельсинами");
        box_apple.moveFruit(box_orange);

        System.out.println("Из коробки с яблоками пересыпаем в пустую коробку");
        box_apple.moveFruit(box_empty);

        System.out.println("Коробка из которой высыпали");
        box_apple.printBox();

        System.out.println("Пустая коробка теперь с яблоками");
        box_empty.printBox();

        System.out.println("Из коробки с апельсинами пересыпаем в коробку с яблоками");
        box_orange.moveFruit(box_empty);

        System.out.println("Из коробки с апельсинами пересыпаем в пустую коробку из-под яблок");
        box_orange.moveFruit(box_apple);

        System.out.println("\nПустая коробка из-под яблок теперь с апельсинами");
        box_apple.printBox();

        System.out.println("Пустая коробка из-под апельсинов");
        box_orange.printBox();

        System.out.println("Ранее пустая коробка теперь с яблоками");
        box_empty.printBox();
    }
}
