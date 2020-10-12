package hw4.cars;


public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[2];

        cars[0] = new SportCar(340.0, "McLaren", "S", 1188.0, 659, "McLaren");
        cars[1] = new Lorry(8500.0, "Volvo", "D", 5900.0, 460, "Volvo");

        for (Car car : cars) {
            System.out.printf("------------\n");
            car.printInfo();
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
            System.out.printf("------------\n");
        }
    }
}
