package example;

public interface Walkable {
    void walk();
    default void move() {
        System.out.println("walk move");
    }
}
