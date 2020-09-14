package hw4.cars;

public class Engine {

    private Integer power;
    private String manufacturer;

    public Engine(Integer power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public Integer getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
