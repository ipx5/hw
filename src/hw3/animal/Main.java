package hw3.animal;

public class Main {
    public static void main(String[] args) {

        Veterinarian vet = new Veterinarian();
        Animal cat = new Cat("fish", "house", "white");
        Animal dog = new Dog("bones", "kennel", "shepherd");
        Animal horse = new Horse("hay", "stable", 5);

        Animal[] animals = new Animal[]{cat, dog, horse};

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}
