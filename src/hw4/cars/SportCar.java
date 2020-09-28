package hw4.cars;

public class SportCar extends Car {

    private double maxSpeed;

    public SportCar(double maxSpeed, String brand, String variety, double weight, int enginePower, String engineManufacturer) {
        super(brand, variety, weight, enginePower, engineManufacturer);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        super.autoInfo();
        System.out.println("Максимальная скорость " + maxSpeed);
        super.engineInfo();
    }
}
