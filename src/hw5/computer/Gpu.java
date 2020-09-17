package hw5.computer;

public class Gpu {

    private String manufacturer;
    private String memoryType;
    private String memory;
    private String coolingType;

    public Gpu(String manufacturer, String memoryType, String memory, String coolingType) {

        if (this.coolingType == "Active") {
            this.manufacturer = manufacturer;
            this.memoryType = memoryType;
            this.memory = memory;

        } else {
            this.manufacturer = manufacturer;
            this.memoryType = memoryType;
            this.memory = memory;
            this.coolingType = "Passive";
        }
    }

    @Override
    public String toString() {
        return "Gpu{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", memory='" + memory + '\'' +
                ", coolingType='" + coolingType + '\'' +
                '}';
    }

    public void getGpu() {
        System.out.println(this.toString());
    }
}