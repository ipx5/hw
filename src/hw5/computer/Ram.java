package hw5.computer;

public class Ram {

    private String manufacturer;
    private String memory;
    private String clockSpeed;
    private String type;

    public Ram(String manufacturer, String memory, String clockSpeed, String type) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.clockSpeed = clockSpeed;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memory='" + memory + '\'' +
                ", clockSpeed='" + clockSpeed + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void getRam() {
        System.out.println(this.toString());
    }
}
