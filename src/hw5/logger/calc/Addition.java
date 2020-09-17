package hw5.logger.calc;

import hw5.logger.DbLogger;
import hw5.logger.Logger;

public class Addition extends Calculator {

    public Logger calculate() {
        return new DbLogger();
    }

    public double Result(double x, double y) {
        return x + y;
    }


}
