package hw6.task2;

import java.util.ArrayList;

public class Box {

    private ArrayList<Fruit> fruitArrayList;

    public Box() {
        this.fruitArrayList = new ArrayList<Fruit>();
    }

    public boolean checkEmptyBox() {
        return (this.fruitArrayList.size() == 0);
    }

    public boolean checkBox(Fruit fruit) {
        return (this.fruitArrayList.get(0).getClass() == fruit.getClass());
    }

    public void addFruit(Fruit fruit) {
        if (this.checkEmptyBox()) {
            this.fruitArrayList.add(fruit);
        } else {
            if (this.checkBox(fruit)) {
                this.fruitArrayList.add(fruit);
            } else {
                System.out.println("В коробке есть другие фрукты");
                System.out.println("------------");
            }
        }
    }

    public float getWeight() {
        float total_weight = 0.0f;
        for (Fruit fruit : this.fruitArrayList) {
            total_weight = total_weight + fruit.getWeight();
        }
        return total_weight;
    }

    public void printBox() {
        for (Fruit fruit : fruitArrayList) {
            System.out.print(fruit + ": ");
            fruit.printInfo();
        }
        System.out.println();
    }

    public boolean compare(Box box) {
        return (this.getWeight() == box.getWeight());
    }

    public void moveFruit(Box box) {
        if (box.checkEmptyBox()) {
            box.fruitArrayList.addAll(this.fruitArrayList);
            this.fruitArrayList.clear();
        } else {
            if (this.fruitArrayList.get(0).getClass() == box.fruitArrayList.get(0).getClass()) {
                box.fruitArrayList.addAll(this.fruitArrayList);
                this.fruitArrayList.clear();
            } else {
                System.out.println("В коробках лежат разные фрукты");
                System.out.println("------------");
            }
        }
    }
}
