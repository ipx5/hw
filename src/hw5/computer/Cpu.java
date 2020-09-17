package hw5.computer;

public class Cpu {

    private String clockSpeed;
    private int coresNumber;
    private String cacheMemory;
    private String name;
    private String manufactorer;

    public Cpu(String clockSpeed, int coresNumber, String cacheMemory, String name, String manufactorer) {
        this.clockSpeed = clockSpeed;
        this.coresNumber = coresNumber;
        this.cacheMemory = cacheMemory;
        this.name = name;
        this.manufactorer = manufactorer;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "clockSpeed='" + clockSpeed + '\'' +
                ", coresNumber=" + coresNumber +
                ", cacheMemory='" + cacheMemory + '\'' +
                ", name='" + name + '\'' +
                ", manufactorer='" + manufactorer + '\'' +
                '}';
    }

    public void getCpu() {
        System.out.println(this.toString());
    }
}
