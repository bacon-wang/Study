package example;

public interface Swimmable {
    void swim();
    default void move() {
        System.out.println("swim move");
    }
}
