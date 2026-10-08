package graphattributecalculator;

public interface Shape {
    double area();
    double perimeter();

    default void describe() {
        System.out.printf("面积：%.2f，周长：%.2f\n", area(), perimeter());
    }
}
