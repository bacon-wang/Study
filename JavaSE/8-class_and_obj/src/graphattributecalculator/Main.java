package graphattributecalculator;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(1), new Triangle(3, 4, 5), new Rectangle(2, 4)};

        for (Shape shape : shapes) {
            shape.describe();
            if (shape instanceof Circle) {
                ((Circle) shape).scale(2.0);
                shape.describe();
            }
        }

    }
}
