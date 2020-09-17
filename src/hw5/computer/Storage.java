package hw5.computer;

public class Storage {

    private String manufacturer;
    private String memory;
    private String type;
    private String formFactor;

    public Storage(String manufacturer, String memory, String type, String formFactor) {

        if (this.type == "SSD") {
            this.manufacturer = manufacturer;
            this.memory = memory;
            this.formFactor = formFactor;
        } else {
            this.manufacturer = manufacturer;
            this.memory = memory;
            this.formFactor = formFactor;
            this.type = "HDD";
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memory='" + memory + '\'' +
                ", type='" + type + '\'' +
                ", formFactor='" + formFactor + '\'' +
                '}';
    }

    public void getStorage() {
        System.out.println(this.toString());
    }
}
