package hw3.animal;

public class Cat extends Animal {

    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat meows.");
    }

    @Override
    public void eat() {
        System.out.println("The dog eating fish.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
