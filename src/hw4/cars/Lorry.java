package hw4.cars;

public class Lorry extends Car {

    private Double liftingCapacity;

    public Lorry(Double liftingCapacity, String brand, String variety, Double weight, Integer enginePower, String engineManufacturer) {
        super(brand, variety, weight, enginePower, engineManufacturer);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        super.autoInfo();
        System.out.println("Грузоподъёмность " + liftingCapacity);
        super.engineInfo();
    }
}
