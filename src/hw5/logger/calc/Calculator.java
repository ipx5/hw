package hw5.logger.calc;

import hw5.logger.Logger;

public abstract class Calculator {

    public int x;
    public int y;

    public abstract Logger calculate();

    public abstract double Result(double x, double y);
}
