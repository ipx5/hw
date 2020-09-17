package hw5.logger.calc;

import hw5.logger.ConsoleLogger;
import hw5.logger.Logger;

public class Subtraction extends Calculator {

    public Logger calculate() {
        return new ConsoleLogger();
    }

    public double Result(double x, double y) {
        return x - y;
    }
}
