package hw3.animal;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal() {
    }

    public void makeNoise() {
        System.out.println("The animal is making noise.");
    }

    public void eat() {
        System.out.println("The animal is eats.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
