package hw3.animal;

public class Veterinarian extends Animal {

    public void treatAnimal(Animal animal) {
        System.out.println(animal.getClass().getSimpleName()
                + " eat " + animal.getFood()
                + ", location " + animal.getLocation());
    }
}
