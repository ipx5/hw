package hw5.computer;

public class Monitor {

    private int diagonal;
    String manufacturer;

    public Monitor(int diagonal, String manufacturer) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public void getMonitor() {
        System.out.println(this.toString());
    }
}
