package hw4.squares;

public class Rectangle implements Shape {

    private Double a;
    private Double b;

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double square() {
        return a * b;
    }
}
