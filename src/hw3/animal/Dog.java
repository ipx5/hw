package hw3.animal;

public class Dog extends Animal {

    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("The dog eating bones.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
