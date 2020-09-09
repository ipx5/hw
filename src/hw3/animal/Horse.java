package hw3.animal;

public class Horse extends Animal {

    private int age;

    public Horse(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    public Horse(int age) {
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("The horse neigh.");
    }

    @Override
    public void eat() {
        System.out.println("The horse eating hay.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
