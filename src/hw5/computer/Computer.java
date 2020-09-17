package hw5.computer;

public class Computer {

    private Cpu cpu;
    private Gpu gpu;
    private Ram ram;
    private Storage storage;
    private Monitor monitor;

    public void turnOn() {
        System.out.printf("Computer is turns on...\n");
        this.cpu = new Cpu("2500MHz", 4, "1024", "I5", "Intel");
        this.monitor = new Monitor(21, "HP");
        this.ram = new Ram("Samsung", "8Gb", "1600MHz", "DDR4");
        this.storage = new Storage("WD", "128Gb", "HDD", "2.5");
        this.gpu = new Gpu("Nvidia", "GDDR5X", "12Gb", "Passive");
    }

    public void testing() {
        System.out.printf("Computer testing...\n");
        cpu.getCpu();
        monitor.getMonitor();
        ram.getRam();
        storage.getStorage();
        this.gpu.getGpu();
    }

    public void shutDown() {
        System.out.printf("Computer is turns off...\n");
    }
}
