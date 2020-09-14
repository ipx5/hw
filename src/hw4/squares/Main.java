package hw4.squares;

public class Main {

    public static void main(String[] args) {

        Shape[] shape = new Shape[3];

        shape[0] = new Triangle(3.0, 4.0, 5.0);
        shape[1] = new Circle(4.2);
        shape[2] = new Rectangle(1.4, 8.8);

        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}
