package hw5.logger.calc;

import hw5.logger.FileLogger;
import hw5.logger.Logger;

public class Multiplication extends Calculator {

    public Logger calculate() {
        return new FileLogger();
    }

    public double Result(double x, double y) {
        return x * y;
    }
}
