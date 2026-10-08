package graphattributecalculator;

public class Circle implements Shape, Resizeable {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void scale(double factor) {
        this.r *= factor;
    }
}
