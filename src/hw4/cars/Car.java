package hw4.cars;

public abstract class Car {

    private String brand;
    private String variety;
    private Double weight;
    private Engine engine;

    public Car(String brand, String variety, Double weight, Integer enginePower, String engineManufacturer) {
        this.brand = brand;
        this.variety = variety;
        this.weight = weight;
        this.engine = new Engine(enginePower, engineManufacturer);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public String getBrand() {
        return brand;
    }

    public String getClas() {
        return variety;
    }

    public Double getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void autoInfo()  {
        System.out.println("Информация о автомобиле:");
        System.out.println("Марка " + brand);
        System.out.println("Класс " + variety);
        System.out.println("Вес " + weight);
    }

    public void engineInfo()    {
        System.out.println("Информация о двигателе:");
        System.out.println("Мощность " + engine.getPower());
        System.out.println("Производитель " + engine.getManufacturer());
    }
}
