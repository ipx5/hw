package hw4.squares;

public class Triangle implements Shape {

    private Double a;
    private Double b;
    private Double c;
    private Double p;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        p = (a + b + c) / 2;
    }


    @Override
    public Double square() {
        if (correctFigure()) {
            return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
        } else {
            return null;
        }
    }

    private boolean correctFigure() {
        if (a >= b + c) {
            return false;
        } else if (b >= a + c) {
            return false;
        } else if (c >= a + b) {
            return false;
        } else {
            return true;
        }
    }
}
